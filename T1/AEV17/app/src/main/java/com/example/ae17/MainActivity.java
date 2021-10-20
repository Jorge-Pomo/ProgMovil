package com.example.ae17;

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

    public void calcularGastos(View v){
        EditText etPrecio = findViewById(R.id.txtPrecioTabaco);
        EditText etCantidad = findViewById(R.id.txtCajetillasSemana);
        TextView tvResultado = findViewById(R.id.lblResultado);

        double precioCajetilla = Double.parseDouble(String.valueOf(etPrecio.getText()));
        int cajetillasSemana = Integer.parseInt(String.valueOf(etCantidad.getText()));
        double gastoSemana = precioCajetilla * cajetillasSemana;
        String resu = "";


        // Semanas
        resu = resu + gastoSemana + "€ en una semana \n";
        resu = resu + (gastoSemana * 2) + "€ en dos semanas \n";
        resu = resu + (gastoSemana * 3) + "€ en tres semanas \n";
        resu = resu + (gastoSemana * 4) + "€ en cuatro semanas \n";

        // Meses
        resu = resu + ((gastoSemana * 4) * 2) + "€ en 2 meses \n";
        resu = resu + ((gastoSemana * 4) * 3) + "€ en 3 meses \n";
        resu = resu + ((gastoSemana * 4) * 6) + "€ en 6 meses \n";
        resu = resu + ((gastoSemana * 4) * 10) + "€ en 10 meses \n";

        // Años
        resu = resu + ((gastoSemana * 4) * 12) + "€ en un año \n";
        resu = resu + (((gastoSemana * 4) * 12) * 2) + "€ en 2 años \n";
        resu = resu + (((gastoSemana * 4) * 12) * 5) + "€ en 5 años \n";
        resu = resu + (((gastoSemana * 4) * 12) * 10) + "€ en 10 años \n";

        tvResultado.setText(resu);

    }
}