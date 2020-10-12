package com.example.ejemplo1clase2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private TextView txtMensajeV;
    private EditText edtMensajeV;
    private RadioGroup rbrGrupoV;
    private RadioButton rbtDefectoV;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtMensajeV=(TextView) findViewById(R.id.txtMensaje);
        edtMensajeV=(EditText) findViewById(R.id.edtMensaje);
        rbrGrupoV=(RadioGroup) findViewById(R.id.rgrGrupo);


    }

    public void saludar(View view){
        rbtDefectoV = (RadioButton) findViewById(rbrGrupoV.getCheckedRadioButtonId());
        String botonSeleccionado= rbtDefectoV.getTag().toString();
        String mensaje = (String) getResources().getText(R.string.stringSaludos) + " "+ edtMensajeV.getText();

//        Saludo en TextView
        if (botonSeleccionado.equals("0")) {
            txtMensajeV.setText(mensaje);
        } else if (botonSeleccionado.equals("1")) {
            Toast.makeText(this, mensaje, Toast.LENGTH_LONG).show();

        } else if (botonSeleccionado.equals("2")) {
            Intent intencion  = new Intent(this, Actividad2.class);
            intencion.putExtra("mensajePasado", mensaje);
            startActivity(intencion);
            Toast.makeText(this, mensaje, Toast.LENGTH_LONG).show();

        }

    }
}