package com.example.sagar.itcs.activtiylifecycle;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    /** Called when the activity is first created. */

    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("The Create() event", "");
        Toast.makeText(MainActivity.this, "onCreate()", Toast.LENGTH_SHORT).show();
    }


   /* Called when the activity is about to become visible.*/

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("The Start() Event ", "");
        Toast.makeText(MainActivity.this, "onStart()", Toast.LENGTH_SHORT).show();
    }


    //** Called when the activity has become visible. *//*
    @Override
    protected void onResume() {
        super.onResume();
        Log.d("The Resume Event", "");
        Toast.makeText(MainActivity.this, "onResume", Toast.LENGTH_SHORT).show();
    }

    //** Called when another activity is taking focus. *//*
    @Override
    protected void onPause() {
        super.onPause();
        Log.d("The Pause Event", "");
        Toast.makeText(MainActivity.this, "onPause()", Toast.LENGTH_SHORT).show();
    }

    //** Called when the activity is no longer visible. *//*
    @Override
    protected void onStop() {
        super.onStop();
        Log.d("The Stop Event", "");
        Toast.makeText(MainActivity.this, "onStop()", Toast.LENGTH_SHORT).show();
    }

    //** Called just before the activity is destroyed. *//*
    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("The Destroy Event", "");
        Toast.makeText(MainActivity.this, "onDestroy()", Toast.LENGTH_SHORT).show();
    }
}
