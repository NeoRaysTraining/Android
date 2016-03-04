package com.example.sagar.itcs.firstgmail;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class RegisterActivity extends AppCompatActivity {

    Button button1;
    public final static String MESSAGE_KEY= LoginActivity.MESSAGE_KEY;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


       /* Intent intent=getIntent();
        String messsage=intent.getStringExtra(MESSAGE_KEY);
        TextView textView=new TextView(this);
        textView.setTextSize(45);
        textView.setText(messsage+" Your WelCome");
        //setContentView(textView);

       setContentView(R.layout.activity_register);
       // setContentView(textView);*/

       button1=(Button)findViewById(R.id.regbutton);
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

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(RegisterActivity.this, "Registration Successfull", Toast.LENGTH_SHORT).show();
                finish();
            }
        });


    }

}
