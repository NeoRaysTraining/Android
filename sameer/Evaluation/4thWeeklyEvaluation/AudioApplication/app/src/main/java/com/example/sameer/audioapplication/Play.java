package com.example.sameer.audioapplication;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.SeekBar;
import android.os.Handler;

public class Play extends AppCompatActivity
{
    private double startTime = 0;
    private double finalTime = 0;
    private int forwardTime = 5000;
    private int backwardTime = 5000;
    Handler handler = new Handler();
    SeekBar seekBar;

    MediaPlayer mediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_play);

        final ImageButton play = (ImageButton)findViewById(R.id.play);
        ImageButton forward = (ImageButton)findViewById(R.id.forward);
        ImageButton backward = (ImageButton)findViewById(R.id.backward);
   //   ImageButton pause = (ImageButton)findViewById(R.id.pause);
        seekBar = (SeekBar)findViewById(R.id.seek_bar);



        mediaPlayer = MediaPlayer.create(Play.this, R.raw.audio);
        seekBar.setMax(mediaPlayer.getDuration());

        play.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                if(mediaPlayer.isPlaying())
                {
                    play.setImageResource(R.drawable.play);
                    mediaPlayer.pause();
                }
                else
                {
                    mediaPlayer.start();
                    finalTime = mediaPlayer.getDuration();
                    startTime = mediaPlayer.getCurrentPosition();
                    handler.postDelayed(songtime, 1000);
                    play.setImageResource(R.drawable.pause);
                }

            }
        });

        forward.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                int temp = (int)startTime;

                if((temp+forwardTime)<=finalTime)
                {
                    startTime = startTime + forwardTime;
                    mediaPlayer.seekTo((int) startTime);
                }
            }
        });
        backward.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                int temp = (int)startTime;

                if((temp-backwardTime)>0)
                {
                    startTime = startTime - backwardTime;
                    mediaPlayer.seekTo((int) startTime);
                }
            }
        });
     /*   pause.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                mediaPlayer.pause();
            }
        });
        */

    }

    public Runnable songtime = new Runnable()
    {
        @Override
        public void run()
        {
            seekBar.setProgress(mediaPlayer.getCurrentPosition());
            handler.postDelayed(this,1000);
        }
    };
}
