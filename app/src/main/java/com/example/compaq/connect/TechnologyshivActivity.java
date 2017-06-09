package com.example.compaq.connect;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class TechnologyshivActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_technologyshiv);
    }
    public void TAuto(View v) {
        Intent i = new Intent(this, CourseTypeActivity.class);
        startActivity(i);
    }

    public void TBCA(View v) {
        Intent i = new Intent(this, CourseTypeActivity.class);
        startActivity(i);
    }

    public void TBio(View v) {
        Intent i = new Intent(this, CourseTypeActivity.class);
        startActivity(i);
    }

    public void TChem(View v) {
        Intent i = new Intent(this, CourseTypeActivity.class);
        startActivity(i);
    }
    public void TCivil(View v) {
        Intent i = new Intent(this, CourseTypeActivity.class);
        startActivity(i);
    }
    public void TComp(View v) {
        Intent i = new Intent(this, CourseTypeActivity.class);
        startActivity(i);
    }

    public void TElect(View v) {
        Intent i = new Intent(this, CourseTypeActivity.class);
        startActivity(i);
    }

    public void TElecTele(View v) {
        Intent i = new Intent(this, CourseTypeActivity.class);
        startActivity(i);
    }

    public void TFirstYr(View v) {
        Intent i = new Intent(this, CourseTypeActivity.class);
        startActivity(i);
    }
    public void TIT(View v) {
        Intent i = new Intent(this, CourseTypeActivity.class);
        startActivity(i);
    }

    public void TMech(View v) {
        Intent i = new Intent(this, CourseTypeActivity.class);
        startActivity(i);
    }

    public void TProd(View v) {
        Intent i = new Intent(this, CourseTypeActivity.class);
        startActivity(i);
    }
}
