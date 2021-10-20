package com.example.ae110;

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

    public void Caluclar(View v){
        EditText etNum = findViewById(R.id.txtNum);
        TextView tvResu = findViewById(R.id.lblResu);

        int num = Integer.parseInt(String.valueOf(etNum.getText()));
        int sumaNums = 0;

        for (int i = 0; i < num; i++) {
            sumaNums = sumaNums + i;
        }

        tvResu.setText("" + sumaNums);

    }
}