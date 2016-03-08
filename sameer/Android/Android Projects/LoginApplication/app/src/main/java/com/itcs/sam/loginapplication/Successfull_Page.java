package com.itcs.sam.loginapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class Successfull_Page extends AppCompatActivity {

    final static String key = "key-constant";
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
         super.onCreate(savedInstanceState);
         setContentView(R.layout.activity_successfull__page);
       //  TextView textView = (TextView)findViewById(R.id.text_id);

        TextView textV = new TextView(this);
         String value =getIntent().getStringExtra(key);
        textV.setText(value + " welcome");
        setContentView(textV);


/*       String value =getIntent().getStringExtra(key);
         TextView textView=new TextView(this);
         textView.setText(value);
         setContentView(textView);
*/

    }
}
