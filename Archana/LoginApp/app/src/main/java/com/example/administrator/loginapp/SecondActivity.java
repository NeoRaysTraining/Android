package com.example.administrator.loginapp;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;


public class SecondActivity extends Activity
{
    final String  MESSAGE_KEY = "constant";
    String str;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        str = getIntent().getStringExtra(MESSAGE_KEY);
        //setContentView(R.layout.second_activity);

        TextView textView = new TextView(this);
        textView.setText("Welcome " + str);
        textView.setTextSize(25);
        setContentView(textView);
        setContentView(R.layout.register);

        Button button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(SecondActivity.this, "its working", Toast.LENGTH_SHORT).show();
            }
        });
    }


}
