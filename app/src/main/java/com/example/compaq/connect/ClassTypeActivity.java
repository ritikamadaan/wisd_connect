package com.example.compaq.connect;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

public class ClassTypeActivity extends AppCompatActivity {
    private CheckBox ch1,ch2;
    private Button b1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_class_type);
    }
    public void classtype(View v)
    {
        ch1=(CheckBox)findViewById(R.id.checkBox);
        ch2=(CheckBox)findViewById(R.id.checkBox2);
        StringBuffer result=new StringBuffer();
        result.append("Coaching class").append(ch1.isChecked());
        result.append("\nTutor").append(ch2.isChecked());
        if((ch1.isChecked())||(ch2.isChecked()))
        {
            Intent i;
            i = new Intent(this,ChooseActivity.class);
            startActivity(i);
        }
        else
        {
            Toast.makeText(ClassTypeActivity.this,"Please select class Type",Toast.LENGTH_LONG).show();
        }
    }
}
