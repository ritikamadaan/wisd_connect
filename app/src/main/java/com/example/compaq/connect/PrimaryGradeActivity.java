package com.example.compaq.connect;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class PrimaryGradeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_primary_grade);
    }
    public void First(View v)
    {
        Intent i=new Intent(this,PrimaryClassActivity.class);
        startActivity(i);
    }
    public void Second(View v)
    {
        Intent i=new Intent(this,PrimaryClassActivity.class);
        startActivity(i);
    }
    public void Third(View v)
    {
        Intent i=new Intent(this,PrimaryClassActivity.class);
        startActivity(i);
    }
    public void Fourth(View v)
    {
        Intent i=new Intent(this,PrimaryClassActivity.class);
        startActivity(i);
    }
    public void Fifth(View v)
    {
        Intent i=new Intent(this,PrimaryClassActivity.class);
        startActivity(i);
    }
}
