package com.example.appsport.vista;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.appsport.R;
import com.example.appsport.controller.ClienteController;
import com.example.appsport.controller.Conexion;
import com.example.appsport.modelo.Cliente;
import com.example.appsport.vista.PrincipalActivity;

public class MainActivity extends AppCompatActivity {
    ClienteController cc= new ClienteController();
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
        Cliente cliente = cc.comprobarCliente(direccionEmail,passUsuario);
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





}