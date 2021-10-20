package com.example.aev1_3;

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

    public void calcularEdad(View v){
        TextView tvResu = findViewById(R.id.lblResu);
        EditText etEdad = findViewById(R.id.txtEdad);

        int edadP = Integer.parseInt(String.valueOf(etEdad.getText()));

        double resu = 0;

        if(edadP <= 2){
            resu = edadP * 10.5;
        }else{
            edadP = edadP - 2;
            resu = 2 * 10.5;

            resu = resu + (edadP * 4);
        }
        tvResu.setText("" + resu);

    }
}