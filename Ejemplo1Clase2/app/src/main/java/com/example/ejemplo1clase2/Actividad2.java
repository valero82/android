package com.example.ejemplo1clase2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class Actividad2 extends AppCompatActivity {

    private TextView txtRecibeSaludo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_actividad2);

        Bundle extras = this.getIntent().getExtras();
        String mensajeP = extras.getString("mensajePasado");

        txtRecibeSaludo = (TextView) findViewById(R.id.txtRecibeSaludo);
        txtRecibeSaludo.setText(mensajeP);
    }
}