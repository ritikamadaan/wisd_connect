package com.example.compaq.connect;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class ScienceshivActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scienceshiv);
    }

    public void SciBCS(View v) {
        Intent i = new Intent(this, CourseTypeActivity.class);
        startActivity(i);
    }

    public void ABed(View v) {
        Intent i = new Intent(this, CourseTypeActivity.class);
        startActivity(i);
    }

    public void SciBHS(View v) {
        Intent i = new Intent(this, CourseTypeActivity.class);
        startActivity(i);
    }

    public void SciBIT(View v) {
        Intent i = new Intent(this, CourseTypeActivity.class);
        startActivity(i);
    }
}