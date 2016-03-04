package com.example.mahima.checkbox_app;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;
import android.widget.Toast;

public class FirstActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);
        final CheckBox checkBoxOrange = (CheckBox)findViewById(R.id.orange);
        final CheckBox checkBoxApple = (CheckBox)findViewById(R.id.apple);
        final CheckBox checkBoxMango = (CheckBox)findViewById(R.id.mango);
        final CheckBox checkBoxChikoo = (CheckBox)findViewById(R.id.chikoo);
        Button button = (Button)findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                String str = "";
            if(checkBoxOrange.isChecked())
            {
                str=checkBoxOrange.getText().toString()+'\n';
            }
                if(checkBoxApple.isChecked())
                {
                    str+=checkBoxApple.getText().toString()+'\n';
                }
                if(checkBoxMango.isChecked())
                {
                    str+=checkBoxMango.getText().toString()+'\n';
                }
                if(checkBoxChikoo.isChecked())
                {
                    str+=checkBoxChikoo.getText().toString()+'\n';
                }
                if(str!="")
                {
                    Toast.makeText(FirstActivity.this,str,Toast.LENGTH_SHORT).show();
                    startActivity(new Intent(FirstActivity.this, SecondActivity.class));


                }
                else
                {
                    Toast.makeText(FirstActivity.this,"Select any one",Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
