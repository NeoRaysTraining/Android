package com.example.sagar.itcs.contextmenudemo;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.ContextMenu;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    ListView listView;
    String[] contacts;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        listView=(ListView)findViewById(R.id.listView_1);
        contacts=getResources().getStringArray(R.array.contact_names);
        //ArrayAdapter object is used to read  listview items or read the Array values.
        ArrayAdapter<String> adapter=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,contacts);
        listView.setAdapter(adapter);
        // Register the ListView  for Context menu
        registerForContextMenu(listView);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);
      //creating a Context of Items (Call and Sms).
        menu.setHeaderTitle("Select the Action");
        menu.add(0, v.getId(), 0, "Call");
        menu.add(0,v.getId(),0,"Sms");
    }

    @Override
    public boolean onContextItemSelected(MenuItem item) {
        //performing the click events(When item get selected )
        if(item.getTitle()=="Call"){
            Toast.makeText(MainActivity.this, " Sending Call code ", Toast.LENGTH_SHORT).show();
        }else if(item.getTitle()=="Sms"){
            Toast.makeText(MainActivity.this, " Sending Sms Code ", Toast.LENGTH_SHORT).show();
        }else{
            return  false;
        }
        return true;
    }
}
