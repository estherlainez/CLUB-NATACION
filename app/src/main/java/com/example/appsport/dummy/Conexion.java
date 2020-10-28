package com.example.appsport.dummy;

import android.content.Context;
import android.os.StrictMode;
import android.util.Log;
import android.widget.Toast;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import static android.webkit.ConsoleMessage.MessageLevel.LOG;

public class Conexion {

    String server = "pmssql100.dns-servicio.com:1433";
    String baseDeDatos="6366619_ell";
    String un = "ellUser";
    String password = "Ell2020@sicom";
    String port = "1433";
    String ip = "192.168.159.1";
    String classs = "net.sourceforge.jtds.jdbc.Driver";

    public Connection conexion() {
        StrictMode.ThreadPolicy policy = new StrictMode.ThreadPolicy.Builder()
                .permitAll().build();
        StrictMode.setThreadPolicy(policy);
        Connection con = null;
        String conUrl = null;

        try {
            Class.forName(classs);
            conUrl = "jdbc:jtds:sqlserver://" +server+";integratedSecurity=true;"
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
