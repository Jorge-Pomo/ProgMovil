package com.example.aev14;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void clacularPrecio(View v){
        EditText etTipoC = findViewById(R.id.txtTipoC);
        TextView tw = findViewById(R.id.lblResu);
        EditText etPrac = findViewById(R.id.txtPracticas);

        char tipo = etTipoC.getText().charAt(0);
        int numPract = Integer.parseInt(String.valueOf(etPrac.getText()));
        int precio = 0;
        int resuPract = 0;

        switch (tipo){
            case 'A':
                precio = 150;
                resuPract = numPract * 15;
                break;
            case 'B':
                precio = 325;
                resuPract = numPract * 21;
                break;
            case 'C':
                precio = 520;
                resuPract = numPract * 36;
                break;
            case 'D':
                precio = 610;
                resuPract = numPract * 50;
                break;
        }

        int precioTotal = precio + resuPract;
        tw.setText("" + precioTotal);
    }
}