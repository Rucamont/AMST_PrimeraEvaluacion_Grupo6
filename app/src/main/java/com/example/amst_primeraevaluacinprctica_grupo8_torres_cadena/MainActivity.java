package com.example.amst_primeraevaluacinprctica_grupo8_torres_cadena;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.HashMap;

public class MainActivity extends AppCompatActivity {
    private Button btnStart;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnStart = (Button) findViewById(R.id.btnStart);

    }
    public void trivia(View view){

        HashMap<String, String> trivia = new HashMap<String, String>();
        // pregunta 1
        trivia.put("pregunta1", "¿Quiénes son los enemigos de los Autobots?" );
        trivia.put("image1","autobots.png");
        trivia.put("op1.1", "Megatrons" );
        trivia.put("op1.2", "•Los agentes de tránsito ATM" );
        trivia.put("op1.3", "El doctor maquihero" );
        trivia.put("op1.4", "Hi-man" );
        trivia.put("resp1","op1.1");
        // pregunta 2
        trivia.put("pregunta2", "¿Como se llama el chico con el sombrero de paja?" );
        trivia.put("image2","autobots.png");
        trivia.put("op2.1", "Juan Fernandez" );
        trivia.put("op2.2", "Angelo Torres " );
        trivia.put("op2.3", "Rubert Cadena" );
        trivia.put("op2.4", "Monky D. luffy" );
        trivia.put("resp2","op2.4");
        // pregunta 3
        trivia.put("pregunta3", "¿Por qué Thor hizo un nuevo martillo?" );
        trivia.put("image3","autobots.png");
        trivia.put("op3.1", "Porque se veía más bonito." );
        trivia.put("op3.2", "Porque era un martillo especial para derrotar a Homero Simpson." );
        trivia.put("op3.3", "Porque era un martillo especial para derrotar a Thanos." );
        trivia.put("op3.4", "Porque se le quedo en su planeta natal y no tenía con que pelear." );
        trivia.put("resp3","op3.3");
        // pregunta 4
        trivia.put("pregunta4", "¿Por qué el protagonista se aferro tanto a cambiar de realidad?" );
        trivia.put("image4","autobots.png");
        trivia.put("op4.1", "Se aburrió en la que vivía" );
        trivia.put("op4.2", "Quería volver a vivir con su novia" );
        trivia.put("op4.3", "Quería tener una vida de doctor" );
        trivia.put("op4.4", "Extrañaba a Iron Man " );
        trivia.put("resp4","op4.2");
        // pregunta 5
        trivia.put("pregunta5", "¿Porque le quitan el traje a Spiderman?" );
        trivia.put("image5","spiderman.png");
        trivia.put("op5.1", "Ya no le quedaba" );
        trivia.put("op5.2", "La familia es primero" );
        trivia.put("op5.3", "No confiaba en sus poderes" );
        trivia.put("op5.4", "Esta es una respuesta genérica que posiblemente este incorrecta" );
        trivia.put("resp5","op5.3");





        finish();
        Intent intent = new Intent(this, Trivia.class);
        intent.putExtra("trivia",trivia);
        startActivity(intent);
    }

}