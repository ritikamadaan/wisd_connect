package com.example.compaq.connect;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class ShwetaAct extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shweta);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);

    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.shweta, menu);
        return true;
    }

     @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.

        switch (item.getItemId())
        {
            case R.id.action_video1:
                Toast.makeText(getApplicationContext(),"Playing Video 1",Toast.LENGTH_LONG).show();
                Intent i= new Intent(this,PlayVideo.class);
                startActivity(i);
                return true;
            case R.id.action_video2:
                Toast.makeText(getApplicationContext(),"Playing Video 2",Toast.LENGTH_LONG).show();
                Intent j= new Intent(this,PlayVideo2.class);
                startActivity(j);
                return true;
            case R.id.action_video3:
                Toast.makeText(getApplicationContext(),"Playing Video 3",Toast.LENGTH_LONG).show();
                Intent k= new Intent(this,PlayVideo3.class);
                startActivity(k);
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();
        android.app.FragmentManager fragmentManager=getFragmentManager();
        if (id == R.id.nav_first_layout) {
            //fragmentManager.beginTransaction().replace(R.id.content_frame,new FirstFragment()).commit();
            startActivity(new Intent(this,StartingActivity.class));

        } else if (id == R.id.nav_second_layout) {
            fragmentManager.beginTransaction().replace(R.id.content_frame,new SecondFragment()).commit();

        }else if (id == R.id.nav_third_layout) {
           // fragmentManager.beginTransaction().replace(R.id.content_frame,new ThirdFragment()).commit();
            startActivity(new Intent(this,InviteFriendsActivity.class));
        } else if (id == R.id.nav_fourth_layout) {
            fragmentManager.beginTransaction().replace(R.id.content_frame,new FourthFragment()).commit();

        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
    public void entrancee(View view)
    {
        Intent intent=new Intent(this,MainActivity.class);
        startActivity(intent);
    }
    public void second(View view)
    {
        Intent intent =new Intent(this,SecondaryMainActivity.class);
        startActivity(intent);
    }
    public void prim(View view)
    {
        Intent intent =new Intent(this,PrimaryMainActivity.class);
        startActivity(intent);
    }
    public void highsec(View view)
    {
        Intent intent =new Intent(this,HigherSecMainActivity.class);
        startActivity(intent);
    }
    public void graduatee(View view)
    {
        Intent intent =new Intent(this,MainshivActivity.class);
        startActivity(intent);
    }
    public void pgraduatee(View view)
    {
        Intent intent =new Intent(this,sawww.class);
        startActivity(intent);
    }
}
