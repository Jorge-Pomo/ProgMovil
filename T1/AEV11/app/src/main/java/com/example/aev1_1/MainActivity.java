package com.example.aev1_1;

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

    public void calcularSalario(View v){
        EditText horasSemana = findViewById(R.id.txtNumHoras);
        EditText precioHora = findViewById(R.id.txtPrecioHora);
        TextView resu = findViewById(R.id.lblResu);

        int hSemana = Integer.parseInt(String.valueOf(horasSemana.getText()));
        int pHora = Integer.parseInt(String.valueOf(precioHora.getText()));

        int salario = 0;

        int hExtra = 0;
        double resuHExtra;
        if(hSemana > 40){
            hExtra = hSemana - 40;
            hSemana = hSemana - hExtra;

            resuHExtra = pHora * 1.5;
            resuHExtra = hExtra * resuHExtra;
        }

        salario = (hSemana * pHora) + hExtra;

        resu.setText("" + salario);
    }
}