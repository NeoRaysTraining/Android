package com.itcs.parsingvaluesfromoneavctivitytoanotheractivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

/**
 * Created by khussain on 3/4/2016.
 */
public class SecondActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second);
        String str=getIntent().getStringExtra("KEY"); //IT IS USED TO FETCH THE VALUE SENT BY THE MAIN ACTIVITY
        TextView textView=(TextView)findViewById(R.id.edit_Text);
        textView.setText(str);
    }
}
