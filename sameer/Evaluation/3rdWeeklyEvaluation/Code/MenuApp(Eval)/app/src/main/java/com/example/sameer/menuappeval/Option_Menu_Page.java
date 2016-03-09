package com.example.sameer.menuappeval;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.text.Layout;
import android.view.ContextMenu;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.RatingBar;
import android.widget.RelativeLayout;
import android.widget.Toast;

public class Option_Menu_Page extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_option__menu__page);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        Button button = (Button)findViewById(R.id.button);
        button.setOnCreateContextMenuListener(this);



        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu)
    {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_option__menu__page, menu);
        return true;
    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item)
    {
        RelativeLayout relativeLayout = (RelativeLayout)findViewById(R.id.Relative_layout);
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings)
        {
            return true;
        }
        else if (id == R.id.action_red)
        {
            relativeLayout.setBackgroundColor(getColor(R.color.colorRed));
            Toast.makeText(getApplicationContext(),"Color Changed to Red",Toast.LENGTH_SHORT).show();
        }
        else if (id == R.id.action_blue)
        {
            relativeLayout.setBackgroundColor(getColor(R.color.colorBlue));
            Toast.makeText(getApplicationContext(),"Color Changed to Blue",Toast.LENGTH_SHORT).show();
        }
        else if (id == R.id.action_green)
        {
            relativeLayout.setBackgroundColor(getColor(R.color.colorGreen));
            Toast.makeText(getApplicationContext(),"Color Changed to Green",Toast.LENGTH_SHORT).show();
        }
        else if (id == R.id.action_yellow)
        {
            relativeLayout.setBackgroundColor(getColor(R.color.colorYellow));
            Toast.makeText(getApplicationContext(),"Color Changed to Yellow",Toast.LENGTH_SHORT).show();
        }
        else if (id == R.id.action_help)
        {
            Toast.makeText(getApplicationContext(),"You requested for Help",Toast.LENGTH_SHORT).show();
        }
        else if (id == R.id.action_sign_out)
        {
            Toast.makeText(getApplicationContext(),"Signed out successfully",Toast.LENGTH_SHORT).show();
        }
   /*     else if (id == R.id.action_rate)
        {
            item.setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener() {
                @Override
                public boolean onMenuItemClick(MenuItem item) {
                    Toast.makeText(getApplicationContext(), "Rate this Application", Toast.LENGTH_SHORT).show();
                    startActivity(new Intent(Option_Menu_Page.this, Rate_Page.class));
                    return false;
                }
            });
        }  */

        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo)
    {
        super.onCreateContextMenu(menu, v, menuInfo);
        getMenuInflater().inflate(R.menu.menu_option__menu__page, menu);
    }

    @Override
    public boolean onContextItemSelected(MenuItem item)
    {
        RelativeLayout relativeLayout = (RelativeLayout)findViewById(R.id.Relative_layout);
        int id = item.getItemId();
        if (id == R.id.action_settings)
        {
            return true;
        }
        else if (id == R.id.action_red)
        {
            relativeLayout.setBackgroundColor(getColor(R.color.colorRed));
            Toast.makeText(getApplicationContext(),"Color Changed to Red",Toast.LENGTH_SHORT).show();
        }
        else if (id == R.id.action_blue)
        {
            relativeLayout.setBackgroundColor(getColor(R.color.colorBlue));
            Toast.makeText(getApplicationContext(),"Color Changed to Blue",Toast.LENGTH_SHORT).show();
        }
        else if (id == R.id.action_green)
        {
            relativeLayout.setBackgroundColor(getColor(R.color.colorGreen));
            Toast.makeText(getApplicationContext(),"Color Changed to Green",Toast.LENGTH_SHORT).show();
        }
        else if (id == R.id.action_yellow)
        {
            relativeLayout.setBackgroundColor(getColor(R.color.colorYellow));
            Toast.makeText(getApplicationContext(),"Color Changed to Yellow",Toast.LENGTH_SHORT).show();
        }
        else if (id == R.id.action_help)
        {
            Toast.makeText(getApplicationContext(),"You requested for Help",Toast.LENGTH_SHORT).show();
        }
        else if (id == R.id.action_sign_out)
        {
            Toast.makeText(getApplicationContext(),"Signed out successfully",Toast.LENGTH_SHORT).show();
        }
    /*    else if (id == R.id.action_rate)
        {
            item.setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener() {
                @Override
                public boolean onMenuItemClick(MenuItem item) {
                    Toast.makeText(getApplicationContext(), "Rate this Application", Toast.LENGTH_SHORT).show();
                    startActivity(new Intent(Option_Menu_Page.this, Rate_Page.class));
                    return false;
                }
            });
        } */

        return super.onContextItemSelected(item);

    }

    public void buttonAction(MenuItem menuItem)
    {
        Toast.makeText(getApplicationContext(), "Rate this Application", Toast.LENGTH_SHORT).show();
        startActivity(new Intent(Option_Menu_Page.this, Rate_Page.class));
    }
}
