package neorays.optionmenuapp1;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuInflater;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.RelativeLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
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

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.my_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        RelativeLayout relativeLayout;
        relativeLayout = (RelativeLayout) findViewById(R.id.relative_layout);
        switch (item.getItemId()) {
            case R.id.id_blue_color:
                relativeLayout.setBackgroundColor(getResources().getColor(android.R.color.holo_blue_dark));
                break;
            case R.id.id_red_color:
                relativeLayout.setBackgroundColor(getResources().getColor(android.R.color.holo_red_dark));
                break;
            case R.id.id_purple_color:
                relativeLayout.setBackgroundColor(getResources().getColor(android.R.color.holo_purple));
                break;
            case R.id.id_green_color:
                relativeLayout.setBackgroundColor(getResources().getColor(android.R.color.holo_green_dark));
                break;
        }

        return true;

    }
}











