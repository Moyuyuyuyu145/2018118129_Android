package com.example.activitystyle;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class singleInstance extends AppCompatActivity implements View.OnClickListener {
    private final static String TAG = "singleInstance";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.singleinstance_layout);
        Log.d(TAG, "------singleinstance-----单实例模式-----");
        setTitle("singleinstance");
        settupButtons();
    }
    @Override
    protected void onStart() {
        super.onStart();
    }
    @Override
    protected void onResume() {
        super.onResume();
    }
    @Override
    protected void onPostResume() {
        super.onPostResume();
    }
    @Override
    protected void onPause() {
        super.onPause();
    }
    @Override
    protected void onStop() {
        super.onStop();
    }
    @Override
    protected void onDestroy() {
        super.onDestroy();
    }
    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.tostandard) {
            Intent intent;
            intent = new Intent(this, standard.class);
            startActivity(intent);
        }
        if (v.getId() == R.id.tosingleTask) {
            Intent intent;
            intent = new Intent(this, singleTask.class);
            startActivity(intent);
        }
        if (v.getId() == R.id.tosingleTop) {
            Intent intent;
            intent = new Intent(this, singleTop.class);
            startActivity(intent);
        }
        if (v.getId() == R.id.tosingleInstance) {
            Intent intent;
            intent = new Intent(this,singleInstance.class);
            startActivity(intent);
        }
    }

    private void settupButtons() {
        Button b;
        b = (Button) findViewById(R.id.tostandard);
        b.setOnClickListener(this);
        b = (Button) findViewById(R.id.tosingleTask);
        b.setOnClickListener(this);
        b = (Button) findViewById(R.id.tosingleTop);
        b.setOnClickListener(this);
        b = (Button) findViewById(R.id.tosingleInstance);
        b.setOnClickListener(this);

    }
}
