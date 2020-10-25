package com.example.appsport.dummy;

import java.util.Date;

public class Cliente {
    private int idCliente;
    private String nombreApellidosCliente;
    private Date fechaNacCliente;
    private String lugarNacimientoCliente;
    private String direccionCliente;
    private String dniCliente;
    private String telefonoCliente;
    private String colegioCliente;
    private int numeroGir;
    private String emailCliente;
    private String passCliente;
    private Boolean socioPolideportivoPiscina;
    private String mesInicio;
    private int  idTarifa;
    private Boolean competirZaragoza;
    private String titularCuentaCliente;
    private String numeroCuentaCliente;
    private String modalidadCliente;

    public Cliente(int idCliente, String nombreApellidosCliente, Date fechaNacCliente, String lugarNacimientoCliente, String direccionCliente, String dniCliente, String telefonoCliente, String colegioCliente, int numeroGir, String emailCliente, String passCliente, Boolean socioPolideportivoPiscina, String mesInicio, int idTarifa, Boolean competirZaragoza, String titularCuentaCliente, String numeroCuentaCliente, String modalidadCliente) {
        this.idCliente = idCliente;
        this.nombreApellidosCliente = nombreApellidosCliente;
        this.fechaNacCliente = fechaNacCliente;
        this.lugarNacimientoCliente = lugarNacimientoCliente;
        this.direccionCliente = direccionCliente;
        this.dniCliente = dniCliente;
        this.telefonoCliente = telefonoCliente;
        this.colegioCliente = colegioCliente;
        this.numeroGir = numeroGir;
        this.emailCliente = emailCliente;
        this.passCliente = passCliente;
        this.socioPolideportivoPiscina = socioPolideportivoPiscina;
        this.mesInicio = mesInicio;
        this.idTarifa = idTarifa;
        this.competirZaragoza = competirZaragoza;
        this.titularCuentaCliente = titularCuentaCliente;
        this.numeroCuentaCliente = numeroCuentaCliente;
        this.modalidadCliente = modalidadCliente;
    }

    public Cliente(String nombreApellidosCliente, Date fechaNacCliente, String direccionCliente, String dniCliente, String telefonoCliente, String emailCliente, String passCliente, Boolean socioPolideportivoPiscina, String mesInicio, int idTarifa) {
        this.nombreApellidosCliente = nombreApellidosCliente;
        this.fechaNacCliente = fechaNacCliente;
        this.direccionCliente = direccionCliente;
        this.dniCliente = dniCliente;
        this.telefonoCliente = telefonoCliente;
        this.emailCliente = emailCliente;
        this.passCliente = passCliente;
        this.socioPolideportivoPiscina = socioPolideportivoPiscina;
        this.mesInicio = mesInicio;
        this.idTarifa = idTarifa;
    }

    public Cliente(int idCliente,String nombreCliente, String dniCliente,
                    String telefonoCliente, String emailCliente, String passCliente) {
        super();
        this.idCliente=idCliente;
        this.nombreApellidosCliente = nombreCliente;
        this.dniCliente = dniCliente;
        this.telefonoCliente = telefonoCliente;
        this.emailCliente = emailCliente;
        this.passCliente = passCliente;
    }

    public Cliente() {
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public String getNombreApellidosCliente() {
        return nombreApellidosCliente;
    }

    public void setNombreApellidosCliente(String nombreApellidosCliente) {
        this.nombreApellidosCliente = nombreApellidosCliente;
    }

    public Date getFechaNacCliente() {
        return fechaNacCliente;
    }

    public void setFechaNacCliente(Date fechaNacCliente) {
        this.fechaNacCliente = fechaNacCliente;
    }

    public String getLugarNacimientoCliente() {
        return lugarNacimientoCliente;
    }

    public void setLugarNacimientoCliente(String lugarNacimientoCliente) {
        this.lugarNacimientoCliente = lugarNacimientoCliente;
    }

    public String getDireccionCliente() {
        return direccionCliente;
    }

    public void setDireccionCliente(String direccionCliente) {
        this.direccionCliente = direccionCliente;
    }

    public String getDniCliente() {
        return dniCliente;
    }

    public void setDniCliente(String dniCliente) {
        this.dniCliente = dniCliente;
    }

    public String getTelefonoCliente() {
        return telefonoCliente;
    }

    public void setTelefonoCliente(String telefonoCliente) {
        this.telefonoCliente = telefonoCliente;
    }

    public String getColegioCliente() {
        return colegioCliente;
    }

    public void setColegioCliente(String colegioCliente) {
        this.colegioCliente = colegioCliente;
    }

    public int getNumeroGir() {
        return numeroGir;
    }

    public void setNumeroGir(int numeroGir) {
        this.numeroGir = numeroGir;
    }

    public String getEmailCliente() {
        return emailCliente;
    }

    public void setEmailCliente(String emailCliente) {
        this.emailCliente = emailCliente;
    }

    public String getPassCliente() {
        return passCliente;
    }

    public void setPassCliente(String passCliente) {
        this.passCliente = passCliente;
    }

    public Boolean getSocioPolideportivoPiscina() {
        return socioPolideportivoPiscina;
    }

    public void setSocioPolideportivoPiscina(Boolean socioPolideportivoPiscina) {
        this.socioPolideportivoPiscina = socioPolideportivoPiscina;
    }

    public String getMesInicio() {
        return mesInicio;
    }

    public void setMesInicio(String mesInicio) {
        this.mesInicio = mesInicio;
    }

    public int getIdTarifa() {
        return idTarifa;
    }

    public void setIdTarifa(int idTarifa) {
        this.idTarifa = idTarifa;
    }

    public Boolean getCompetirZaragoza() {
        return competirZaragoza;
    }

    public void setCompetirZaragoza(Boolean competirZaragoza) {
        this.competirZaragoza = competirZaragoza;
    }

    public String getTitularCuentaCliente() {
        return titularCuentaCliente;
    }

    public void setTitularCuentaCliente(String titularCuentaCliente) {
        this.titularCuentaCliente = titularCuentaCliente;
    }

    public String getNumeroCuentaCliente() {
        return numeroCuentaCliente;
    }

    public void setNumeroCuentaCliente(String numeroCuentaCliente) {
        this.numeroCuentaCliente = numeroCuentaCliente;
    }

    public String getModalidadCliente() {
        return modalidadCliente;
    }

    public void setModalidadCliente(String modalidadCliente) {
        this.modalidadCliente = modalidadCliente;
    }
}
