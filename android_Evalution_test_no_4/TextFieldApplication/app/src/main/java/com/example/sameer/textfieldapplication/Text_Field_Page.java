package com.example.sameer.textfieldapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ScrollView;

public class Text_Field_Page extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_text__field__page);

        ScrollView scroll = new ScrollView(getApplicationContext());
    }
}
