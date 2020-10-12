package com.example.login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

;

public class MainActivity1 extends AppCompatActivity {

    private EditText txtNif;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main1);

        txtNif = (EditText) findViewById(R.id.textNif);

    }

    public void login(View view) {
        String mensaje = (String) txtNif.getText().toString();
        Intent login = new Intent(this, MainActivity2.class);
        login.putExtra("mensajePasado", mensaje);
        startActivity(login);

    }


}