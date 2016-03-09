package com.itcs.menu_application;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.telephony.SmsManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.concurrent.ExecutionException;


public class MainActivity extends AppCompatActivity {

    Button sendbtn;
    EditText txtmessage;
    EditText txtphone_num;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
         sendbtn=(Button)findViewById(R.id.btn);
         txtmessage=(EditText)findViewById(R.id.edit_text1);
        txtphone_num=(EditText)findViewById(R.id.edit_text2);
        sendbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sendSMSMessage();
            }
        });

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }
void sendSMSMessage()
{
    Log.i("Send SMS", "");
    String msg=txtmessage.getText().toString();
    String phone=txtphone_num.getText().toString();
    try{
        SmsManager smsManager=SmsManager.getDefault();
        smsManager.sendTextMessage(msg, null,phone, null,null);
        Toast.makeText(MainActivity.this,"message Sent",Toast.LENGTH_SHORT).show();

    }
    catch (Exception e)
    {
        Toast.makeText(getApplicationContext(),"sending failed",Toast.LENGTH_SHORT).show();
        e.printStackTrace();
    }

}

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
