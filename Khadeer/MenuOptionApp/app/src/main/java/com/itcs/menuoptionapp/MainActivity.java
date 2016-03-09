package com.itcs.menuoptionapp;

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
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
         switch(item.getItemId()){
             case R.id.action1_settings:
                 Toast.makeText(MainActivity.this, " Action 1 is Selected ", Toast.LENGTH_SHORT).show();
                 return  true;
             case R.id.action2_settings:
                 Toast.makeText(MainActivity.this, "Action 2 is selected", Toast.LENGTH_SHORT).show();
                 return true;
             case R.id.action3_settings:
                 Toast.makeText(MainActivity.this, "Action 3 is selected", Toast.LENGTH_SHORT).show();
                 return true;
             case R.id.action4_settings:
                 Toast.makeText(MainActivity.this, "Action 4 is selected", Toast.LENGTH_SHORT).show();
                 return true;
             case R.id.action5_settings:
                 Toast.makeText(MainActivity.this, "Action 5 is selected", Toast.LENGTH_SHORT).show();
                 return true;
             case R.id.action_settings:
                 return true;
             default:
                 return super.onOptionsItemSelected(item);
         }

    }
}
