package com.example.compaq.connect;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.example.compaq.connect.CourseTypeActivity;

public class DesigncourseActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_designcourse);
    }
    public void Designnid(View v)
    {
        Intent i=new Intent(this,CourseTypeActivity.class);
        startActivity(i);
    }
    public void Designnift(View v)
    {
        Intent i=new Intent(this,CourseTypeActivity.class);
        startActivity(i);
    }
}
