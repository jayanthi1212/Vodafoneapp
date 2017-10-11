package com.ench.jaya.vodafoneapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class second extends AppCompatActivity {
 ImageView im1,im2,im3,im4,im5,im6,im7;
    Button b2 ,b3,B4;
    Snackbar mSnackBar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
im1=(ImageView) findViewById(R.id.imageView2);


        b2=(Button) findViewById(R.id.button3);

        B4=(Button) findViewById(R.id.button6);
        B4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(second.this,Shop.class);
                startActivity(intent);
            }
        });
        b3=(Button) findViewById(R.id.button8);
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(second.this,zoo.class);
                startActivity(intent);
            }
        });

        im1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(second.this,Contactus.class);
                startActivity(intent);
            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "welcome to family", Snackbar.LENGTH_LONG)
                        .setAction("", null)
                        .show();

            }


        });

    }

}
