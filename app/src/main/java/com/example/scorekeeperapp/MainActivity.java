package com.example.scorekeeperapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView ScoreTeam1TV;
    TextView ScoreTeam2TV;
    Button button1team1;
    Button button2team1;
    Button button3team1;
    Button button1team2;
    Button button2team2;
    Button button3team2;
    int ScoreTeam1;
    int ScoreTeam2;
    Button ResetsScore;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ScoreTeam1TV = (TextView) findViewById(R.id.ScoreTeam1TV);
        ScoreTeam2TV = (TextView) findViewById(R.id.ScoreTeam2TV);
        button1team1 = (Button) findViewById(R.id.button1team1);
        button2team1 = (Button) findViewById(R.id.button2team1);
        button3team1 = (Button) findViewById(R.id.button3team1);
        button1team2 = (Button) findViewById(R.id.button1team2);
        button2team2 = (Button) findViewById(R.id.button2team2);
        button3team2 = (Button) findViewById(R.id.button3team2);
        ScoreTeam1 = 0;
        ScoreTeam2 = 0;
        ResetsScore = (Button) findViewById(R.id.RestsButton);

        ResetsScore.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ScoreTeam1=0;
                ScoreTeam1TV.setText(String.valueOf(ScoreTeam1));
                ScoreTeam2=0;
                ScoreTeam2TV.setText(String.valueOf(ScoreTeam2));
            }
        });

        button1team1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ScoreTeam1++;
                ScoreTeam1TV.setText(String.valueOf(ScoreTeam1));
            }
        });

        button2team1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ScoreTeam1+=2;
                ScoreTeam1TV.setText(String.valueOf(ScoreTeam1));
            }
        });

        button3team1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ScoreTeam1+=3;
                ScoreTeam1TV.setText(String.valueOf(ScoreTeam1));
            }
        });


        button1team2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ScoreTeam2++;
                ScoreTeam2TV.setText(String.valueOf(ScoreTeam2));
            }
        });

        button2team2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ScoreTeam2+=2;
                ScoreTeam2TV.setText(String.valueOf(ScoreTeam2));

            }
        });


        button3team2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ScoreTeam2+=3;
                ScoreTeam2TV.setText(String.valueOf(ScoreTeam2));

            }
        });
    }
}
