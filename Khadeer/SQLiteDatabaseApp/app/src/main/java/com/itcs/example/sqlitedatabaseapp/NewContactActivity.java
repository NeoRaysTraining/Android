package com.itcs.example.sqlitedatabaseapp;

import android.app.Activity;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

/**
 * Created by khussain on 4/23/2016.
 */
public class NewContactActivity extends Activity {
    EditText ContactName,ContactMobile,ContactEmail;
    Context context;
    UserDbHelper userDbHelper;
    SQLiteDatabase sqLiteDatabase;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.new_contact_layout);
        ContactName=(EditText)findViewById(R.id.contact_name);
        ContactMobile=(EditText)findViewById(R.id.contact_mobile);
        ContactEmail=(EditText)findViewById(R.id.contact_email);
    }
    public void addContact(View view)
    {
        String name=ContactName.getText().toString();
        String mobile=ContactMobile.getText().toString();
        String email=ContactEmail.getText().toString();
        userDbHelper=new UserDbHelper(getApplicationContext());
        sqLiteDatabase=userDbHelper.getWritableDatabase();
        userDbHelper.addInformations(name,mobile,email,sqLiteDatabase);
        Toast.makeText(getApplicationContext(),"Data Saved",Toast.LENGTH_LONG).show();
        userDbHelper.close();
    }
}
