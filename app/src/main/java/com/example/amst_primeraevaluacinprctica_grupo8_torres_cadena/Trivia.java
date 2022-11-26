package com.example.amst_primeraevaluacinprctica_grupo8_torres_cadena;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.squareup.picasso.Picasso;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.TimeUnit;

public class Trivia extends AppCompatActivity {
    TextView txtQuestion;
    Button opcion1, opcion2, opcion3, opcion4;
    ImageView imv_photo;
    String respuesta;
    HashMap<String, String> numberTrivia = new HashMap<String, String>();
    Integer n;
    String pregunta, op1, op2, op3, op4;
    HashMap<String, String> trivia;
//    HashMap<String, Integer>  preguntasCorrectas;
    Boolean nextTrivia;
    Boolean litNotRep;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_trivia);

        Intent intent = getIntent();
        trivia = (HashMap<String, String>) intent.getSerializableExtra("trivia");

        Random rand = new Random();
        n = rand.nextInt(4) + 1;


        txtQuestion = findViewById(R.id.textQuestion);
        imv_photo = findViewById(R.id.imgQuest);
        opcion1 = findViewById(R.id.pregunta1);
        opcion2 = findViewById(R.id.pregunta2);
        opcion3 = findViewById(R.id.pregunta3);
        opcion4 = findViewById(R.id.pregunta4);


        setVariables();
        // trivias aleatorias
        txtQuestion.setText(trivia.get(pregunta));
        opcion1.setText(trivia.get(op1));
        opcion2.setText(trivia.get(op2));
        opcion3.setText(trivia.get(op3));
        opcion4.setText(trivia.get(op4));
        respuesta = trivia.get(respuesta);
        if (n == 1) {
            imv_photo.setImageDrawable(getDrawable(R.drawable.autobots));


        }
        if (n == 2) {
            imv_photo.setImageDrawable(getDrawable(R.drawable.onepiece));

        }
        if (n == 3) {
            imv_photo.setImageDrawable(getDrawable(R.drawable.avengers));

        }
        if (n == 4) {
            imv_photo.setImageDrawable(getDrawable(R.drawable.doctor));


        }
        if (n == 5) {
            imv_photo.setImageDrawable(getDrawable(R.drawable.spiderman));

        }


    }

    public void setVariables() {
        Random rand = new Random();
        n = rand.nextInt(4) + 1;
        System.out.println("Pregunta " + String.valueOf(n));
        litNotRep = numberTrivia.containsValue(String.valueOf(n));
        while (Boolean.TRUE == litNotRep){
            n = rand.nextInt(5) + 1;
            litNotRep = numberTrivia.containsValue(String.valueOf(n));
            System.out.println("Se repite " + String.valueOf(n));
            if (numberTrivia.size()==5){
                System.out.println("Se repite " + String.valueOf(n));
                finish();
                Intent intent = new Intent(this, Enhorabuena.class);
                startActivity(intent);
                break;
            }

        }

        pregunta = "pregunta" + String.valueOf(n);
        op1 = "op" + String.valueOf(n) + ".1";
        op2 = "op" + String.valueOf(n) + ".2";
        op3 = "op" + String.valueOf(n) + ".3";
        op4 = "op" + String.valueOf(n) + ".4";
        respuesta = "resp" + String.valueOf(n);
        numberTrivia.put("pregunta" + String.valueOf(n), pregunta.substring(8));

    }


    @RequiresApi(api = Build.VERSION_CODES.N)
    public void onClick(View v) throws InterruptedException {
        Button button = (Button) v;
        Random rand = new Random();
        n = rand.nextInt(4) + 1;

        if (respuesta.substring(4).equals("1")) {
            if (v.getId() == R.id.pregunta1) {
                Toast toast = Toast.makeText(getApplicationContext(), "Muy bien!", Toast.LENGTH_SHORT);
                toast.show();
                TimeUnit.SECONDS.sleep(1);
                nextTrivia = Boolean.TRUE;


            }
            // si selecciona otra opcion, pierde el juego
            else {
                finish();
                Intent intent = new Intent(this, Lost_play.class);
                numberTrivia.put("total",String.valueOf(numberTrivia.size()-1));
                intent.putExtra("count",numberTrivia);

                startActivity(intent);
                nextTrivia = Boolean.FALSE;
            }
        }
        if (respuesta.substring(4).equals("2")) {
            if (v.getId() == R.id.pregunta2) {
                Toast toast = Toast.makeText(getApplicationContext(), "Excelente", Toast.LENGTH_SHORT);
                toast.show();
                TimeUnit.SECONDS.sleep(1);
                nextTrivia = Boolean.TRUE;

            } else {
                finish();
                Intent intent = new Intent(this, Lost_play.class);
                numberTrivia.put("total",String.valueOf(numberTrivia.size()-1));
                intent.putExtra("count",numberTrivia);

                startActivity(intent);
                nextTrivia = Boolean.FALSE;
            }
        }
        if (respuesta.substring(4).equals("3")) {
            if (v.getId() == R.id.pregunta3) {
                Toast toast = Toast.makeText(getApplicationContext(), "Vas bien!", Toast.LENGTH_SHORT);
                toast.show();
                TimeUnit.SECONDS.sleep(1);
                nextTrivia = Boolean.TRUE;

            } else {
                finish();
                Intent intent = new Intent(this, Lost_play.class);
                numberTrivia.put("total",String.valueOf(numberTrivia.size()-1));
                intent.putExtra("count",numberTrivia);
                startActivity(intent);
                nextTrivia = Boolean.FALSE;

            }
        }
        if (respuesta.substring(4).equals("4")) {
            if (v.getId() == R.id.pregunta4) {
                Toast toast = Toast.makeText(getApplicationContext(), "Ya casi!", Toast.LENGTH_SHORT);
                toast.show();
                TimeUnit.SECONDS.sleep(1);
                nextTrivia = Boolean.TRUE;

            } else {
                finish();
                Intent intent = new Intent(this, Lost_play.class);
                numberTrivia.put("total",String.valueOf(numberTrivia.size()-1));
                intent.putExtra("count",numberTrivia);
                startActivity(intent);
                nextTrivia = Boolean.FALSE;

            }
        }
        if (respuesta.substring(4).equals("5")) {
            if (v.getId() == R.id.pregunta4) {
                Toast toast = Toast.makeText(getApplicationContext(), "Ya casi!", Toast.LENGTH_SHORT);
                toast.show();
                TimeUnit.SECONDS.sleep(1);
                nextTrivia = Boolean.TRUE;

            } else {
                finish();
                Intent intent = new Intent(this, Lost_play.class);
                numberTrivia.put("total",String.valueOf(numberTrivia.size()-1));
                intent.putExtra("count",numberTrivia);
                startActivity(intent);
                nextTrivia = Boolean.FALSE;

            }
        }

        setVariables();

        if (Boolean.FALSE == litNotRep) {
        if (nextTrivia) {
//
                txtQuestion.setText(trivia.get(pregunta));
                opcion1.setText(trivia.get(op1));
                opcion2.setText(trivia.get(op2));
                opcion3.setText(trivia.get(op3));
                opcion4.setText(trivia.get(op4));
                respuesta = trivia.get(respuesta);
                System.out.println("Prueba " + numberTrivia);



            if (Integer.valueOf(pregunta.substring(8)) == 1) {
                imv_photo.setImageDrawable(getDrawable(R.drawable.autobots));


            }
            if (Integer.valueOf(pregunta.substring(8)) == 2) {
                imv_photo.setImageDrawable(getDrawable(R.drawable.onepiece));

            }
            if (Integer.valueOf(pregunta.substring(8)) == 3) {
                imv_photo.setImageDrawable(getDrawable(R.drawable.avengers));

            }
            if (Integer.valueOf(pregunta.substring(8)) == 4) {
                imv_photo.setImageDrawable(getDrawable(R.drawable.doctor));


            }
            if (Integer.valueOf(pregunta.substring(8)) == 5) {
                imv_photo.setImageDrawable(getDrawable(R.drawable.spiderman));

            }

        }
        }
    }

}