package com.example.android.courtcounter;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * the method is called when +3 button is pressed
     */
    public void addThreeForTeamA(View view){
        displayForTeamA(3);
    }

    /**
     * the method is called when +2 button is pressed
     */
    public void addTwoForTeamA(View view){
        displayForTeamA(2);
    }

    /**
     * the method is called when +1 button is pressed
     */
    public void addOneForTeamA(View view){
        displayForTeamA(1);
    }

    /**
     * Display the given score for team A
     */
    private void displayForTeamA(int score){
        TextView scoreView = (TextView)findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }
}
