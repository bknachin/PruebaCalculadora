package com.example.pruebacalculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button bt1, bt2, bt3, bt4;
    EditText numero1, numero2;
    TextView resultado;

    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        numero1 = (EditText) findViewById(R.id.n1);
        numero2 = (EditText) findViewById(R.id.n2);
        bt1 = (Button) findViewById(R.id.btnsuma);
        bt2 = (Button) findViewById(R.id.btnresta);
        bt3 = (Button) findViewById(R.id.btnmultiplicacion);
        bt4 = (Button) findViewById(R.id.btndivision);
        resultado = (TextView) findViewById(R.id.resultado2);

    bt3.setOnClickListener(this);

    }


    @Override
    public void onClick(View view) {
        if (view.getId() == R.id.btnsuma)
        {
            Intent intent1 = new Intent (this, Suma.class);
            startActivity(intent1);
        }
        else if (view.getId() == R.id.btnresta)
        {
            Intent intent2 = new Intent (this, Resta.class);
            startActivity(intent2);
        }
        else if (view.getId()==R.id.btnmultiplicacion)
        {
            resultado.setText("");
        }
        else if (view.getId()==R.id.btndivision)
        {
            Toast.makeText(this,"Este es el resultado de la division", Toast.LENGTH_SHORT);
        }
    }
}
