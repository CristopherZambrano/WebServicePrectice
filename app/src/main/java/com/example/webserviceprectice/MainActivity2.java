package com.example.webserviceprectice;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        //Localizar los controles
        TextView txtSaludo = (TextView) findViewById(R.id.txtLista);
        //Recuperamos la información pasada en el intent
        Bundle bundle = this.getIntent().getExtras();
        //Construimos el mensaje a mostra
        txtSaludo.setText("Hola!, Bienvenido \n " + bundle.getString("name")+"password: "+ bundle.getString("pass"));

    }
}