package com.example.compaq.connect;

import android.app.Fragment;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.support.v4.app.FragmentActivity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.telephony.SmsManager;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class InviteFriendsActivity extends FragmentActivity {
    EditText ed1;
    Button btn;
/*  EditText ed1;
    BroadcastReceiver brSent;
    Intent intesent;
    IntentFilter intsent;
    PendingIntent pisent;
    String sms_sent="Message is sent";
    BroadcastReceiver brdel;
    Intent intedel;
    IntentFilter intdel;
    PendingIntent pidel;
    String sms_del="Message is delivered";*/

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_invite_friends);}
       /* ed1=(EditText)findViewById(R.id.editText3);
        intesent = new Intent(sms_sent);
        pisent = PendingIntent.getBroadcast(getApplicationContext(), 0, intesent, 0);
        intsent = new IntentFilter(sms_sent);
        brSent = new BroadcastReceiver() {
            @Override
            public void onReceive(Context context, Intent intent) {
                switch (getResultCode()) {
                    case RESULT_OK:
                        Toast.makeText(getApplicationContext(), "SMS SENT", Toast.LENGTH_SHORT).show();
                        break;
                    case SmsManager.RESULT_ERROR_GENERIC_FAILURE:
                        break;
                    default:
                        break;
                }
            }
        };

        intedel = new Intent(sms_del);
        pidel = PendingIntent.getBroadcast(getApplicationContext(), 0, intedel, 0);
        intdel = new IntentFilter(sms_del);
        brdel = new BroadcastReceiver() {
            @Override
            public void onReceive(Context context, Intent intent) {
                switch (getResultCode()) {
                    case RESULT_OK:
                        Toast.makeText(getApplicationContext(), "SMS DELIVERED", Toast.LENGTH_SHORT).show();
                        break;
                    case SmsManager.RESULT_ERROR_GENERIC_FAILURE:
                        break;
                    default:
                        break;
                }
            }
        };
    }
    @Override
    protected void onResume() {
        super.onResume();
        registerReceiver(brSent,intsent);
        registerReceiver(brdel,intdel);
    }

    @Override
    protected void onPause() {
        super.onPause();
        unregisterReceiver(brSent);
        unregisterReceiver(brdel);
    }*/
    public void Sendsms(View v)
    {   Intent w=new Intent(this,ShwetaAct.class);
        ed1=(EditText)findViewById(R.id.editText39);
        String n=ed1.getText().toString();
        String m="Hey! I just downloaded Wisdom Connect on my android.Wisdom Connect is an online platform for education classes in Delhi.This app helps in finding tutors and classes in an easy way.";
        SmsManager sms=SmsManager.getDefault();
        Toast.makeText(InviteFriendsActivity.this,"Message is sent",Toast.LENGTH_LONG).show();
        sms.sendTextMessage(n,null,m,null,null);
        startActivity(w);

    }

}
