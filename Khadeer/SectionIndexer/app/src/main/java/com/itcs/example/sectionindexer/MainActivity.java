package com.itcs.example.sectionindexer;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import android.app.Activity;
import android.os.Bundle;

public class MainActivity extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        List<String> countries = new ArrayList<String>();
        countries.add("Bangalore");
        countries.add("Belgaum");
        countries.add("Mysore");
        countries.add("Tumkur");
        countries.add("Gulbarga");
        countries.add("Bellary");
        countries.add("Bijapur");
        countries.add("Dakshina Kannada");
        countries.add("Davanagere");
        countries.add("Raichur");
        countries.add("Bagalkot");
        countries.add("Dharwad");
        countries.add("Mandya");
        countries.add("Hassan");
        countries.add("Shimoga");
        countries.add("Bidar");
        countries.add("Chitradurga");
        countries.add("Haveri");
        countries.add("Kolar");
        countries.add("Uttara Kannada");
        countries.add("Koppal");
        countries.add("Chikkaballapura");
        countries.add("Udupi");
        countries.add("Yadgir");
        countries.add("Chikmagalur");
        countries.add("Ramanagara");
        countries.add("Gadag");
        countries.add("Chamarajanagar");
        countries.add("Bangalore Rural");
        countries.add("Kodagu");
        Collections.sort(countries);
        FastSearchListView listView = (FastSearchListView) findViewById(R.id.listview);
        SimpleAdapter sa = new SimpleAdapter(countries, this);
        listView.setAdapter(sa);
//listView.setFastScrollEnabled(true);
    }

}
