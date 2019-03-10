package com.example.lenovo.application;

import android.media.MediaPlayer;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.VideoView;

import java.net.URI;

public class streamDisplay extends AppCompatActivity {

    String videoURL = "192.168.1.48:8081";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stream_display);

        final VideoView vdoView = (VideoView)findViewById(R.id.videoView);
        try {
            Uri uri= Uri.parse(videoURL);
            vdoView.setVideoURI(uri);

        }catch (Exception e){
            e.printStackTrace();
        }
        vdoView.requestFocus();
        vdoView.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
            @Override
            public void onPrepared(MediaPlayer mp) {
                mp.setLooping(true);
                vdoView.start();
            }
        });

    }
}
