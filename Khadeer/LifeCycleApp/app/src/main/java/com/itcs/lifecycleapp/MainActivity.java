package com.itcs.lifecycleapp;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast.makeText(MainActivity.this, "ON CREATE", Toast.LENGTH_LONG).show();
            }
    @Override
    protected void onStart()
    {
        super.onStart();
        Toast.makeText(MainActivity.this, "ON START", Toast.LENGTH_LONG).show();
    }
    @Override
    protected void onPause()
    {
        super.onPause();
        Toast.makeText(MainActivity.this, "ON PAUSE", Toast.LENGTH_LONG).show();
    }
    @Override
    protected void onRestart()
    {
        super.onRestart();
        Toast.makeText(MainActivity.this, "ON RESTART", Toast.LENGTH_LONG).show();
    }
    @Override
    protected void onStop()
    {
        super.onStop();
        Toast.makeText(MainActivity.this, " ON STOP", Toast.LENGTH_LONG).show();
    }
    @Override
    protected void onDestroy() {
        super.onDestroy();
        Toast.makeText(MainActivity.this, " ON DESTROY", Toast.LENGTH_LONG).show();
    }
}
