package com.example.sagar.itcs.datatoactivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

/**
 * Created by Sagar on 04-03-2016.
 */
public class SecondActivity extends Activity {

    public final static String MESSAGE_KEY=MainActivity.MESSAGE_KEY;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Intent intent=getIntent();
        String message=intent.getStringExtra(MESSAGE_KEY);
        TextView textView=new TextView(this);
        textView.setTextSize(45);
        textView.setText(message);
        setContentView(textView);
    }
}
