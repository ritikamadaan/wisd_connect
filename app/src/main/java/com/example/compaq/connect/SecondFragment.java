package com.example.compaq.connect;

import android.app.Fragment;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AlertDialog;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

/**
 * Created by compaq on 07-07-2016.
 */
public class SecondFragment extends Fragment {
    View myView;
    Context context,getact;
   // public SecondFragment()
   // {
   //     getact=getActivity();
   // }
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        myView= inflater.inflate(R.layout.second_layout,container,false);
        context = myView.getContext();
        final Button tnc=(Button)myView.findViewById(R.id.button);
        final Button policy=(Button)myView.findViewById(R.id.button2);
        final Button invite=(Button)myView.findViewById(R.id.button3);
        final Button logout=(Button)myView.findViewById(R.id.button4);
        tnc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View myView) {
                terms();
            }
        });

        policy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View myView) {
                policy();
            }
        });
        invite.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View myView) {
                ink();
            }
        });
        logout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View myView) {
                logoff();
            }
        });



        return myView;
    }

    public void terms()
    {
        Intent intent = new Intent(context, WebActivity.class);
        startActivity(intent);
    }
    public void policy()
    {
        Intent intent = new Intent(context, PolicyActivity.class);
        startActivity(intent);
    }
    public void ink()
    {
        Intent lk=new Intent(context,InviteFriendsActivity.class);
        startActivity(lk);
    }
    public void logoff()
    {   //new SecondFragment();
        final Intent nb=new Intent(context,StartingActivity.class);
        /*AlertDialog.Builder builder = new AlertDialog.Builder(getact);
        builder.setTitle("Confirm Logout");
        builder.setMessage("Do you want to logout?");
        builder.setPositiveButton("Yes", new DialogInterface.OnClickListener() {

            @Override
            public void onClick(DialogInterface dialogInterface, int i) {*/
                startActivity(nb);
            /*}
        }).setNegativeButton("No", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                dialogInterface.cancel();
            }
        });
        AlertDialog alert = builder.create();
        alert.show();*/

    }
}
