package com.example.sagar.itcs.firstgmail;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {

    Button button;
    EditText editText,editText1;
    Button button1;
    public final static String MESSAGE_KEY= LoginActivity.MESSAGE_KEY;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
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


        editText=(EditText)findViewById(R.id.username_id);
        editText1=(EditText)findViewById(R.id.pwd_id);
        button=(Button)findViewById(R.id.button_1);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s1=editText.getText().toString();//Getting the Edittext by gettext and converting to String
                String s2=editText1.getText().toString();
                if (s1.equals("Sagar") &
                        s2.equals("sagar")) {
                    /*Intent i = new Intent(getApplicationContext(), RegisterActivity.class);
                    i.putExtra(MESSAGE_KEY,s1);
                    startActivity(i);*/
                   setContentView(R.layout.successfullactivity);
                } else {
                    editText.setVisibility(View.VISIBLE);
                    editText.setBackgroundColor(Color.RED);
                    editText1.setBackgroundColor(Color.RED);
                    Toast.makeText(getApplicationContext(), "Wrong Credentials", Toast.LENGTH_SHORT).show();

                }
            }
        });
    }

  public void registerClick(View view){
        button=(Button)findViewById(R.id.button_2);
        Intent intent=new Intent(this,RegisterActivity.class);
        startActivity(intent);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_login, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
