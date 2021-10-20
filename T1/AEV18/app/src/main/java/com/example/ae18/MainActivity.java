package com.example.ae18;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<Integer> numeros = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void guardar(View v){
        EditText etNum = findViewById(R.id.txtNumero);

        String prova = String.valueOf(etNum.getText());

        if(!prova.contentEquals("")){
            int num = Integer.parseInt(String.valueOf(etNum.getText()));

            nums(num);

            etNum.setText("");
        }
    }

    public void calcular(View v){

        TextView tvResultado = findViewById(R.id.lblResu);

        String resu = "";

        int nMayor = Integer.MIN_VALUE;
        int nMenor = Integer.MAX_VALUE;
        float media = 0;

        for (int i = 0; i < this.numeros.size(); i++) {
            if(nMayor < this.numeros.get(i)){
                nMayor = this.numeros.get(i);
            }
            if(nMenor > this.numeros.get(i)){
                nMenor = this.numeros.get(i);
            }

            media = media + this.numeros.get(i);

        }
        media = media / this.numeros.size();

        resu = resu + nMayor + " es el numero más alto\n";
        resu = resu + nMenor + " es el numero más bajo\n";
        resu = resu + media + " es la media";

        tvResultado.setText(resu);

    }

    private void nums(int num){
       this.numeros.add(num);
    }
}