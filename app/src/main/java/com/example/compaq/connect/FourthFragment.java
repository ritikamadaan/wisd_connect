package com.example.compaq.connect;

import android.app.Fragment;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

/**
 * Created by compaq on 07-07-2016.
 */
public class FourthFragment extends Fragment {
    View myView;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        myView= inflater.inflate(R.layout.fourth_layout,container,false);
        final Button call = (Button)myView.findViewById(R.id.button5);
        call.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View myView) {
                Intent i=new Intent();
                i.setAction(Intent.ACTION_VIEW);
                i.setAction(Intent.ACTION_DIAL);
                i.setData(Uri.parse("tel:9953672027"));
                startActivity(i);
            }
        });
        return myView;
    }
}
