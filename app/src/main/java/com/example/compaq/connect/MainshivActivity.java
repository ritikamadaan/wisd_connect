package com.example.compaq.connect;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainshivActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mainshiv);
    }
    public void Science(View v)
    {
        Intent i=new Intent(this,ScienceshivActivity.class);
        startActivity(i);
    }
    public void Commerce(View v)
    {
        Intent i=new Intent(this,CommerceshivActivity.class);
        startActivity(i);
    }
    public void Arts(View v)
    {
        Intent i=new Intent(this,ArtsshivActivity.class);
        startActivity(i);
    }
    public void Engineering(View v)
    {
        Intent i=new Intent(this,EngineershivActivity.class);
        startActivity(i);
    }
    public void Technology(View v)
    {
        Intent i=new Intent(this,TechnologyshivActivity.class);
        startActivity(i);
    }
    public void Law(View v)
    {
        Intent i=new Intent(this,LawshivActivity.class);
        startActivity(i);
    }
    public void Management(View v)
    {
        Intent i=new Intent(this,ManagementshivActivity.class);
        startActivity(i);
    }
    public void Medical(View v)
    {
        Intent i=new Intent(this,MedicalshivActivity.class);
        startActivity(i);
    }

}
