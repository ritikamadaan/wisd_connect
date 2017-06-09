package com.example.compaq.connect;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class EngineershivActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_engineershiv);
    }
    public void EAuto(View v) {
        Intent i = new Intent(this, CourseTypeActivity.class);
        startActivity(i);
    }

    public void EBio(View v) {
        Intent i = new Intent(this, CourseTypeActivity.class);
        startActivity(i);
    }

    public void EChem(View v) {
        Intent i = new Intent(this, CourseTypeActivity.class);
        startActivity(i);
    }

    public void ECivil(View v) {
        Intent i = new Intent(this, CourseTypeActivity.class);
        startActivity(i);
    }
    public void EComp(View v) {
        Intent i = new Intent(this, CourseTypeActivity.class);
        startActivity(i);
    }

    public void EElect(View v) {
        Intent i = new Intent(this, CourseTypeActivity.class);
        startActivity(i);
    }

    public void EElecTele(View v) {
        Intent i = new Intent(this, CourseTypeActivity.class);
        startActivity(i);
    }

    public void EFirstYr(View v) {
        Intent i = new Intent(this, CourseTypeActivity.class);
        startActivity(i);
    }
    public void EIT(View v) {
        Intent i = new Intent(this, CourseTypeActivity.class);
        startActivity(i);
    }

    public void EInstru(View v) {
        Intent i = new Intent(this, CourseTypeActivity.class);
        startActivity(i);
    }

    public void EMech(View v) {
        Intent i = new Intent(this, CourseTypeActivity.class);
        startActivity(i);
    }

    public void EProd(View v) {
        Intent i = new Intent(this, CourseTypeActivity.class);
        startActivity(i);
    }
}