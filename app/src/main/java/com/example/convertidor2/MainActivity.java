package com.example.convertidor2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public void dolar(View view){
        EditText editText = findViewById(R.id.editText);
        String pesoString = editText.getText().toString();
        double peso = Double.parseDouble(pesoString);
        double dll = peso * .047;
        String dllString = String.format("%.2f",dll);
        String conversion = "Su monto de " + pesoString + " son " +dllString + " Dolares";
        Toast.makeText(this
                , conversion, Toast.LENGTH_LONG).show();
    }
    public void yen(View view){
        EditText editText = findViewById(R.id.editText);
        String pesoString = editText.getText().toString();
        double peso = Double.parseDouble(pesoString);
        double yn = peso * 5.31;
        String ynString = String.format("%.2f",yn);
        String conversion = "Su monto de " + pesoString + " son  " + ynString + " Yenes";
        Toast.makeText(this
                , conversion, Toast.LENGTH_LONG).show();
    }

    public void pesoChileno(View view){
        EditText editText = findViewById(R.id.editText);
        String pesoString = editText.getText().toString();
        double peso = Double.parseDouble(pesoString);
        double pch = peso * 39.32;
        String pchString = String.format("%.2f",pch);
        String conversion = "Su monto de " + pesoString + " son " + pchString + " Pesos Chilenos";
        Toast.makeText(this
                , conversion, Toast.LENGTH_LONG).show();
    }

    public void libra(View view){
        EditText editText = findViewById(R.id.editText);
        String pesoString = editText.getText().toString();
        double peso = Double.parseDouble(pesoString);
        double lb = peso * 0.035;
        String lbString = String.format("%.2f",lb);
        String conversion = "Su monto de " + pesoString + " son " + lbString + " Libras Esterlinas";
        Toast.makeText(this
                , conversion, Toast.LENGTH_LONG).show();
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}