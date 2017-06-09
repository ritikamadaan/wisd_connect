package com.example.compaq.connect;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class GradeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grade);
    }
    public void Sixth(View v)
    {
        Intent i=new Intent(this,CourseTypeActivity.class);
        startActivity(i);
    }
    public void Seventh(View v)
    {
        Intent i=new Intent(this,CourseTypeActivity.class);
        startActivity(i);
    }
    public void Eighth(View v)
    {
        Intent i=new Intent(this,CourseTypeActivity.class);
        startActivity(i);
    }
    public void Ninth(View v)
    {
        Intent i=new Intent(this,CourseTypeActivity.class);
        startActivity(i);
    }
    public void Tenth(View v)
    {
        Intent i=new Intent(this,CourseTypeActivity.class);
        startActivity(i);
    }
}
