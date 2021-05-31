package com.example.ejercicio1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void btEnviar(View view){
        //Creamos el Intent
        Intent intent = new Intent(MainActivity.this, mainSaludo.class);
        EditText txtNombre = (EditText)findViewById(R.id.txtNombre);
        EditText txtApellido = (EditText)findViewById(R.id.txtApellido);
        EditText txtEmail = (EditText)findViewById(R.id.txtEmail);
        //Creamos la informacion a pasar entre actividades - Pares Key-Value
        Bundle b = new Bundle();

        b.putString("NOMBRE", txtNombre.getText().toString());
        b.putString("APELLIDO", txtApellido.getText().toString());
        b.putString("EMAIL", txtEmail.getText().toString());

        //Añadimos la información al intent
        intent.putExtras(b);
        //Iniciamos la nueva actividad
        startActivity(intent);
    }
}