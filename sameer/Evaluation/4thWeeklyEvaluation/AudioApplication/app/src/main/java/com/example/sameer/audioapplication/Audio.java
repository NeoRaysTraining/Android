package com.example.sameer.audioapplication;

import android.app.Activity;
import android.content.Intent;
import android.media.MediaPlayer;
//import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class Audio extends Activity
{


    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_audio);

        final ImageButton imageButton = (ImageButton)findViewById(R.id.go);
        imageButton.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                startActivity(new Intent(Audio.this,Play.class));
            }
        });

    }
}
