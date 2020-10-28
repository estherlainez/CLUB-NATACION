package com.example.appsport.controller;

import com.example.appsport.modelo.Cliente;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ClienteController {

    Conexion c=new Conexion();
    public Cliente comprobarCliente(String usuario, String pass)  {
        String sql="select idCliente,nombreApellidosCliente,dniCliente,telefonoCliente, emailCliente, passCliente from clientes where clientes.emailCliente=? AND clientes.passCliente=?";
        Cliente cliente=null;
        try {
            PreparedStatement ps=c.conexion().prepareStatement(sql);
            ps.setString(1, usuario);
            ps.setString(2, pass);
            ResultSet rs=ps.executeQuery();

            while(rs.next()) {
                int id=rs.getInt("idCliente");
                String nc=rs.getString("nombreApellidosCliente");
                String dc=rs.getString("dniCliente");
                String tc=rs.getString("telefonoCliente");
                String ec=rs.getString("emailCliente");
                String pc=rs.getString("passCliente");
                cliente = new Cliente(id,nc,dc,tc,ec,pc);

            }
            rs.close();
            ps.close();
            return cliente;
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }


        return null;
    }

    public Cliente datosCliente (int idCliente){
        String sql="select * from clientes where clientes.idCliente=?";
        try {
            PreparedStatement ps=c.conexion().prepareStatement(sql);
            ps.setInt(1, idCliente);
            ResultSet rs=ps.executeQuery();
            Cliente cliente=new Cliente();
            while(rs.next()) {
                int ic=rs.getInt("idCliente");
                String nc=rs.getString("nombreApellidosCliente");
                String dc=rs.getString("dniCliente");

                cliente = new Cliente(ic,nc,dc);
            }
            rs.close();
            ps.close();
            return cliente;
        } catch (SQLException e) {
            // TODO Auto-generated catch bloc
            e.printStackTrace();
        }
        return null;
    }
}
