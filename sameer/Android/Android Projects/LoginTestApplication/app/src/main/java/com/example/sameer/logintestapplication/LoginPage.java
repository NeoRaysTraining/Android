package com.example.sameer.logintestapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class LoginPage extends AppCompatActivity {
    EditText username,password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_page);
        username=(EditText)findViewById(R.id.edit_text1);
        password=(EditText)findViewById(R.id.edit_text2);


        Button button=(Button)findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String s1 = username.getText().toString();
                String s2 = password.getText().toString();
                String s3 = "sameer";
                String s4 = "12345";
                String s5 = "";

                if (s1.equals(s3) & s2.equals(s4)) {
                    startActivity(new Intent(LoginPage.this, SucessfullPage.class));
                } else if ((s1.equals(s5)) & (s2.equals(s5))) {
                    TextView textView = (TextView) findViewById(R.id.error_text_id);
                    textView.setVisibility(View.VISIBLE);
                } else {
                    Toast.makeText(LoginPage.this, "Invalid User", Toast.LENGTH_SHORT).show();
                }
            }
        });


    }
}

