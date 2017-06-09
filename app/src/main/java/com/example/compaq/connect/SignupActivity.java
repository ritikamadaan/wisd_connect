package com.example.compaq.connect;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.app.NotificationCompat;
import android.telephony.SmsManager;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class SignupActivity extends AppCompatActivity {
    Signhelper myhelper;
    private EditText edFname;
    private EditText edLname;
    private EditText edphone;
    private EditText edpass;
    private static Button btninsert;
    NotificationCompat.Builder notif;
    private static final int UniqueID = 456;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);
        init();
        myhelper=new Signhelper(SignupActivity.this);
        notif = new NotificationCompat.Builder(this);
        notif.setAutoCancel(true);

    }
    public void init()
    {

        edFname = (EditText)findViewById(R.id.editText4);
        edLname = (EditText)findViewById(R.id.editText5);
        edphone = (EditText)findViewById(R.id.editText6);
        edpass = (EditText)findViewById(R.id.editText7);
        btninsert= (Button)findViewById(R.id.button12);
        btninsert.setOnClickListener(dbButtonListener);

    }

    View.OnClickListener dbButtonListener =new View.OnClickListener()
    {
        @Override
        public void onClick(View view) {
            switch(view.getId())
            {
                case R.id.button12:

                    long result=myhelper.insert(getValue(edFname),getValue(edLname),Double.valueOf(getValue(edphone)),Double.valueOf(getValue(edpass)));
                    if(result==-1)
                    {   Intent kl=new Intent(SignupActivity.this,StartingActivity.class);
                        Toast.makeText(SignupActivity.this,"Sorry you already have an account.You can login with your phoneno and password",Toast.LENGTH_LONG).show();
                        startActivity(kl);
                    }
                    else
                    {   Intent kj=new Intent(SignupActivity.this,StartingActivity.class);
                        Toast.makeText(SignupActivity.this,"You have successfully signed in",Toast.LENGTH_LONG).show();
                        String n=edphone.getText().toString();
                        String p="You have successfully signed in.";
                        SmsManager sms=SmsManager.getDefault();
                        sms.sendTextMessage(n,null,p,null,null);
                        notif.setSmallIcon(R.drawable.wisdom);
                        notif.setWhen(System.currentTimeMillis());
                        notif.setContentText("You have successfully signed in.");
                        PendingIntent pi = PendingIntent.getActivity(SignupActivity.this,0,kj,PendingIntent.FLAG_UPDATE_CURRENT);
                        notif.setContentIntent(pi);
                        NotificationManager nm = (NotificationManager) getSystemService(NOTIFICATION_SERVICE);
                        nm.notify(UniqueID, notif.build());
                        startActivity(kj);
                    }

                    break;
                default:break;
            }
        }

        private String getValue(EditText edFname) { return edFname.getText().toString().trim();
        }
    };
    @Override
    protected void onStart() {
        super.onStart();
        myhelper.openDb();
    }

    @Override
    protected void onStop() {
        super.onStop();
        myhelper.closeDb();
    }
}
