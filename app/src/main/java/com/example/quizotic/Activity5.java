package com.example.quizotic;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class Activity5 extends AppCompatActivity {
    CheckBox c1,c2,c3,c4;
    Button submit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fifthactivity);
        addListenerOnButtonClick();
    }

    private void addListenerOnButtonClick() {
        c1=(CheckBox)findViewById(R.id.checkBox);
        c2=(CheckBox)findViewById(R.id.checkBox2);
        c3=(CheckBox)findViewById(R.id.checkBox3);
        c4=(CheckBox)findViewById(R.id.checkBox3);
        submit=(Button)findViewById(R.id.button4);
        Intent m= getIntent();
        submit.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                StringBuilder result=new StringBuilder();
                if(c1.isChecked()){
                    result.append("correct");
                }
                else{
                    result.append("wrong");
                }
                Toast.makeText(getApplicationContext(), result.toString(), Toast.LENGTH_LONG).show();
            }

        });
    }
}
