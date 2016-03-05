package com.example.administrator.loginapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText username, password;
    TextView error_text;
    Button login_button;
    String name="", pass="";
    final String  MESSAGE_KEY = "constant";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        username =(EditText) findViewById(R.id.username_edit_id);
        password = (EditText) findViewById(R.id.password_edit_id);
        login_button = (Button) findViewById(R.id.login_button_id);
        error_text = (TextView) findViewById(R.id.error_text_id);
        login_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                name = username.getText().toString();
                pass = password.getText().toString();
                if (name.equals("archana") & pass.equals("archana"))
                {
                    Intent intent = new Intent(getBaseContext(), SecondActivity.class);
                    error_text.setVisibility(View.INVISIBLE);
                    intent.putExtra(MESSAGE_KEY,name);
                    startActivity(intent);

                }
                else if (name.equals("") || pass.equals(""))
                {
                    Toast.makeText(MainActivity.this, "username and password cannot be empty", Toast.LENGTH_SHORT).show();
                    error_text.setVisibility(View.VISIBLE);
                    error_text.setText(R.string.empty_credentials);
                }
                else
                {
                    Toast.makeText(MainActivity.this, "please enter correct username and password",
                            Toast.LENGTH_SHORT).show();
                    username.setText("");
                    password.setText("");
                    error_text.setVisibility(View.VISIBLE);
                    error_text.setText(R.string.wrong_credentials);
                }
            }
        });



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

    public void registerClick(View view) {
        Intent intent = new Intent(this,SecondActivity.class);
        //intent.putExtra(MESSAGE_KEY,"register");
        startActivity(intent);
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
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
