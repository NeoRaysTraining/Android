package com.example.sagar.itcs.videoplayerdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        VideoView videoView=(VideoView)findViewById(R.id.videoView);
        videoView.setVideoPath("F:\\Photos\\sagar.mp4");
        //videoView.setVideoPath("VID-20160113-WA0018.mp4");
        videoView.setMediaController(new MediaController(this));
        videoView.start();
        videoView.requestFocus();
    }
}
