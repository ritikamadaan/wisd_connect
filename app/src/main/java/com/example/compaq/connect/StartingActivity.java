package com.example.compaq.connect;

import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.database.Cursor;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.app.NotificationCompat;
import android.telephony.SmsManager;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RatingBar;
import android.widget.TextView;
import android.widget.Toast;

public class StartingActivity extends AppCompatActivity {
    Signhelper myhelper2;
    private EditText edphone;
    private EditText edpass;
    private static Button btnlogin;
   NotificationCompat.Builder notif;
    private static final int UniqueID = 456;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_starting);
        edphone = (EditText) findViewById(R.id.editText);
        edpass = (EditText) findViewById(R.id.editText2);
        btnlogin = (Button) findViewById(R.id.button);
        btnlogin.setOnClickListener(dbButtonListener);
        myhelper2 = new Signhelper(StartingActivity.this);
        notif = new NotificationCompat.Builder(this);
        notif.setAutoCancel(true);
    }

    public void sign(View v) {
        Intent i = new Intent(this, SignupActivity.class);
        startActivity(i);
    }

    public void withoutid(View v) {
        Intent i = new Intent(this, ShwetaAct.class);
        startActivity(i);
    }

    public void terms(View v) {
        Intent i = new Intent(this, WebActivity.class);
        startActivity(i);
        Intent k = new Intent(this, PolicyActivity.class);
        startActivity(k);
    }

    private View.OnClickListener dbButtonListener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            switch (view.getId()) {
                case R.id.button:
                    int flag=1;
                    Cursor ro = myhelper2.getrow();
                    for (ro.moveToFirst(); !ro.isAfterLast(); ro.moveToNext()) {
                        if ((ro.getDouble(ro.getColumnIndex(myhelper2.Phoneno))) == Double.parseDouble(edphone.getText().toString())) {
                            if ((ro.getDouble(ro.getColumnIndex(myhelper2.Password))) == Double.parseDouble(edpass.getText().toString())) {
                                Intent kj = new Intent(StartingActivity.this, ShwetaAct.class);
                                Toast.makeText(StartingActivity.this, "You have successfully logged in", Toast.LENGTH_LONG).show();
                                notif.setSmallIcon(R.drawable.wisdom);
                                notif.setWhen(System.currentTimeMillis());
                                notif.setContentText("You have successfully signed in.");
                                PendingIntent pi = PendingIntent.getActivity(StartingActivity.this,0,kj,PendingIntent.FLAG_UPDATE_CURRENT);
                                notif.setContentIntent(pi);
                                NotificationManager nm = (NotificationManager) getSystemService(NOTIFICATION_SERVICE);
                                nm.notify(UniqueID, notif.build());
                                startActivity(kj);
                                flag=0;
                            }
                        }
                    }
                    if(flag==1)
                        Toast.makeText(StartingActivity.this, "Wrong phoneno or password entered", Toast.LENGTH_LONG).show();

                    break;
                default:
                    break;
            }
       }

    };
    @Override
    protected void onStart() {
        super.onStart();
        myhelper2.openDb();
    }

    @Override
    protected void onStop() {
        super.onStop();
        myhelper2.closeDb();
    }
}