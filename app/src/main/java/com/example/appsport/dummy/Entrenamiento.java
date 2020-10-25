package com.example.appsport.dummy;

import java.util.Date;

public class Entrenamiento {
    private int idEntrenamiento;
    private int idCliente;
    private Date fechaEntrenamiento;
    private float distanciaEntrenamiento;
    private float duracionEntrenamiento;
    private float ritmoEntrenamiento;
    private String estilosEntrenamiento;

    public Entrenamiento() {
    }

    public Entrenamiento(int idCliente, Date fechaEntrenamiento, float distanciaEntrenamiento, float duracionEntrenamiento, float ritmoEntrenamiento, String estilosEntrenamiento) {
        this.idCliente = idCliente;
        this.fechaEntrenamiento = fechaEntrenamiento;
        this.distanciaEntrenamiento = distanciaEntrenamiento;
        this.duracionEntrenamiento = duracionEntrenamiento;
        this.ritmoEntrenamiento = ritmoEntrenamiento;
        this.estilosEntrenamiento = estilosEntrenamiento;
    }

    public Entrenamiento(int idEntrenamiento, int idCliente, Date fechaEntrenamiento, float distanciaEntrenamiento, float duracionEntrenamiento, float ritmoEntrenamiento, String estilosEntrenamiento) {
        this.idEntrenamiento = idEntrenamiento;
        this.idCliente = idCliente;
        this.fechaEntrenamiento = fechaEntrenamiento;
        this.distanciaEntrenamiento = distanciaEntrenamiento;
        this.duracionEntrenamiento = duracionEntrenamiento;
        this.ritmoEntrenamiento = ritmoEntrenamiento;
        this.estilosEntrenamiento = estilosEntrenamiento;
    }

    public int getIdEntrenamiento() {
        return idEntrenamiento;
    }

    public void setIdEntrenamiento(int idEntrenamiento) {
        this.idEntrenamiento = idEntrenamiento;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public Date getFechaEntrenamiento() {
        return fechaEntrenamiento;
    }

    public void setFechaEntrenamiento(Date fechaEntrenamiento) {
        this.fechaEntrenamiento = fechaEntrenamiento;
    }

    public float getDistanciaEntrenamiento() {
        return distanciaEntrenamiento;
    }

    public void setDistanciaEntrenamiento(float distanciaEntrenamiento) {
        this.distanciaEntrenamiento = distanciaEntrenamiento;
    }

    public float getDuracionEntrenamiento() {
        return duracionEntrenamiento;
    }

    public void setDuracionEntrenamiento(float duracionEntrenamiento) {
        this.duracionEntrenamiento = duracionEntrenamiento;
    }

    public float getRitmoEntrenamiento() {
        return ritmoEntrenamiento;
    }

    public void setRitmoEntrenamiento(float ritmoEntrenamiento) {
        this.ritmoEntrenamiento = ritmoEntrenamiento;
    }

    public String getEstilosEntrenamiento() {
        return estilosEntrenamiento;
    }

    public void setEstilosEntrenamiento(String estilosEntrenamiento) {
        this.estilosEntrenamiento = estilosEntrenamiento;
    }
}
