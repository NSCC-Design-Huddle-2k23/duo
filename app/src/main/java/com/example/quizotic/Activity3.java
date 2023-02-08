package com.example.quizotic;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

public class Activity3 extends AppCompatActivity {
    Button b1;
    EditText ed1,ed2,ed3,ed4,ed5,ed6;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.thirdactivity);
        b1 = (Button)findViewById(R.id.button3);
        ed1 = (EditText)findViewById(R.id.editTextTextPersonName);
        ed2 = (EditText)findViewById(R.id.editTextTextPersonName2);
        ed3 = (EditText)findViewById(R.id.editTextTextEmailAddress3);
        ed4 = (EditText)findViewById(R.id.editTextDate);
        ed5 = (EditText)findViewById(R.id.editTextTextPostalAddress);
        ed6 = (EditText)findViewById(R.id.editTextPhone);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (TextUtils.isEmpty(ed1.getText().toString()) && TextUtils.isEmpty(ed2.getText().toString()) && TextUtils.isEmpty(ed3.getText().toString())
                        && TextUtils.isEmpty(ed4.getText().toString()) && TextUtils.isEmpty(ed5.getText().toString()) && TextUtils.isEmpty(ed6.getText().toString())){
                    Toast.makeText(Activity3.this, "Empty field not allowed!", Toast.LENGTH_SHORT).show();
                }else {
                    public void callSecondActivity (View v){
                        Intent i = new Intent(getApplicationContext(), Activity2.class);
                        startActivity(i);
                    }
                }
            }
            });

    }}