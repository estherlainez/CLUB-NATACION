package com.example.appsport.vista;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
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
    int idC;
    MenuItem action_add_newEntreanmiento,action_entrenamientos_ver,action_profesionales_ver;
    ClienteController cc= new ClienteController();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);
        action_add_newEntreanmiento=(MenuItem)findViewById(R.id.action_add_new_entrenamiento);
        action_entrenamientos_ver=(MenuItem)findViewById(R.id.action_entrenamientos_ver);
        action_profesionales_ver=(MenuItem)findViewById(R.id.action_profesionales_ver);


        idCliente=(TextView) findViewById(R.id.textIdCliente);
        nombreCliente=(TextView) findViewById(R.id.textNombre);
        dniCliente=(TextView)findViewById(R.id.textDni);

        Bundle datos = this.getIntent().getExtras();
        idC = datos.getInt("idCliente");
        System.out.println("id " + idC);
        Cliente c=cc.datosCliente(idC);

        nombreCliente.setText(c.getNombreApellidosCliente());
        dniCliente.setText(c.getDniCliente());
    }

    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.menu_opciones,menu);
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem item){
        int id=item.getItemId();
        if(id==R.id.action_add_new_entrenamiento){
            Toast.makeText(this,"opcion 1",Toast.LENGTH_SHORT).show();
            Intent intent=new Intent(this, NuevoEntrenamientoActivity.class);
            intent.putExtra("idCliente",idC);
            System.out.println("id "+idC);
            startActivity(intent);
        }else if(id==R.id.action_entrenamientos_ver){
            Toast.makeText(this,"opcion 2",Toast.LENGTH_SHORT).show();
        }else if(id==R.id.action_profesionales_ver){
            Toast.makeText(this,"opcion 3",Toast.LENGTH_SHORT).show();
        }

        return super.onOptionsItemSelected(item);
    }

    public void show(View v) {
        getSupportActionBar().show();


    }
    public void hide(View v){
        getSupportActionBar().hide();
    }




}