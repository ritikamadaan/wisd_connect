package com.example.compaq.connect;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class ArtsshivActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_artsshiv);
    }

    public void ABA(View v) {
        Intent i = new Intent(this, CourseTypeActivity.class);
        startActivity(i);
    }

    public void ABed(View v) {
        Intent i = new Intent(this, CourseTypeActivity.class);
        startActivity(i);
    }

    public void ABMM(View v) {
        Intent i = new Intent(this, CourseTypeActivity.class);
        startActivity(i);
    }

}