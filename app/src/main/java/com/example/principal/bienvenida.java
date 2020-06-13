package com.example.principal;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class bienvenida extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bienvenida);
    }


public void siguiente (View view)
{
        Intent i = new Intent(this,acerca_de_la_app.class);
        startActivity(i);
}








}
