package com.mispeliculas.pruebalogin;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class HomeUsuario extends AppCompatActivity {
    ImageButton pedirCita, anularCita, informacionApp, ubicacionCentro;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_usuario);

        pedirCita = findViewById(R.id.pedirCita);
        anularCita = findViewById(R.id.anularCita);
        informacionApp = findViewById(R.id.informacionApp);
        ubicacionCentro = findViewById(R.id.ubicacionCentro);
    }


    @Override
    protected void onStart() {


        super.onStart();
    }



    public void Pedircita(View view){
        Intent cita = new Intent(HomeUsuario.this, PedirCita.class);
        startActivity(cita);

    }



}