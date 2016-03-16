package com.example.sameer.menuappeval;

import android.content.Intent;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.CharacterPickerDialog;
import android.view.View;
import android.widget.Button;
import android.widget.RatingBar;
import android.widget.Toast;

public class Rate_Page extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rate__page);

        Button button = (Button)findViewById(R.id.button_back);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                Snackbar.make(v, "Back to Menu Page", Snackbar.LENGTH_LONG).setAction("Action", null).show();
                startActivity(new Intent(Rate_Page.this, Option_Menu_Page.class));
            }
        });

        RatingBar ratingBar = (RatingBar)findViewById(R.id.rate_bar);
        ratingBar.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener()
        {
            @Override
            public void onRatingChanged(RatingBar ratingBar, float rating, boolean fromUser)
            {
                float r = ratingBar.getRating();
                Toast.makeText(Rate_Page.this,"Your Rating is  "+r, Toast.LENGTH_SHORT).show();
            }
        });
    }
}
