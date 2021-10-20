package com.example.holamundo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    //Creamos funcion OnClik
    public void mostrarHM(View v){

        //Inicializamos el TextView y le indicamos su ID
        TextView mt = findViewById(R.id.txt_holaMundo);

        //Indicamos el contenido del TextView
        mt.setText("Hola Mundo");
    }
}