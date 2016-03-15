package com.example.sagar.itcs.audioappdemo;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.SeekBar;
import android.widget.TextView;

import java.io.IOException;
import android.os.Handler;
import java.util.logging.LogRecord;

public class MainActivity extends AppCompatActivity {

    ImageButton play,pause,forward,rewind;
    SeekBar seekBar;
    private int seekForwardTime = 5000; // 5000 milliseconds
    private int seekBackwardTime = 5000; // 5000 milliseconds
    Handler mHandler = new Handler();;
    MediaPlayer mp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        play=(ImageButton)findViewById(R.id.btnPlay);
        forward=(ImageButton)findViewById(R.id.btnForward);
        rewind=(ImageButton)findViewById(R.id.btnBackward);

       mp= MediaPlayer.create(MainActivity.this, R.raw.venkatesha);

        play.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                // check for already playing
                if(mp.isPlaying()){
                    if(mp!=null){
                        mp.pause();
                        // Changing button image to play button
                        play.setImageResource(R.drawable.btn_play);
                    }
                }else{
                    // Resume song
                    if(mp!=null){
                        mp.start();
                        mHandler.postDelayed(upDateProgressTask,100);
                        // Changing button image to pause button
                        play.setImageResource(R.drawable.btn_pause);
                    }
                }

            }
        });


        forward.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // get current song position
                int currentposition=mp.getCurrentPosition();
                if (currentposition+seekForwardTime<=mp.getCurrentPosition()){
                    // forward song
                    mp.seekTo(currentposition+seekForwardTime);
                }else{
                    // forward to end position
                    mp.seekTo(mp.getDuration());
                }
            }
        });

        rewind.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // get current song position
                int currentPosition=mp.getCurrentPosition();
                if (currentPosition-seekBackwardTime>=0){
                    // check if seekBackward time is greater than 0 sec
                    mp.seekTo(currentPosition-seekBackwardTime);
                }else{
                    // backward to starting position
                    mp.seekTo(0);
                }


            }
        });

    }
    //seek bar with mp3 and duration
    private Runnable upDateProgressTask=new Runnable() {
        @Override
        public void run() {
            long starTime=mp.getCurrentPosition();
//            seekBar.setProgress((int)mp.getCurrentPosition());
            mHandler.postDelayed(this,100);
        }
    };

}
