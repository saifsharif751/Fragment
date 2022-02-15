package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

public class fragment extends AppCompatActivity {
    Button btnred,btnyellow;
    LinearLayout layout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fragment);

        btnred=findViewById(R.id.red);
        btnyellow=findViewById(R.id.yellow);

        btnred.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                red_Fragment redFragment=new red_Fragment();
                FragmentTransaction transaction=getSupportFragmentManager().beginTransaction();
                transaction.replace(R.id.layout,redFragment);
                transaction.commit();
            }
        });

        btnyellow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                yellow_Fragment yellowFragment=new yellow_Fragment();
                FragmentTransaction transaction=getSupportFragmentManager().beginTransaction();
                transaction.replace(R.id.layout,yellowFragment);
                transaction.commit();
            }
        });
    }
}