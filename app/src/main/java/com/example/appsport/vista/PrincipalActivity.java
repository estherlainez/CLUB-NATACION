package com.example.appsport.vista;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.TextView;
import android.widget.Toast;

import com.example.appsport.R;
import com.example.appsport.controller.ClienteController;
import com.example.appsport.controller.Conexion;
import com.example.appsport.modelo.Cliente;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class PrincipalActivity extends AppCompatActivity {
    TextView idCliente, nombreCliente, dniCliente;
    ClienteController cc= new ClienteController();

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
        Cliente c=cc.datosCliente(idC);

        nombreCliente.setText(c.getNombreApellidosCliente());
        dniCliente.setText(c.getDniCliente());
    }

    public boolean onCreateOptionsMenu(Menu menu){
        MenuInflater inflater=getMenuInflater();
        inflater.inflate(R.menu.menu_opciones, menu);
        return true;
    }

    public boolean onOptionsItenSelected(MenuItem item){
        switch(item.getItemId()){
            case R.id.action_add_new_entrenamiento:
                Toast.makeText(this,"NUEVO ENTRENAMIENTO",Toast.LENGTH_SHORT).show();
                return true;
            case R.id.action_entrenamientos_ver:
                Toast.makeText(this,"VER ENTRENAMIENTOS",Toast.LENGTH_SHORT).show();
                return true;
            case R.id.action_profesionales_ver:
                Toast.makeText(this,"PROFESIONALES",Toast.LENGTH_SHORT).show();
            default:
                return super.onOptionsItemSelected(item);
        }
    }




}