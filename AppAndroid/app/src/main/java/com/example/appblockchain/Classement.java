package com.example.appblockchain;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Classement extends AppCompatActivity {

    private Button add_result_button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_classement);

        this.add_result_button = (Button) findViewById(R.id.add_result_button);

        add_result_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent otherActivity = new Intent(getApplicationContext(), FormulaireRequete.class);
                startActivity(otherActivity);
                finish();
            }
        });
    }
}
