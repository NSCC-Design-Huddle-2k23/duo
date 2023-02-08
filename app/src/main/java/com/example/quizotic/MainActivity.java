package com.example.quizotic;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button b1,b2;
    EditText ed1,ed2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1 = (Button)findViewById(R.id.button);
        ed1 = (EditText)findViewById(R.id.editTextTextEmailAddress);
        ed2 = (EditText)findViewById(R.id.editTextTextPassword);
        b2 = (Button)findViewById(R.id.button2);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(ed1.getText().toString().equals("srec") || ed2.getText().toString().equals("admin")) {
                    Intent i = new Intent(MainActivity.this, Activity4.class);
                    startActivity(i);
                }else{
                    Toast.makeText(getApplicationContext(), "Wrong Credentials",Toast.LENGTH_SHORT).show();
                }
            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent j = new Intent(MainActivity.this, Activity3.class);
                startActivity(j);
            }
        });
    }
}