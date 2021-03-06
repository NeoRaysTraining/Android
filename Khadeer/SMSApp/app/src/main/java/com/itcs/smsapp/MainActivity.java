package com.itcs.smsapp;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.telephony.SmsManager;
import android.util.Log;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
Button sendBtn;
    EditText txtphoneNo;
    EditText txtMessage;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        sendBtn = (Button)findViewById(R.id.btnSendSms);
        txtphoneNo = (EditText)findViewById(R.id.editText1);
        txtMessage = (EditText)findViewById(R.id.editText2);
        sendBtn.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View view)
            {
                sendSMSMessage();
            }
        });
    }

    protected void sendSMSMessage()
    {
        Log.i("Send SMS", "");
        String phoneNo = txtphoneNo.getText().toString();
        String message = txtMessage.getText().toString();
        try
        {
            SmsManager smsManager=SmsManager.getDefault();
            smsManager.sendTextMessage(phoneNo,null,message,null,null);
            Toast.makeText(getApplicationContext(),"SMS sent.",Toast.LENGTH_LONG).show();
        }
        catch (Exception e)
        {
            Toast.makeText(getApplicationContext(),"SMS failed , please try again.",Toast.LENGTH_LONG).show();
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
