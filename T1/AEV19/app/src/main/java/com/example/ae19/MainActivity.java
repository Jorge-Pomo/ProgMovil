package com.example.ae19;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<Double> notes = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void guardarNotes(View v){
        EditText etNota = findViewById(R.id.txtNota);

        String prova = String.valueOf(etNota.getText());

        if(!prova.contentEquals("")){
            ficarNota(Double.parseDouble(String.valueOf(etNota.getText())));

            etNota.setText("");
        }

    }

    public void ordenarNotes(View v){
        TextView twResu = findViewById(R.id.lblResu);

        int suspensos = 0;
        int aprovados = 0;
        int notables = 0;
        int sobresalientes = 0;
        int matriculasHonor = 0;

        for (int i = 0; i < notes.size(); i++) {
            if(notes.get(i) <= 4.99){
                suspensos++;
            }else{
                if(notes.get(i) <= 6.99){
                    aprovados++;
                }else{
                    if(notes.get(i) <= 8.99){
                        notables++;
                    }else{
                        if(notes.get(i) <= 9.99){
                            sobresalientes++;
                        }else{
                            if(notes.get(i) == 10){
                                matriculasHonor++;
                            }
                        }
                    }
                }
            }
        }

        String resu = suspensos + " de alumnos suspendidos\n";
        resu = resu + aprovados + " de alumnos aprovados\n";
        resu = resu + notables + " de alumnos notables\n";
        resu = resu + sobresalientes + " de alumnos sobresalientes\n";
        resu = resu + matriculasHonor + " de alumnos matriculasHonor\n";

        twResu.setText(resu);
    }

    private void ficarNota(Double nota){
        notes.add(nota);
    }

}