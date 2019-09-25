package com.example.digitalscoreboard;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button buttonHome;
    Button buttonGuest;
    Button buttonPenaltyHome;
    Button buttonPenaltyGuest;
    Button buttonClear;

    int counterHome = 0;
    int counterGuest = 0;
    int counterPenaltyHome = 0;
    int counterPenaltyGuest = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonHome = findViewById(R.id.buttonHome);
        buttonGuest = findViewById(R.id.buttonGuest);
        buttonPenaltyHome = findViewById(R.id.buttonPenaltyHome);
        buttonPenaltyGuest = findViewById(R.id.buttonPenaltyGuest);
        buttonClear = findViewById(R.id.buttonClear);


        //on app launch TextView will show zero

        buttonHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                counterHome = counterHome + 1;
                buttonHome.setText(String.valueOf(counterHome));
            }
        });

        buttonGuest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                counterGuest = counterGuest + 1;
                buttonGuest.setText(String.valueOf(counterGuest));
            }
        });

        buttonPenaltyHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                counterPenaltyHome = counterPenaltyHome + 1;
                buttonPenaltyHome.setText(String.valueOf(counterPenaltyHome));
            }
        });

        buttonPenaltyGuest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                counterPenaltyGuest = counterPenaltyGuest + 1;
                buttonPenaltyGuest.setText(String.valueOf(counterPenaltyGuest));
            }
        });

        buttonClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                buttonHome.setText("0");
                buttonGuest.setText("0");
                buttonPenaltyHome.setText("0");
                buttonPenaltyGuest.setText("0");
                counterHome = 0;
                counterGuest = 0;
                counterPenaltyHome = 0;
                counterPenaltyGuest = 0;
            }
        });
    }
}


