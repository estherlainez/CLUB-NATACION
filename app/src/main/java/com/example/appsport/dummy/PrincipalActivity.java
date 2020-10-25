package com.example.appsport.dummy;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Build;
import android.os.Bundle;
import android.widget.TextView;

import com.example.appsport.R;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;

public class PrincipalActivity extends AppCompatActivity {
    TextView etIdCliente;
    Conexion c= new Conexion();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);

        Bundle datos=this.getIntent().getExtras();
        int idC=datos.getInt("idCliente");
        System.out.println("id "+idC);


    }


}