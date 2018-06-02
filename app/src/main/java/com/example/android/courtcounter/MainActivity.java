package com.example.android.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    int scoreTeamA = 0;

    /**
     * Increase the score for Team A by 3.
     */

    public void addThreeForTeamA(View v) {
        scoreTeamA = scoreTeamA + 3
        displayForTeamA(scoreTeamA);

    }

    /**
     * Increase the score for Team A by 2.
     */
    public void addTwoForTeamA(View v) {
        scoreTeamA = scoreTeamA + 2
        displayForTeamA(scoreTeamA);

    }
    /**
     * Increase the score for Team A by 1.
     */
    public void_addOneForTeamA(View v) {
        scoreTeamA = scoreTeamA + 1
        displayForTeamA(scoreTeamA);

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        displayForTeamA(9);
    }

    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }
    /**
     * Increase the score for Team B by 3.
     */
    int scoreTeamB = 0;

    public void addThreeForTeamB(View v) {
        scoreTeamB = scoreTeamB + 3
        displayForTeamA(scoreTeamB);

    }
    /**
     * Increase the score for Team B by 2.
     */
    public void addTwoForTeamB(View v) {
        scoreTeamB = scoreTeamB + 2
        displayForTeamA(scoreTeamB);

    }
    /**
     * Increase the score for Team B by 1.
     */
    public void addOneForTeamB(View v) {
        scoreTeamB = scoreTeamB + 1
        displayForTeamA(scoreTeamB);

    }

    /**
     * Displays the given score for Team B.
     */
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score);
    }

    /**
     * Resets the score for Team A and B.
     */
public void resetScore (View v){
    scoreTeamA = 0;
    scoreTeamB = 0;
    displayForTeamA (scoreTeamA);
    displayForTeamB(scoreTeamB);
}


}
