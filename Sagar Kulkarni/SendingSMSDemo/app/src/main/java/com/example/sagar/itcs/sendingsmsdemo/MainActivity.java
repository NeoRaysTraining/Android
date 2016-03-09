package com.example.sagar.itcs.sendingsmsdemo;

import android.content.Intent;
import android.net.Uri;
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

    EditText textPhno;
    EditText textMessage;
    Button button_1,button_2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        button_1=(Button)findViewById(R.id.button_1);
        textPhno=(EditText)findViewById(R.id.editText_1);
        textMessage=(EditText)findViewById(R.id.editText_2);
        button_2=(Button)findViewById(R.id.button_2);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
        button_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sendSms();
            }
        });
    }

    protected void sendSms(){
        Log.i("Send Sms ", "");
        Intent smsIntent = new Intent(Intent.ACTION_SENDTO);
        smsIntent.addCategory(Intent.CATEGORY_DEFAULT);
        smsIntent.setType("vnd.android-dir/mms-sms");
        smsIntent.setData(Uri.parse("smsTo:"));
        smsIntent.putExtra("address", new String("01234"));
        smsIntent.putExtra("SMS body", "Test");

        /*Intent intent=new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse("smsto:"));
        intent.setType("vnd.android-dir/mms-sms");
        intent.putExtra("address", new String("01234"));
        intent.putExtra("SMS body","Test");*/

        try{
            startActivity(smsIntent);
            finish();
            Log.i("Finished Sending SMS..","");

        }catch(Exception e){
            Toast.makeText(getApplicationContext(), " Sms failed,Please try later...!", Toast.LENGTH_SHORT).show();
            e.printStackTrace();
         }
    }

    public void sendSmsMessage(View view){
        Log.i("Send Sms ","");
        String phoneNO=textPhno.getText().toString();
        String messageT=textMessage.getText().toString();
       try {
           SmsManager smsManager = SmsManager.getDefault();
           smsManager.sendTextMessage(phoneNO,null,messageT,null,null);
           Toast.makeText(getApplicationContext()," SMS Sent!! ",Toast.LENGTH_LONG).show();
       }catch (Exception e){
           Toast.makeText(getApplicationContext()," SMS Failed to Send!!Please try again.. ",Toast.LENGTH_LONG).show();
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
