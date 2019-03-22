package com.example.noyon.schoolofcareerdevelopmentbangladesh;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.VideoView;

public class Help extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_help);
        VideoView videoView = (VideoView)findViewById(R.id.VideoView);
        videoView.setVideoPath("/drawable/song.png");

        videoView.start();
    }
}
