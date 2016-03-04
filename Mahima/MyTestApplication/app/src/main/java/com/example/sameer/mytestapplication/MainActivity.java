package com.example.sameer.mytestapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText editText1, editText2;
    final static String key = "key-constant";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText1=(EditText)findViewById(R.id.edit_text1);
        editText2=(EditText)findViewById(R.id.edit_text2);


        Button button=(Button)findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String s1=editText1.getText().toString();
                String s2=editText2.getText().toString();
                String s3="mahima";
                String s4="123";
                String s5="";

                if(s1.equals(s3) & s2.equals(s4))
                {
                    Intent intent = new Intent(MainActivity.this, Main2Activity.class);
                    intent.putExtra(key, s1);
                    startActivity(intent);
                }
                else if((s1.equals(s5)) & (s2.equals(s5)))
                {
                    TextView textView = (TextView)findViewById(R.id.error_text_id);
                    textView.setVisibility(View.VISIBLE);
                }
                else
                {
                 Toast toast=   Toast.makeText(MainActivity.this,"Invalid User",Toast.LENGTH_SHORT);
                    toast.setGravity(Gravity.CENTER,0,0);
                    toast.show();
                }

            }
        });


    }
}
