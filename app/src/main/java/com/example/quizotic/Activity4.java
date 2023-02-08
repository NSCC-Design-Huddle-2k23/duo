package com.example.quizotic;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.bottomnavigation.BottomNavigationView;


public class Activity4 extends AppCompatActivity implements BottomNavigationView.OnNavigationItemSelectedListener {
    BottomNavigationView bottomNavigationView;
    ImageButton img1,img2,img3,img4,img5,img6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        img1 =(ImageButton)findViewById(R.id.imageButton2);
        img2 =(ImageButton)findViewById(R.id.imageButton3);
        img3 =(ImageButton)findViewById(R.id.imageButton4);
        img4 =(ImageButton)findViewById(R.id.imageButton5);
        img5 =(ImageButton)findViewById(R.id.imageButton8);
        img6 =(ImageButton)findViewById(R.id.imageButton);

        img1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                public void callfifthActivity (View v){
                    Intent i = new Intent(getApplicationContext(), Activity5.class);
                    startActivity(i);
                }
            }
        });
        img2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                public void callfifthActivity(View v){
                Intent i = new Intent(getApplicationContext(), Activity5.class)  ;
                startActivity(i);
            } }
        });
        img3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                public void callfifthActivity(View v){
               Intent i = new Intent(getApplicationContext(), Activity5.class);
               startActivity(i);
            }            }
        });
        img4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                public void callfifthActivity(View v ){
                Intent i = new Intent(getApplicationContext(), Activity5.class);
                 startActivity(i);    }
            }
        });
        img5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                public void callfifthActivity(View v ){
                Intent i=new Intent(getApplicationContext(),Activity5.class);
                 startActivity(i);           }
            }
        });
        img6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                public void callfifthActivity(View v ){
                Intent i=new Intent(getApplicationContext(),Activity5.class);
                 startActivity(i);      }
            }
        });
        setContentView(R.layout.fourthactivity);

        bottomNavigationView = findViewById(R.id.bottomNavigationView);

        bottomNavigationView.setOnNavigationItemSelectedListener(this);
        bottomNavigationView.setSelectedItemId(R.id.person);

    }
    FirstFragment firstFragment = new FirstFragment();
    SecondFragment secondFragment = new SecondFragment();
    ThirdFragment thirdFragment = new ThirdFragment();
    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case R.id.person:
                getSupportFragmentManager().beginTransaction().replace(R.id.person, firstFragment).commit();
                return true;

            case R.id.home:
                getSupportFragmentManager().beginTransaction().replace(R.id.home, secondFragment).commit();
                return true;

            case R.id.settings:
                getSupportFragmentManager().beginTransaction().replace(R.id.settings, thirdFragment).commit();
                return true;
        }
        return false;
    }
}
