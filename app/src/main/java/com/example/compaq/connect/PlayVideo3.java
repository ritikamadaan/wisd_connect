package com.example.compaq.connect;

import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.TextView;
import android.widget.VideoView;

public class PlayVideo3 extends AppCompatActivity {

    private VideoView mVidView;
    private TextView mName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_play_video3);
        mVidView =(VideoView)findViewById(R.id.videoView2);
        mName=(TextView)findViewById(R.id.textView3);
        Uri uri=Uri.parse("android.resource://"+ getPackageName()+ "/"+R.raw.video3);
        mVidView.setVideoURI(uri);
        mVidView.setMediaController(new MediaController(this));
        mVidView.requestFocus();
        mVidView.start();
        mName.setText("Lesson 3!");
    }
}
