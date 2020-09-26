package com.example.helloworld1;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class H3 extends AppCompatActivity implements View.OnClickListener {
    private final static String TAG = "Hello3";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_h3);
        Log.d(TAG, "onCreate execute");
        setTitle("Hello3");
        settupButtons();
        Intent intent = this.getIntent();
        if (intent == null) {
            Log.d("test tag", "This activity is invoked without an intent");
        }
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG, "---onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG, "---onResume");
    }

    @Override
    protected void onPostResume() {
        super.onPostResume();
        Log.d(TAG, "---onPostResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG, "---onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG, "---onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "---onDestroy");
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.btToHello1) {
            Intent intent;
            intent = new Intent(this, H1.class);
            startActivity(intent);
        }
        if (v.getId() == R.id.btToHello2) {
            Intent intent;
            intent = new Intent(this, H2.class);
            startActivity(intent);
        }
        if (v.getId() == R.id.btToHello3) {
            Intent intent;
            intent = new Intent(this, H3.class);
            startActivity(intent);
        }
    }

    private void settupButtons() {
        Button b;

        b = (Button) findViewById(R.id.btToHello1);
        b.setOnClickListener(this);
        b = (Button) findViewById(R.id.btToHello2);
        b.setOnClickListener(this);
        b = (Button) findViewById(R.id.btToHello3);
        b.setOnClickListener(this);

    }
}

