package com.example.sumar;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText num1;
    private EditText num2;
    private TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        num1=(EditText)findViewById(R.id.editTextNumber1);
        num2=(EditText)findViewById(R.id.editTextNumber2);
        result=(TextView)findViewById(R.id.resul);
    }

    //Este método se ejecutará cuando se presione el botón
    public void sumar(View view) {
        String valor1=num1.getText().toString();
        String valor2=num2.getText().toString();
        int nro1=Integer.parseInt(valor1);
        int nro2=Integer.parseInt(valor2);
        int suma=nro1+nro2;
        String resul=String.valueOf(suma);
        result.setText(resul);
    }




}

