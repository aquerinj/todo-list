package com.example.appblockchain;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import java.util.ArrayList;
import java.util.List;

public class FormulaireRequete extends AppCompatActivity {

    Spinner spinner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_formulairerequete);

        // Récupération du Spinner déclaré dans le fichier activity_formulairerequete.xml de res/layout
        spinner = findViewById(R.id.joueur_spinner);

        // Création d'une liste d'éléments à mettre dans le Spinner
        List<String> exempleList = new ArrayList<>();
        exempleList.add("Assinie");
        exempleList.add("Bassam");
        exempleList.add("Abidjan");

        // Le Spinner a besoin d'un adapter pour sa présentation, on lui passe le contexte (this) et un fichier de présentation par défaut (android.R.layout.simple_spinner_item)
        // avec la liste des éléments (exempleList)
        ArrayAdapter<String> adapter = new ArrayAdapter<>(
                this,
                android.R.layout.simple_spinner_item,
                exempleList
        );

        // On définit une présentation du spinner quand il est déroulé (android.R.layout.simple_spinner_dropdown_item)
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        // Enfin, on passe l'adapter au Spinner
        spinner.setAdapter(adapter);
    }
}
