package neorays.menuwithradiobutton;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.ContextMenu;
import android.view.MenuInflater;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
int item_selection=0;
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

    public void selectNetwork(View view) {
        registerForContextMenu(view);
        openContextMenu(view);
    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.network_menu, menu);
        MenuItem item_Wifi = menu.findItem(R.id.id_wifi);
        MenuItem item_Bluetooth = menu.findItem(R.id.id_bluetooth);
        MenuItem item_Mobile_Data = menu.findItem(R.id.id_mobile_data);
        if (item_selection == 1) {
            item_Wifi.setChecked(true);
        } else if (item_selection == 2) {
            item_Bluetooth.setChecked(true);
        } else if (item_selection == 3) {
            item_Mobile_Data.setChecked(true);
        }
    }

    @Override
    public boolean onContextItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.id_wifi:
                Toast.makeText(getApplicationContext(), "Wifi Selected", Toast.LENGTH_SHORT).show();
                item.setChecked(true);
                item_selection = 1;
                return true;
            case R.id.id_bluetooth:
                Toast.makeText(getApplicationContext(), "Bluetooth Selected", Toast.LENGTH_LONG).show();
                item.setChecked(true);
                item_selection = 2;
                return true;
            case R.id.id_mobile_data:
                Toast.makeText(getApplicationContext(), "MobileData Selected", Toast.LENGTH_LONG).show();
                item.setChecked(true);
                item_selection = 3;
                return true;
        }

        return super.onContextItemSelected(item);
    }

}