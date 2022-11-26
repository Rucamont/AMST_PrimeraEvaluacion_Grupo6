package com.example.amst_primeraevaluacinprctica_grupo8_torres_cadena;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.HashMap;

public class Lost_play extends AppCompatActivity {
    TextView txtCount;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lost_play);
        Intent intent = getIntent();
        HashMap<String,String> cantidad = (HashMap<String,String>) intent.getSerializableExtra("count");
//        System.out.println("Cantidad :"+ cantidad);
        txtCount =findViewById(R.id.textView6);
        String textLost= "Ha respondido un total de "+cantidad.get("total") +" preguntas";
        txtCount.setText(textLost);
    }

    public void volverJugar(View v){
        finish();
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
        this.recreate();


    }
    public void close(View view){

        finishAndRemoveTask();

    }
}