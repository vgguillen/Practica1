package com.example.ejercicio1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class mainSaludo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_saludo);

        //Localizar los controles
        TextView txtDatos = (TextView)findViewById(R.id.lblDatos);
        //Recuperamos la información pasada en el intent
        Bundle bundle = this.getIntent().getExtras();

        //Construimos el mensaje a mostrar
        txtDatos.setText("Estos son los datos ingresados: \n "+ bundle.getString("NOMBRE")+"\n "+
                bundle.getString("APELLIDO")+"\n "+ bundle.getString("EMAIL"));
    }
}