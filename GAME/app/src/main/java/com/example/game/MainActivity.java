package com.example.game;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity  extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tvScore = (TextView)findViewById(R.id.tvScore);
        tvBest = (TextView)findViewById(R.id.tvBest);
        SharedPreferences sp = getSharedPreferences("2048", Context.MODE_PRIVATE);
        bestScore = sp.getInt("best", 0);
        tvBest.setText(score + "");
        mainActivity = this;
    }
    public static MainActivity getMainActivity() {
        return mainActivity;
    }
    public void clearScore() {
        score = 0;
        showScore();
    }

    public void showScore() {
        tvScore.setText(score + "");
        tvBest.setText(bestScore + "");
    }

    public void addScore(int s) {
        score += s;
        showScore();
    }

    public int getScore() {
        return score;
    }

    public void setBestScore(int s) {
        bestScore = s;
        showScore();
    }

    private int score = 0;
    private int bestScore = 0;
    private TextView tvScore;
    private TextView tvBest;
    private static MainActivity mainActivity = null;
}

