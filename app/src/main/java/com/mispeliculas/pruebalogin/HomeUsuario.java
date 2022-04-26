package com.mispeliculas.pruebalogin;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class HomeUsuario extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_usuario);

    }


    @Override
    protected void onStart() {


        super.onStart();
    }

    public void PedirCita(View view){
        Intent cita = new Intent(this, Cita.class);
        startActivity(cita);
    }









}