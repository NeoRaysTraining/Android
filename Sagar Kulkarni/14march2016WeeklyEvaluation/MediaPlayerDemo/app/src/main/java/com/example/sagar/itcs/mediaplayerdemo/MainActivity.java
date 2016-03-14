package com.example.sagar.itcs.mediaplayerdemo;

import android.media.MediaPlayer;
import android.media.MediaRecorder;
import android.os.Environment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    ImageView image;
    Button play,stop,record;
    private MediaRecorder myAudioRecorder;
    private String outputFile=null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        play=(Button)findViewById(R.id.button1);
        stop=(Button)findViewById(R.id.button2);
        record=(Button)findViewById(R.id.button3);


        play.setEnabled(false);
        stop.setEnabled(false);
        outputFile= Environment.getExternalStorageDirectory().getAbsolutePath()+"/recording.3gp";

        //create an instance of MediaRecorder class
        myAudioRecorder=new MediaRecorder();
        //set the source , output and encoding format and output file.Their syntax is
       // myAudioRecorder.setAudioSource(MediaRecorder.AudioSource.MIC);
        myAudioRecorder.setOutputFormat(MediaRecorder.OutputFormat.THREE_GPP);
        myAudioRecorder.setAudioEncoder(MediaRecorder.OutputFormat.AMR_NB);
        myAudioRecorder.setOutputFile(outputFile);

        record.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    //the two basic methods prepare and start to start recording the audio.
                    myAudioRecorder.prepare();
                    myAudioRecorder.start();
                } catch (Exception e) {
                    e.printStackTrace();
                }
                record.setEnabled(false);
                stop.setEnabled(true);
                Toast.makeText(MainActivity.this, "Recording Started", Toast.LENGTH_SHORT).show();
            }
        });
        stop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                myAudioRecorder.stop();
                myAudioRecorder.release();
                myAudioRecorder=null;
                record.setEnabled(false);
                play.setEnabled(true);
                Toast.makeText(MainActivity.this, "Audio Recorded Succefully.. ", Toast.LENGTH_SHORT).show();
            }
        });
        play.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MediaPlayer mp=new MediaPlayer();
                try{
                    mp.setDataSource(outputFile);
                }catch(Exception e){
                    e.printStackTrace();
                }
                try{
                    mp.prepare();
                }catch (Exception e){
                   e.printStackTrace();
                }
                mp.start();
                Toast.makeText(MainActivity.this, "Playing the Recorded Sound ", Toast.LENGTH_SHORT).show();
            }
        });

    }
}
