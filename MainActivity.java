package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;
import android.widget.*;

import java.util.*;
import android.os.Bundle;


public class MainActivity extends AppCompatActivity {
    private CheckBox cbapellidos;
    private Button btnC;
    private TextView tfTexto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        cbapellidos=(CheckBox)findViewById(R.id.cbapellidos);
        btnC=(Button)findViewById(R.id.btnC);
        tfTexto=(TextView)findViewById(R.id.tfTexto);

        btnC.setOnClickListener (new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (cbapellidos.isChecked()==true) {
                    tfTexto.setText("Mi nombre  y mis apellidos son Laura Álvarez Muñoz");
                }
                else {
                    tfTexto.setText("Mi nombre es Laura");
                }
                tfTexto.setVisibility(View.VISIBLE);
            }
        });

    }
}