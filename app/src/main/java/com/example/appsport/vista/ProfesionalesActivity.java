package com.example.appsport.vista;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import com.example.appsport.R;
import com.example.appsport.modelo.Profesional;

import java.util.ArrayList;
import java.util.List;

public class ProfesionalesActivity extends AppCompatActivity {
    ListView lista;
    List<Profesional> profesionalList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profesionales);
        lista=(ListView)findViewById(R.id.listViewProfesionales);
        profesionalList=new ArrayList<>();
        profesionalList.add(new Profesional(1,"Marimar","marimargargallo@gmail.com","666555444","admin"));
        profesionalList.add(new Profesional(2,"Yolanda","yolandamagallon@gmail.com","666777888","admin"));
        profesionalList.add(new Profesional(3,"Bea","beaVillanueva@gmail.com","654321234","admin"));
        profesionalList.add(new Profesional(4,"Ruben","rubengarcia@gmail.com","690987654","admin"));

        MiAdaptadorProfesionales adaptadorProfesionales= new MiAdaptadorProfesionales(
                this,
                R.layout.profesional_item,
                profesionalList

        );
        lista.setAdapter(adaptadorProfesionales);
    }
}