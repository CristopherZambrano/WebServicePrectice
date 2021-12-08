package com.example.webserviceprectice;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.example.webserviceprectice.webservice.Asynchtask;
import com.example.webserviceprectice.webservice.WebService;

import org.json.JSONException;

import java.util.HashMap;
import java.util.Map;

public class MainActivity2 extends AppCompatActivity implements Asynchtask {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        //Localizar los controles
        //TextView txtSaludo = (TextView) findViewById(R.id.txtLista);
        //Recuperamos la información pasada en el inten
        //Construimos el mensaje a mostra
        //txtSaludo.setText("Hola!, Bienvenido \n " + bundle.getString("name")+"password: "+ bundle.getString("pass"));

        Bundle bundle = this.getIntent().getExtras();
        Map<String, String> datos = new HashMap<String, String>();
        WebService ws= new WebService("http://uealecpeterson.net/ws/login.php?usr="
                       + bundle.getString("name") + "&pass=" + bundle.getString("pass"),
                        datos, MainActivity2.this, MainActivity2.this);
        ws.execute("GET");

    }
    @Override
    public void processFinish(String result) throws JSONException{
        TextView txtSaludo = (TextView) findViewById(R.id.txtLista);
        txtSaludo.setText("RESPUESTA " + result);
    }
}