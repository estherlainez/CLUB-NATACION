package com.example.appsport.dummy;

import android.content.Context;
import android.os.StrictMode;
import android.util.Log;
import android.widget.Toast;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {
    String ip = "192.168.159.1";
    String classs = "net.sourceforge.jtds.jdbc.Driver";
    String baseDeDatos="clubNatacion";
    String un = "sa";
    String password = "1234";

    public Connection conexion() {
        StrictMode.ThreadPolicy policy = new StrictMode.ThreadPolicy.Builder()
                .permitAll().build();
        StrictMode.setThreadPolicy(policy);
        Connection con = null;
        String conUrl = null;


        try {

            Class.forName("net.sourceforge.jtds.jdbc.Driver").newInstance();
            conUrl = "jdbc:jtds:sqlserver://" + ip + ";"
                    + "databaseName=" + baseDeDatos + ";user=" + un + ";password="
                    + password + ";";
            con = DriverManager.getConnection(conUrl);
        } catch (SQLException se) {
        Log.e("ERROR", se.getMessage());
    } catch (ClassNotFoundException e) {
        Log.e("ERROR", e.getMessage());
    } catch (Exception e) {
        Log.e("ERROR", e.getMessage());
    }
        return con;
    }
}
