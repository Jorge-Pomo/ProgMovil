package com.example.ae15;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Locale;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void esPalindromo(View v){
        EditText etFrase = findViewById(R.id.txtFrase);
        TextView tvResu = findViewById(R.id.lblResu);

        String strFrase = String.valueOf(etFrase.getText());
        strFrase = strFrase.toLowerCase();
        strFrase = strFrase.replace(" ", "").replace("á", "a").replace("é", "e").replace("í", "i").replace("ó", "o")
                .replace("ú", "u").replace(" ", "").replace(".", "").replace(",", "");

        char[] carFrase = strFrase.toCharArray();
        char[] carFReves = new char[carFrase.length];

        String strFReves = "";

        int cont = 0;

        for (int i = carFrase.length - 1; i >= 0; i--) {
            carFReves[cont] = carFrase[i];
            strFReves = strFReves + carFReves[cont];
            cont++;
        }

        if(strFrase.equals(strFReves)){
            tvResu.setText("Si");
        }else{
            tvResu.setText("No");
        }


    }
}