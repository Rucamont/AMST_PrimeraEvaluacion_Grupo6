package com.example.amst_primeraevaluacinprctica_grupo8_torres_cadena;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.HashMap;

public class Enhorabuena extends AppCompatActivity {
 TextView txtCount;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_enhorabuena);
//        Intent intent = getIntent();
//        HashMap<String, String> cantidad = (HashMap<String, String>) intent.getSerializableExtra("count");
        txtCount =findViewById(R.id.textView6);
        txtCount.setTextColor(Color.BLUE);
    }

}