package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);


        Thread thread =new Thread(){

            public void run(){

                try {
                    sleep(3000);
                    Intent i=new Intent(MainActivity2.this, MainActivity.class);
                    startActivity(i);
                }
                catch (Exception e){
                    e.printStackTrace();
                }

            }
        };thread.start();
    }
}