package com.itcs.mediaplayerapp;

import android.media.MediaPlayer;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.SeekBar;
import android.widget.Toast;


public class Main2Activity extends AppCompatActivity {
    MediaPlayer mediaPlayer;
    SeekBar seekBar;
    double startTime = 0;
    double finalTime = 0;
    int forwardTime = 5000;
    int backwardTime = 5000;
private Handler myHandler= new Handler();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Button backward = (Button) findViewById(R.id.backward);
        final Button play = (Button) findViewById(R.id.play);
        final Button pause = (Button) findViewById(R.id.pause);
        Button forward = (Button) findViewById(R.id.forward);
        seekBar = (SeekBar) findViewById(R.id.seekbar);


        mediaPlayer = MediaPlayer.create(Main2Activity.this, R.raw.kalimba);
        seekBar.setClickable(false);



        play.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "PLAYING SONG", Toast.LENGTH_SHORT).show();
                mediaPlayer.start();
                startTime = mediaPlayer.getCurrentPosition();
                finalTime = mediaPlayer.getDuration();
                myHandler.postDelayed(UpdateSongTime, 1000);
            }
        });
        pause.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "pausing song", Toast.LENGTH_SHORT).show();
                mediaPlayer.pause();


            }
        });
        backward.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Backwarding song", Toast.LENGTH_SHORT).show();
                int temp = (int) startTime;

                if ((temp - backwardTime) > 0) {
                    startTime = startTime - backwardTime;
                    mediaPlayer.seekTo((int) startTime);
                    Toast.makeText(getApplicationContext(), "You have Jumped backward 5 seconds", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(getApplicationContext(), "Cannot jump backward 5 seconds", Toast.LENGTH_SHORT).show();
                }

            }

        });
        forward.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int temp = (int) startTime;

                if ((temp + forwardTime) <= finalTime) {
                    startTime = startTime + forwardTime;
                    mediaPlayer.seekTo((int) startTime);
                    Toast.makeText(getApplicationContext(), "You have Jumped forward 5 seconds", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(getApplicationContext(), "Cannot jump forward 5 seconds", Toast.LENGTH_SHORT).show();
                }

            }
        });
    }
         Runnable UpdateSongTime = new Runnable()
        {
            public void run() {
                startTime = mediaPlayer.getCurrentPosition();
                seekBar.setProgress((int)startTime);
                myHandler.postDelayed(this, 100);
            }
        };



}
