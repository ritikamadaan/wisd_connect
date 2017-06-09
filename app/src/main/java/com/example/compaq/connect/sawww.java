package com.example.compaq.connect;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class sawww extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sawww);
    }

    public void Science(View v) {
        Intent i = new Intent(this, ScienceActivity.class);
        startActivity(i);
    }

    public void Commerce(View v) {
        Intent i = new Intent(this, CommerceActivity.class);
        startActivity(i);
    }

    public void Arts(View v) {
        Intent i = new Intent(this, ArtsActivity.class);
        startActivity(i);
    }

    public void Law(View v) {
        Intent i = new Intent(this, LawActivity.class);
        startActivity(i);
    }
}
