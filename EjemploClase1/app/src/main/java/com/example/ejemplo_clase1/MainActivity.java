package com.example.ejemplo_clase1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText edtValor1V;
    private EditText edtValor2V;
    private TextView txtTotalV;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtValor1V = (EditText) findViewById(R.id.edtValor1);
        edtValor2V = (EditText) findViewById(R.id.edtValor2);
        txtTotalV = (TextView) findViewById(R.id.txtTotal);

        Button btnInicializarV = findViewById(R.id.btnInicializa);
        btnInicializarV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edtValor1V.setText("");
                edtValor2V.setText("");
                txtTotalV.setText("0");
            }
        });

    }
    public void sumar(View view){
        String v1 = edtValor1V.getText().toString();
        String v2 = edtValor1V.getText().toString();
        int i1 = Integer.parseInt(v1);
        int i2 = Integer.parseInt(v2);
        int suma = i1 + i2;
        String resultado = String.valueOf(suma);
        txtTotalV.setText(resultado);

    }
}