package com.example.login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    private TextView recibeNif;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Bundle extras = this.getIntent().getExtras();
        String mensajeP = extras.getString("mensajePasado");

        recibeNif = (TextView) findViewById(R.id.recibeNif);
        recibeNif.setText(mensajeP);

    }


}