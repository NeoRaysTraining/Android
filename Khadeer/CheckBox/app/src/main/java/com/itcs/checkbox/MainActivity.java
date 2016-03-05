package com.itcs.checkbox;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    CheckBox cb1,cb2,cb3,cb4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
         cb1=(CheckBox)findViewById(R.id.edit_checkbox1);
         cb2=(CheckBox)findViewById(R.id.edit_checkbox2);
         cb3=(CheckBox)findViewById(R.id.edit_checkbox3);
         cb4=(CheckBox)findViewById(R.id.edit_checkbox4);
        Button button=(Button)findViewById(R.id.edit_Button);


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String str=""; //declaring global variable
                if(cb1.isChecked())
                {
                    str +=cb1.getText().toString();
                }
                if(cb2.isChecked())
                {
                    str +=cb2.getText().toString();
                }
                if(cb3.isChecked())
                {
                    str +=cb3.getText().toString();
                }
                if(cb4.isChecked())
                {
                    str +=cb4.getText().toString();
                }
                if(str!= "")
                {
                    Toast.makeText(MainActivity.this,str,Toast.LENGTH_LONG).show();
                }
                else
                {
                    Toast.makeText(MainActivity.this,"Please Select either of CheckBox",Toast.LENGTH_LONG).show();
                }
            }
        });
    }
}
