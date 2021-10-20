package com.example.ae16;

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

    public void calcularCambio(View v){
        EditText etCantidad = findViewById(R.id.txtCantidad);
        TextView tvResu = findViewById(R.id.lblResu);

        double cantidad = Double.parseDouble(String.valueOf(etCantidad.getText()));
        String resu = "";

        if(cantidad >= 500) {
           resu = resu + (int)(cantidad / 500);
           resu = resu + ((cantidad / 500 == 1)? " billete de 500, \n":" billetes de 500,\n");
           cantidad = cantidad % 500;
        }
        if(cantidad >= 200) {
            resu = resu + (int)(cantidad / 200);
            resu = resu + ((cantidad / 200 == 1)? " billete de 200, \n":" billetes de 200,\n");
            cantidad = cantidad % 200;
        }
        if(cantidad >= 100) {
            resu = resu + (int)(cantidad / 100);
            resu = resu + ((cantidad / 100 == 1)? " billete de 100, \n":" billetes de 100,\n");
            cantidad = cantidad % 100;
        }
        if(cantidad >= 50) {
            resu = resu + (int)(cantidad / 50);
            resu = resu + ((cantidad / 50 == 1)? " billete de 50, \n":" billetes de 50,\n");
            cantidad = cantidad % 50;
        }
        if(cantidad >= 20) {
            resu = resu + (int)(cantidad / 20);
            resu = resu + ((cantidad / 20 == 1)? " billete de 20, \n":" billetes de 20,\n");
            cantidad = cantidad % 20;
        }
        if(cantidad >= 10) {
            resu = resu + (int)(cantidad / 10);
            resu = resu + ((cantidad / 10 == 1)? " billete de 10, \n":" billetes de 10,\n");
            cantidad = cantidad % 10;
        }
        if(cantidad >= 5) {
            resu = resu + (int)(cantidad / 5);
            resu = resu + ((cantidad / 5 == 1)? " billete de 5, \n":" billetes de 5,\n");
            cantidad = cantidad % 5;
        }
        if(cantidad >= 2) {
            resu = resu + (int)(cantidad / 2);
            resu = resu + ((cantidad / 2 == 1)? " moneda de 2€, \n":" monedas de 2€,\n");
            cantidad = cantidad % 2;
        }
        if(cantidad >= 1) {
            resu = resu + (int)(cantidad / 1);
            resu = resu + ((cantidad / 1 == 1)? " moneda de 1€, \n":" monedas de 1€,\n");
            cantidad = cantidad % 1;
        }
        if(cantidad >= 0.5) {
            resu = resu + (int)(cantidad / 0.5);
            resu = resu + ((cantidad / 0.5 == 1)? " moneda de 50 centimo, \n":" monedas de 50 centimos,\n");
            cantidad = cantidad % 0.5;
        }
        if(cantidad >= 0.2) {
            resu = resu + (int)(cantidad / 0.2);
            resu = resu + ((cantidad / 0.2 == 1)? " moneda de 20 centimo, \n":" monedas de 20 centimos,\n");
            cantidad = cantidad % 0.2;
        }
        if(cantidad >= 0.1) {
            resu = resu + (int)(cantidad / 0.1);
            resu = resu + ((cantidad / 0.1 == 1)? " moneda de 10 centimo, \n":" monedas de 10 centimos,\n");
            cantidad = cantidad % 0.1;
        }
        if(cantidad >= 0.05) {
            resu = resu + (int)(cantidad / 0.05);
            resu = resu + ((cantidad / 0.05 == 1)? " moneda de 5 centimo, \n":" monedas de 5 centimos,\n");
            cantidad = cantidad % 0.05;
        }
        if(cantidad >= 0.02) {
            resu = resu + (int)(cantidad / 0.02);
            resu = resu + ((cantidad / 0.02 == 1)? " moneda de 2 centimo, \n":" monedas de 2 centimos,\n");
            cantidad = cantidad % 0.02;
        }
        if(cantidad >= 0.01) {
            resu = resu + (int)(cantidad / 0.01);
            resu = resu + ((cantidad / 0.01 == 1)? " moneda de 1 centimo, \n":" monedas de 1 centimos, \n");
            cantidad = cantidad % 0.01;
        }


        tvResu.setText(resu);
    }
}