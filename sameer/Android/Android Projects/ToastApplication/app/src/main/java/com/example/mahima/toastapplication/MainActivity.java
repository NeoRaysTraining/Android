package com.example.mahima.toastapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button=(Button)findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText editText=(EditText)findViewById(R.id.edit_text1);
                EditText editText1=(EditText)findViewById(R.id.edit_text2);
                String s1=editText.getText().toString();
                String s2=editText1.getText().toString();
                Toast.makeText(MainActivity.this,(s1+'\n'+s2),Toast.LENGTH_SHORT).show();

            }
        });
    }
}
