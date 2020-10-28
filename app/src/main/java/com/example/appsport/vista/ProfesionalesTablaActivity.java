package com.example.appsport.vista;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.GridView;

import com.example.appsport.R;

public class ProfesionalesTablaActivity extends AppCompatActivity {

    GridView grid;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profesionales_tabla);
        grid=(GridView)findViewById(R.id.gridViewProfesionales);

    }
}