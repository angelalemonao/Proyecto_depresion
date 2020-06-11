package com.example.principal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class acerca_de_la_app extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_acerca_de_la_app);
    }

    public void siguiente (View view)
    {
        Intent i = new Intent(this,Cuestionario.class);
        startActivity(i);
    }
    public void Atras (View view)
    {
        Intent i = new Intent(this,bienvenida.class);
        startActivity(i);
    }








}
