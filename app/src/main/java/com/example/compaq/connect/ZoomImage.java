package com.example.compaq.connect;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Window;

public class ZoomImage extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_zoom_image);
        new Handler().postDelayed(new Runnable() {

            public void run() {

                Intent mainIntent = new Intent(ZoomImage.this,StartingActivity.class);
                ZoomImage.this.startActivity(mainIntent);
                ZoomImage.this.finish();
                overridePendingTransition(R.anim.fadein, R.anim.splashfadeout);
            }
        },3000);
    }


}
