package com.example.compaq.connect;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class LawshivActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lawshiv);
    }
    public void LawBLS(View v) {
        Intent i = new Intent(this, CourseTypeActivity.class);
        startActivity(i);
    }

    public void LawLLB(View v) {
        Intent i = new Intent(this, CourseTypeActivity.class);
        startActivity(i);
    }

}
