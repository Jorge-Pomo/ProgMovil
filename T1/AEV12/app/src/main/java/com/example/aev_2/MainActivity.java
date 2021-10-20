package com.example.aev_2;

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

    public void convertir(View v){
        EditText tSegons = findViewById(R.id.txtTemps);
        TextView temps = findViewById(R.id.lblTiempo);

        int segons = Integer.parseInt(String.valueOf(tSegons.getText()));

        int dies = 0;
        int hores = 0;
        int mins = 0;

        if(segons >= 86400){
            dies = segons / 86400;
            segons = segons % 86400;
        }
        if(segons >= 3600){
            hores = segons / 3600;
            segons = segons % 3600;
        }
        if(segons >= 60){
            mins = segons / 60;
            segons = segons % 60;
        }

        temps.setText("" + dies + "D " + hores + "H " + mins + "m " + segons + "s");
    }
}