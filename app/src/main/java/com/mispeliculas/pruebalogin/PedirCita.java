package com.mispeliculas.pruebalogin;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.CalendarView;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.Calendar;

public class PedirCita extends AppCompatActivity {

    Spinner spinner;
    CalendarView calendario;
    TextView cita;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pedir_cita);

        spinner = findViewById(R.id.spinner);
        calendario = findViewById(R.id.calendario);
        cita = findViewById(R.id.cita);

        String [] experto = {"Elija un especialista", "Opcion1", "Opcion2", "Opcion3"};
        ArrayAdapter <String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, experto);
        spinner.setAdapter(adapter);

        calendario.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            }
        });

    }


}