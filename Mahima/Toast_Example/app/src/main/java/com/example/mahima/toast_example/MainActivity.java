package com.example.sameer.samtoastapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Toast_Activity extends AppCompatActivity
{
    EditText editText1;
    EditText editText2;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_toast_);


        Button button = (Button)findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                editText1=(EditText)findViewById(R.id.edit1);
                editText2=(EditText)findViewById(R.id.edit2);
                String s1 = editText1.getText().toString();
                String s2 = editText2.getText().toString();
                Toast.makeText(Toast_Activity.this,(s1+'\n'+s2), Toast.LENGTH_SHORT).show();

            }
        });
    }
}