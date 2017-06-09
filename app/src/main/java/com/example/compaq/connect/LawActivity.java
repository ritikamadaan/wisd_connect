package com.example.compaq.connect;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class LawActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_law);
    }

    public void LLMBusinessLaw(View v)
    {
        Intent i=new Intent(this,CourseTypeActivity.class);
        startActivity(i);
    }
    public void LLMConstitutionalandAdministrativeLaw(View v)
    {
        Intent i=new Intent(this,CourseTypeActivity.class);
        startActivity(i);
    }
    public void LLMHumanRightsLaw(View v)
    {
        Intent i=new Intent(this,CourseTypeActivity.class);
        startActivity(i);
    }
    public void LLmLawofInntelluctualPropertyandInformationTechnology(View v)
    {
        Intent i=new Intent(this,CourseTypeActivity.class);
        startActivity(i);


}

}
