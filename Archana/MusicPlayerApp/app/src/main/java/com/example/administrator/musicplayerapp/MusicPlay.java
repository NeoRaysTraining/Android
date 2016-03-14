package com.example.administrator.musicplayerapp;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.Handler;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.SeekBar;
import android.widget.Toast;

public class MusicPlay extends AppCompatActivity {

    Button play, pause, backward, forward;
    SeekBar seekBar;
    MediaPlayer mediaPlayer;
    Handler myHandler = new Handler();
    double startTime=0, finalTime=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_play);
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

        mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.pavamana);//giving song which app will play

        seekBar = (SeekBar) findViewById(R.id.seek_id);
        seekBar.setMax(mediaPlayer.getDuration());//setting maximum length for seek bar

        play = (Button) findViewById(R.id.play_button);
        play.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                startTime = mediaPlayer.getCurrentPosition();// provides the current time of playing song
                Log.i("song present time", String.valueOf(startTime));
                finalTime = mediaPlayer.getDuration();// provides the length of the song

                mediaPlayer.start(); //play or starts music
                Log.i("start", "music play start");
                myHandler.postDelayed(UpdateSongTime,1000); //calling the thread using postDelayed method
            }
        });

        pause = (Button) findViewById(R.id.pause_button);
        pause.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                if(mediaPlayer.isPlaying())
                {
                    mediaPlayer.pause();//on pause button click the song will pause,
                    // then click play button the song will play were it is paused not from starting
                    Log.i("pause", "pause button");
                    Toast.makeText(MusicPlay.this, "Paused", Toast.LENGTH_SHORT).show();
                }
            }
        });

        backward = (Button) findViewById(R.id.back_button);
        backward.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                if(startTime >= 10000)
                {
                    startTime = startTime - 10000;
                    mediaPlayer.seekTo((int) startTime);
                    Toast.makeText(MusicPlay.this, "backwarded 1 min", Toast.LENGTH_SHORT).show();
                    Log.i("backward", "backward 1 min");

                }
                else if(startTime > 0 & startTime < 10000)
                {
                    startTime = 0;
                    mediaPlayer.seekTo((int) startTime);
                    Toast.makeText(MusicPlay.this, "start form first", Toast.LENGTH_SHORT).show();
                }
                else
                {
                    Toast.makeText(MusicPlay.this, "cannot backward", Toast.LENGTH_SHORT).show();
                }
            }
        });

        forward = (Button) findViewById(R.id.forward_button);
        forward.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                if(startTime+10000 < finalTime)
                {
                    startTime += 10000;
                    mediaPlayer.seekTo((int) startTime);
                    Log.i("forward", "forward 1 in");
                    Toast.makeText(MusicPlay.this, "forward 1 min", Toast.LENGTH_SHORT).show();

                }
                else
                {
                    mediaPlayer.seekTo((int) finalTime);
                    Toast.makeText(MusicPlay.this, "song completed", Toast.LENGTH_SHORT).show();
                }
            }
        });

    }

    //thread to update the seekbar while playing the music
    private Runnable UpdateSongTime = new Runnable()
    {
        @Override
        public void run()
        {
            startTime = mediaPlayer.getCurrentPosition();
            seekBar.setProgress((int) startTime);
            myHandler.postDelayed(this, 1000);//this will introduce delay of 1 second in execution of run() method.

        }
    };
}
