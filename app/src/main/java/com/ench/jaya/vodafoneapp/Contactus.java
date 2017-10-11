package com.ench.jaya.vodafoneapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageView;

public class Contactus extends AppCompatActivity {
    ImageView im1,im2,im3,im4,im5,im6,im7;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contactus);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        im1=(ImageView) findViewById(R.id.imageView14);
        im2=(ImageView) findViewById(R.id.imageView15);
        im3=(ImageView) findViewById(R.id.imageView16);
        im4=(ImageView) findViewById(R.id.imageView17);
        im5=(ImageView) findViewById(R.id.imageView18);
        im6=(ImageView) findViewById(R.id.imageView19);

        im1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(Contactus.this,opening.class);
                startActivity(intent);
            }
        });
        im1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(Contactus.this,opening.class);
                startActivity(intent);
            }
        });
        im2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(Contactus.this,opening.class);
                startActivity(intent);
            }
        });
        im3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(Contactus.this,opening.class);
                startActivity(intent);
            }
        });
        im4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(Contactus.this,opening.class);
                startActivity(intent);
            }
        });
        im5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(Contactus.this,opening.class);
                startActivity(intent);
            }
        });
        im6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(Contactus.this,opening.class);
                startActivity(intent);
            }
        });


    }

}
