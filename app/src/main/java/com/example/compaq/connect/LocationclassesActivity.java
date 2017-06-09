package com.example.compaq.connect;

import android.content.DialogInterface;
import android.content.Intent;

import android.content.pm.PackageManager;
import android.location.Address;
import android.location.Geocoder;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.location.LocationProvider;
import android.support.v4.app.ActivityCompat;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RatingBar;
import android.widget.TextView;
import android.widget.Toast;

import java.io.IOException;
import java.util.List;


public class LocationclassesActivity extends AppCompatActivity {

    //EditText ed = (EditText) findViewById(R.id.editText);
    Button btnShowLocation;

    // GPSTracker class
    GPSTracker gps;


    Intent j;
    //TextView latLongTV;

//private static TextView tv1, tv2, tv3;
   // private LocationManager lm;
    //private LocationListener loclis;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_locationclasses);
        btnShowLocation = (Button) findViewById(R.id.button);

        // show location button click event
        btnShowLocation.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                // create class object
                gps = new GPSTracker(LocationclassesActivity.this);

                // check if GPS enabled
                if(gps.canGetLocation()){

                    double latitude = gps.getLatitude();
                    double longitude = gps.getLongitude();

                    // \n is for new line
                    Toast.makeText(getApplicationContext(), "Your Location is - \nLat: " + latitude + "\nLong: " + longitude, Toast.LENGTH_LONG).show();
                }else{
                    // can't get location
                    // GPS or Network is not enabled
                    // Ask user to enable GPS/network in settings
                    gps.showSettingsAlert();
                }

            }
        });
    }

    public void locale(View v) {


        //if (ed.getText().toString().trim().length() != 0) {
            j = new Intent(this, StartingActivity.class);
            //   Toast.makeText(this, "You did not enter the place", Toast.LENGTH_SHORT).show();
            // return;


            AlertDialog.Builder builder = new AlertDialog.Builder(LocationclassesActivity.this);
            builder.setTitle("Confirm Login");
            builder.setMessage("You are almost done..Please login to continue");
            builder.setPositiveButton("Login", new DialogInterface.OnClickListener() {

                @Override
                public void onClick(DialogInterface dialogInterface, int i) {
                    startActivity(j);
                }
            }).setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialogInterface, int i) {
                    dialogInterface.cancel();
                }
            });
            AlertDialog alert = builder.create();
            alert.show();
        /* }else

        {
            Toast.makeText(this, "You did not enter the place", Toast.LENGTH_SHORT).show();
        }*/
    }
}