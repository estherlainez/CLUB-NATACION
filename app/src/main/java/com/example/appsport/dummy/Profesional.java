package com.example.appsport.dummy;

public class Profesional {
    private int idProfesional;
    private String nombreProfesional;
    private String emailProfesional;
    private String telefonoProfesional;
    private String passProfesional;

    public Profesional() {
    }

    public Profesional(int idProfesional, String nombreProfesional, String emailProfesional, String telefonoProfesional, String passProfesional) {
        this.idProfesional = idProfesional;
        this.nombreProfesional = nombreProfesional;
        this.emailProfesional = emailProfesional;
        this.telefonoProfesional = telefonoProfesional;
        this.passProfesional = passProfesional;
    }

    public Profesional(String nombreProfesional, String emailProfesional, String telefonoProfesional) { ;
        this.nombreProfesional = nombreProfesional;
        this.emailProfesional = emailProfesional;
        this.telefonoProfesional = telefonoProfesional;
    }

    public int getIdProfesional() {
        return idProfesional;
    }

    public void setIdProfesional(int idProfesional) {
        this.idProfesional = idProfesional;
    }

    public String getNombreProfesional() {
        return nombreProfesional;
    }

    public void setNombreProfesional(String nombreProfesional) {
        this.nombreProfesional = nombreProfesional;
    }

    public String getEmailProfesional() {
        return emailProfesional;
    }

    public void setEmailProfesional(String emailProfesional) {
        this.emailProfesional = emailProfesional;
    }

    public String getTelefonoProfesional() {
        return telefonoProfesional;
    }

    public void setTelefonoProfesional(String telefonoProfesional) {
        this.telefonoProfesional = telefonoProfesional;
    }

    public String getPassProfesional() {
        return passProfesional;
    }

    public void setPassProfesional(String passProfesional) {
        this.passProfesional = passProfesional;
    }
}
