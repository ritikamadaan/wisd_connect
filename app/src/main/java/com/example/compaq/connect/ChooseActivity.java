package com.example.compaq.connect;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class ChooseActivity extends AppCompatActivity {
    private static RadioGroup rg;
    private static RadioButton rb;
    Intent k,lm;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choose);

    }
    public void select(View v)
    {
        rg=(RadioGroup)findViewById(R.id.radio);
        int selectedID=rg.getCheckedRadioButtonId();
        rb=(RadioButton)findViewById(selectedID);
                String sel=rb.getText().toString();
                if(sel.equals("Yourself"))
                {

                    lm= new Intent(this, LocationclassesActivity.class);
                    //   Toast.makeText(this, "You did not enter the place", Toast.LENGTH_SHORT).show();
                    // return;


                    AlertDialog.Builder builder = new AlertDialog.Builder(ChooseActivity.this);
                    builder.setTitle("Alert");
                    builder.setMessage("You would require internet services...Press ok to continue");
                    builder.setPositiveButton("Ok", new DialogInterface.OnClickListener() {

                        @Override
                        public void onClick(DialogInterface dialogInterface, int i) {
                            startActivity(lm);
                        }
                    }).setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i) {
                            dialogInterface.cancel();
                        }
                    });
                    AlertDialog alert = builder.create();
                    alert.show();

                }
                else
                {
                  k=new Intent(this,RangeActivity.class);
                    startActivity(k);
                }

            }


}
