package com.example.sameer.mytestapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    final static String key = "key-constant";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        String value = getIntent().getStringExtra(key);
        TextView textView = (TextView)findViewById(R.id.text);
        textView.setText(value);
    }
}
