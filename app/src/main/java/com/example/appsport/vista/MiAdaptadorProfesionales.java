package com.example.appsport.vista;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.example.appsport.modelo.Profesional;

import java.util.List;

public class MiAdaptadorProfesionales extends ArrayAdapter<Profesional> {
    Context ctx;
    int layoutTemplate;
    List<Profesional>profesionalesList;
    public MiAdaptadorProfesionales(@NonNull Context context, int resource, @NonNull List<Profesional> objects) {
        super(context, resource, objects);
        this.ctx=context;
        this.layoutTemplate=resource;
        this.profesionalesList=objects;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View v= LayoutInflater.from(ctx).inflate(layoutTemplate,parent,false);
        //obtener la informacion del elemento de la lista
        Profesional elementoActual=profesionalesList.get(position);

        //rescatar los elementos de la interfaz de usuario
        //TextView textViewNombre=v.findViewById(R.id.textNombreProfesional);
        //TextView textViewEmail=v.findViewById(R.id.textEmailProfesional);
        //TextView textViewTelefono=v.findViewById(R.id.textTelefonoProfesional);

        //hacer un set de la info del elemento actual;
        //textViewNombre.setText(elementoActual.getNombreProfesional());
        //textViewEmail.setText(elementoActual.getEmailProfesional());
        //textViewTelefono.setText(elementoActual.getTelefonoProfesional());

        return v;
    }
}
