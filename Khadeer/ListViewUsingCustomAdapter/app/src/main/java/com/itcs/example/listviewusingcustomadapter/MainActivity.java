package com.itcs.example.listviewusingcustomadapter;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {
    ListView listView ;
    int[] image_resources = {R.drawable.img1,R.drawable.img2,R.drawable.img3,R.drawable.img4,R.drawable.img5,R.drawable.img6,R.drawable.img7,R.drawable.img8,R.drawable.img9,R.drawable.img10,R.drawable.img11,R.drawable.img12};
    String[] Fname;
    String[] Lname;
    String[] Native;
    CustomAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView = (ListView) findViewById(R.id.listView1);
        Fname = getResources().getStringArray(R.array.Fname);
        Lname = getResources().getStringArray(R.array.Lname);
        Native = getResources().getStringArray(R.array.Native);
        adapter = new CustomAdapter(getApplicationContext(), R.layout.custom_layout);
        listView.setAdapter(adapter);

        int i = 0;
        for (String fname : Fname) {
            CustomAdapterDataProvider DataProvider = new CustomAdapterDataProvider(fname, Lname[i], Native[i], image_resources[i]);
            i++;
            adapter.add(DataProvider);
        }
    }
    }



