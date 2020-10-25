package com.example.appsport;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.StrictMode;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class MainActivity extends AppCompatActivity {

    String baseDeDatos="clubNatacion";
    String Servidor="localhost";
    String  usuario="sa";
    String clave="1234";

    EditText email,pass;
    Button consultar;
    TextView nombre, telefono, direccion;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        email=(EditText)findViewById(R.id.etEmail);
        pass=(EditText)findViewById(R.id.etPass);
        nombre=(TextView)findViewById(R.id.textNombre);
        //telefono=(TextView)findViewById(R.id.textTelefono);
        consultar=(Button)findViewById(R.id.btnAceso);
    }

    public void login(View view) {
        consultarCliente();
    }

    public Connection conexionBD() throws ClassNotFoundException, InstantiationException, IllegalAccessException {
        Connection con= null;
        try{

            StrictMode.ThreadPolicy politica= new StrictMode.ThreadPolicy.Builder().permitAll().build();
            StrictMode.setThreadPolicy(politica);
            Class.forName("net.sourceforge.jtds.jdbc.Driver").newInstance();
            String ConnURL = "jdbc:jtds:sqlserver://" + "192.168.159.1" + ";"
                    + "databaseName=" + baseDeDatos + ";user=" + usuario + ";password="
                    + clave + ";";
            con = DriverManager.getConnection(ConnURL);

        }catch(Exception e){
            e.printStackTrace();
            Toast.makeText(getApplicationContext(),e.getMessage()+"khgjhhjgj",Toast.LENGTH_SHORT).show();
        }

        return con;
    }

    private void consultarCliente() {
        try{
            Statement stm= conexionBD().createStatement();
            ResultSet rs= stm.executeQuery("SELECT * FROM clientes ");
            if(rs.next()){
                nombre.setText(rs.getString(2));
                telefono.setText(rs.getString(6));
                direccion.setText(rs.getString(4));
            }
            email.setText("");
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}