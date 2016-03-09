package com.example.administrator.menuaplication;

import android.app.SearchManager;
import android.content.Context;
import android.content.Intent;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.telephony.SmsManager;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.SearchView;

public class MainActivity extends AppCompatActivity {

    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = (Button) findViewById(R.id.context_button_id);
        button.setOnCreateContextMenuListener(this);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        super.onCreateOptionsMenu(menu);

        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        super.onOptionsItemSelected(item);

        if (item.getTitle().toString().equals("Exit"))
        {
            finish();
        }
        else if (item.getTitle().toString().equals("camera"))
        {
            Intent intent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
            startActivity(intent);
        }
        return true;
    }

    public void onColorChange(MenuItem item)
    {
        RelativeLayout layout = (RelativeLayout) findViewById(R.id.layout_id);
        String color = item.getTitle().toString();
        if (color.equals("Red"))
        {
            layout.setBackgroundColor(getColor(R.color.red));
            item.setChecked(true);
        }
        else if (color.equals("Green"))
        {
            layout.setBackgroundColor(getColor(R.color.green));
            item.setChecked(true);
        }
        else if (color.equals("Yellow"))
        {
            layout.setBackgroundColor(getColor(R.color.yellow));
            item.setChecked(true);
        }
    }

    //android context menu


    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);

        getMenuInflater().inflate(R.menu.menu_main,menu);
    }

    @Override
    public boolean onContextItemSelected(MenuItem item) {
        super.onContextItemSelected(item);

        if (item.getTitle().toString().equals("Exit"))
        {
            finish();
        }


        return true;
    }
}
