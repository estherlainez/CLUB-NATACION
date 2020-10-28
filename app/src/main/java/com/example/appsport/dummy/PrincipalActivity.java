package com.example.appsport.dummy;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

import com.example.appsport.R;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class PrincipalActivity extends AppCompatActivity {
    TextView idCliente, nombreCliente, dniCliente;
    Conexion c= new Conexion();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);
        idCliente=(TextView) findViewById(R.id.textIdCliente);
        nombreCliente=(TextView) findViewById(R.id.textNombre);
        dniCliente=(TextView)findViewById(R.id.textDni);

        Bundle datos = this.getIntent().getExtras();
        int idC = datos.getInt("idCliente");
        System.out.println("id " + idC);
        Cliente c=datosCliente(idC);

        nombreCliente.setText(c.getNombreApellidosCliente());
        dniCliente.setText(c.getDniCliente());
    }

    public Cliente datosCliente (int idCliente){
        String sql="select * from clientes where clientes.idCliente=?";
        try {
            PreparedStatement ps=c.conexion().prepareStatement(sql);
            ps.setInt(1, idCliente);
            ResultSet rs=ps.executeQuery();
            Cliente cliente=new Cliente();
            while(rs.next()) {
                int ic=rs.getInt("idCliente");
                String nc=rs.getString("nombreApellidosCliente");
                String dc=rs.getString("dniCliente");

                cliente = new Cliente(ic,nc,dc);
            }
            rs.close();
            ps.close();
            return cliente;
        } catch (SQLException e) {
            // TODO Auto-generated catch bloc
            e.printStackTrace();
        }
        return null;
    }
}