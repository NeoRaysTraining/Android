package com.itcs.example.sqlitedatabaseapp;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by khussain on 4/23/2016.
 */
public class SearchContactActivity extends AppCompatActivity {
    TextView Display_email,Display_mobile;
    EditText Search_Name;
    UserDbHelper userDbHelper;
    SQLiteDatabase sqLiteDatabase;
    String search_name;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView( R.layout.search_contact_layout);
        Search_Name=(EditText)findViewById(R.id.search_name);
        Display_mobile=(TextView)findViewById(R.id.displayMobile);
        Display_email=(TextView)findViewById(R.id.displayEmail);
        Display_email.setVisibility(View.GONE);
        Display_mobile.setVisibility(View.GONE);
    }
    public  void  searchContact(View view)
    {
        search_name=Search_Name.getText().toString();
        userDbHelper=new UserDbHelper(getApplicationContext());
        sqLiteDatabase=userDbHelper.getReadableDatabase();
        Cursor cursor= userDbHelper.getContact(search_name,sqLiteDatabase);
        if (cursor.moveToFirst())
        {
            String Mobile=cursor.getString(0);
            String Email=cursor.getString(1);
            Display_mobile.setText(Mobile);
            Display_email.setText(Email);
            Display_mobile.setVisibility(View.VISIBLE);
            Display_email.setVisibility(View.VISIBLE);
        }
    }
    public void deleteContact(View view)
    {
        userDbHelper=new UserDbHelper(getApplicationContext());
        sqLiteDatabase=userDbHelper.getReadableDatabase();
        userDbHelper.deleteInformation(search_name,sqLiteDatabase);
        Toast.makeText(getBaseContext(), "Contact Deleted", Toast.LENGTH_SHORT).show();
    }
}
