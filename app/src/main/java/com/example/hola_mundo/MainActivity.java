package com.example.hola_mundo;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button boton;
    private TextView text;
    public int contador= 0;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        text= (TextView) findViewById(R.id.texto);
        boton=(Button)findViewById(R.id.boton);

        boton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                contador+=1;
                switch (contador)
                {
                    case 1:
                        text.setText("Hola");
                        break;
                    case 2:
                        text.setText("Mundo");
                        break;
                    case 3:
                        text.setText("Hola Mundo");
                        contador=0;
                        break;
                }
            }
        });
    }
}