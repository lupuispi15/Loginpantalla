package com.prueba4.pantalla_login;

import androidx.activity.ComponentActivity;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.prueba4.pantalla_login.ejercicios.Series;

public class MainActivity extends AppCompatActivity {
    EditText usuario;
    Button buttonIngresar;

    Series series = new Series();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        usuario = findViewById(R.id.Usuario);
        buttonIngresar = findViewById(R.id.buttonIngresar);
        
        buttonIngresar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String user = usuario.getText().toString();
                if (user.equals(series.ejercicio1(2))){
                    Intent intent = new Intent(MainActivity.this, Pantallasiguiente.class);
                    startActivity(intent);

                }
                else {
                    MostrarAlerta();
                }
            }
        });
    }
    public void MostrarAlerta(){
        new AlertDialog.Builder(this)
                .setMessage(" Usuario incorrecto")
                .setPositiveButton(android.R.string.ok, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Log.d("mensaje", "se cancelo accion");
                    }
                })
                .show();
    }
}