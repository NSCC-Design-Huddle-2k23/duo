package com.example.quizotic;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class Activity2 extends AppCompatActivity {
    Button b1;
    EditText ed1,ed2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.secondactivity);
        b1 = (Button)findViewById(R.id.button);
        ed1 = (EditText)findViewById(R.id.editTextTextEmailAddress);
        ed2 = (EditText)findViewById(R.id.editTextTextPassword);
        Intent k= getIntent();
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(ed1.getText().toString().equals("srec") || ed2.getText().toString().equals("admin")) {
                    Intent l = new Intent(Activity2.this, Activity4.class);
                    startActivity(l);
                }else{
                    Toast.makeText(getApplicationContext(), "Wrong Credentials",Toast.LENGTH_SHORT).show();
                }

            }
        });
        }
}