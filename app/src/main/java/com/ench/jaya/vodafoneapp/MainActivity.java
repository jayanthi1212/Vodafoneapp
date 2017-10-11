package com.ench.jaya.vodafoneapp;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
Button b1,b2,b3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
//   toolbar.setNavigationIcon(R.drawable.my1);
//    toolbar.setTitle("Vodafone");

        b1=(Button) findViewById(R.id.button);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ineny=new Intent(MainActivity.this,second.class);
                startActivity(ineny);
            }
        });
                b2=(Button) findViewById(R.id.button);
                b2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent=new Intent(MainActivity.this,second.class);
                        intent.setData(Uri.parse("https://play.google.com/store/apps/details?id=com.vodafone.vodafoneplay"));
                        startActivity(intent);
                    }
                });
                        b3=(Button) findViewById(R.id.button);
                        b3.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                Intent ineny1=new Intent(MainActivity.this,second.class);
                                ineny1.setData(Uri.parse ("https://play.google.com/store/apps/details?id=com.vodafone.vmpl.mpesa"));
                                startActivity(ineny1);
                            }
                        });


            }

    }


