package com.example.compaq.connect;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class HigherSecMainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_higher_sec_main);
    }
    public void Science(View v)
    {
        Intent i=new Intent(this,HigherSecGradeActivity.class);
        startActivity(i);
    }
    public void Commerce(View v)
    {
        Intent i=new Intent(this,HigherSecGradeActivity.class);
        startActivity(i);
    }
    public void Arts(View v)
    {
        Intent i=new Intent(this,HigherSecGradeActivity.class);
        startActivity(i);
    }
}
