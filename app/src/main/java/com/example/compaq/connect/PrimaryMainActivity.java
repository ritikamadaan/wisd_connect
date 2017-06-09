package com.example.compaq.connect;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class PrimaryMainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_primary_main);
    }
    public void ICSEBoard(View v)
    {
        Intent i=new Intent(this,PrimaryGradeActivity.class);
        startActivity(i);
    }
    public void CBSEBoard(View v)
    {
        Intent i=new Intent(this,PrimaryGradeActivity.class);
        startActivity(i);
    }
    public void Stateboard(View v)
    {
        Intent i=new Intent(this,PrimaryGradeActivity.class);
        startActivity(i);
    }
    public void IGCSE(View v)
    {
        Intent i=new Intent(this,PrimaryGradeActivity.class);
        startActivity(i);
    }
}
