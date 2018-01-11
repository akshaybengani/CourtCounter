package com.akshaybengani.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
//import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }
    int team1points=0;
    int team2points=0;



    public void p3Team1(View view)
    {
        team1points=team1points+3;
        displayScreen1(team1points);
    }
    public void p2Team1(View view)
    {
        team1points=team1points+2;
        displayScreen1(team1points);
    }
    public void p1Team1(View view)
    {
        team1points=team1points+1;
        displayScreen1(team1points);
    }
    public void p3Team2(View view)
    {
        team2points=team2points+3;
        displayScreen2(team2points);
    }
    public void p2Team2(View view)
    {
        team2points=team2points+2;
        displayScreen2(team2points);
    }
    public void p1Team2(View view)
    {
        team2points=team2points+1;
        displayScreen2(team2points);
    }
    public void reset(View view)
    {
        team1points=0;
        team2points=0;
        displayScreen1(team1points);
        displayScreen2(team2points);
    }
    public void displayScreen1(int value1)
    {
        TextView team1=findViewById(R.id.Team1Counter);
        team1.setText(""+value1);
    }
    public void displayScreen2(int value2)
    {
        TextView team2=findViewById(R.id.Team2Counter);
        team2.setText(""+value2);

    }


}
