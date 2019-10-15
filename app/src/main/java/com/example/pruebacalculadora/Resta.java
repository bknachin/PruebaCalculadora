package com.example.pruebacalculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Resta extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resta);
    }

    public void Resta1 (View view)
    {
        Intent intent = new Intent(this, MainActivity.class);

        startActivity(intent);


    }
}
