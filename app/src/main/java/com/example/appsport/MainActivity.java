package com.example.appsport;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.StrictMode;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.appsport.dummy.Cliente;
import com.example.appsport.dummy.Conexion;
import com.example.appsport.dummy.PrincipalActivity;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class MainActivity extends AppCompatActivity {
    EditText etEmail,etPass;
    Button consultar;
    TextView nombre;
    Conexion c= new Conexion();
    String direccionEmail, passUsuario;
    String usuario, clave,mensaje;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        etEmail=(EditText)findViewById(R.id.etEmail);
        etPass=(EditText)findViewById(R.id.etPass);
        consultar=(Button)findViewById(R.id.btnAceso);
    }

    public void login(View view) {
        direccionEmail=etEmail.getText().toString();
        System.out.println("++++++"+direccionEmail);

        passUsuario=etPass.getText().toString();
        System.out.println("++++++"+passUsuario);
        Cliente cliente = comprobarCliente(direccionEmail,passUsuario);
        int idCliente=cliente.getIdCliente();
        String nombreC=cliente.getNombreApellidosCliente().toString();

        if(c!=null){
            Intent intent=new Intent(this, PrincipalActivity.class);
            intent.putExtra("idCliente",idCliente);
            System.out.println("id "+idCliente);
            startActivity(intent);

        }else{
            Toast.makeText(this,"Incorrecta identificacion",Toast.LENGTH_LONG).show();
        }
    }




    public Cliente comprobarCliente(String usuario, String pass)  {
        String sql="select idCliente,nombreApellidosCliente,dniCliente,telefonoCliente, emailCliente, passCliente from clientes where clientes.emailCliente=? AND clientes.passCliente=?";
        Cliente cliente=null;
        try {
            PreparedStatement ps=c.conexion().prepareStatement(sql);
            ps.setString(1, usuario);
            ps.setString(2, pass);
            ResultSet rs=ps.executeQuery();

            while(rs.next()) {
                int id=rs.getInt("idCliente");
                String nc=rs.getString("nombreApellidosCliente");
                String dc=rs.getString("dniCliente");
                String tc=rs.getString("telefonoCliente");
                String ec=rs.getString("emailCliente");
                String pc=rs.getString("passCliente");
                cliente = new Cliente(id,nc,dc,tc,ec,pc);

            }
            rs.close();
            ps.close();
            return cliente;
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }


        return null;


    }
}