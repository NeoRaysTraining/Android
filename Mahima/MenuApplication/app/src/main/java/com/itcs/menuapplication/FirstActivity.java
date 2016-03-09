package com.itcs.menuapplication;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class FirstActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);
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
        getMenuInflater().inflate(R.menu.menu_first, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        switch (item.getItemId())
        {
            case R.id.SELECT:
                Toast.makeText(FirstActivity.this,"SELECTED SUCCESSFULLY",Toast.LENGTH_SHORT).show();
            case R.id.ALTER:
                Toast.makeText(FirstActivity.this,"ALTER SUCCESSFULLY",Toast.LENGTH_SHORT).show();
            case R.id.DELETE:
                Toast.makeText(FirstActivity.this,"DELETED SUCCESSFULLY",Toast.LENGTH_SHORT).show();
            case R.id.MODIFY:
                Toast.makeText(FirstActivity.this,"MODIFY SUCCESSFULLY",Toast.LENGTH_SHORT).show();
        }

        //noinspection SimplifiableIfStatemen


        return super.onOptionsItemSelected(item);
    }


}
