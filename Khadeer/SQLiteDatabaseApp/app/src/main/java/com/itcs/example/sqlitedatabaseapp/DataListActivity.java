package com.itcs.example.sqlitedatabaseapp;

import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ListView;

    public class DataListActivity extends AppCompatActivity
    {
        ListView listView;
        SQLiteDatabase sqLiteDatabase;
        UserDbHelper userDbHelper;
        Cursor cursor;
        ListDataAdapter listDataAdapter;

        @Override
        protected void onCreate(Bundle savedInstanceState)
        {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.data_list_layout);
            listView = (ListView) findViewById(R.id.list_view);
            userDbHelper = new UserDbHelper(getApplicationContext());
            sqLiteDatabase = userDbHelper.getReadableDatabase();
            cursor=userDbHelper.getInformations(sqLiteDatabase);
            listDataAdapter = new ListDataAdapter(getApplicationContext(),R.layout.row_layout);
            listView.setAdapter(listDataAdapter);

            if(cursor.moveToFirst())
            {
                do
                {
                    String name,mob,email;

                    name = cursor.getString(0);
                    mob = cursor.getString(1);
                    email = cursor.getString(2);

                    DataProvider dataProvider = new DataProvider(name,mob,email);

                    listDataAdapter.add(dataProvider);
                }
                while (cursor.moveToNext());

            }
        }

        public void home(View view)
        {
            startActivity(new Intent(DataListActivity.this,MainActivity.class));
        }

    }
