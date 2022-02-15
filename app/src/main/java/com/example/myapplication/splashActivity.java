package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class splashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash2);

        Thread saif=new Thread(){

            public void run(){
                try {
                    sleep(5000);
                    Intent i=new Intent(splashActivity.this,MainActivity.class);
                    startActivity(i);
                }
                catch (Exception e){
                    e.printStackTrace();
                }


            }
        };saif.start();
    }
}