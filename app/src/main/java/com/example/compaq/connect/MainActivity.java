
package com.example.compaq.connect;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void Engineer(View v)
    {
        Intent i=new Intent(this,EngineerActivity.class);
        startActivity(i);
    }
    public void Architect(View v)
    {
        Intent i=new Intent(this,ArchitectActivity.class);
        startActivity(i);
    }
    public void Medic(View v)
    {
        Intent i=new Intent(this, MedicineActivity.class);
        startActivity(i);
    }
    public void Masters(View v)
    {
        Intent i=new Intent(this, MastersbusActivity.class);
        startActivity(i);
    }
    public void Lawyer(View v)
    {
        Intent i=new Intent(this,LawyerActivity.class);
        startActivity(i);
    }
    public void Mascomp(View v)
    {
        Intent i=new Intent(this,MascomputerActivity.class);
        startActivity(i);
    }
    public void Union(View v)
    {
        Intent i=new Intent(this,UnionpActivity.class);
        startActivity(i);
    }
    public void Charted(View v)
    {
        Intent i=new Intent(this,ChaccountActivity.class);
        startActivity(i);
    }
    public void Company(View v)
    {
        Intent i=new Intent(this,CompanyfActivity.class);
        startActivity(i);
    }
    public void Forlang(View v)
    {
        Intent i=new Intent(this,ForlangActivity.class);
        startActivity(i);
    }
    public void Design(View v)
    {
        Intent i=new Intent(this,DesigncourseActivity.class);
        startActivity(i);
    }

}
