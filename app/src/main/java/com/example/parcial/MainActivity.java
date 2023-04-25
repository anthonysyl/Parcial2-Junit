package com.example.parcial;

import static com.example.parcial.R.id.fibo1;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText editTextN;
    TextView resultado11;
    Button buttonCalcular;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editTextN = findViewById(fibo1);
        buttonCalcular = findViewById(R.id.calcular1);


        resultado11 = findViewById(R.id.resultado1);
        buttonCalcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int n =Integer.parseInt(editTextN.getText().toString());
                int resultado= fibonacci(n);
                resultado11.setText("El resultado es: "+ resultado);

            }
        });


    }
    int fibonacci(int n)
    {
        if(n<=1)
        {
            return n;
        }else {
            return fibonacci(n - 1)+ fibonacci(n -2);
        }
    }


}