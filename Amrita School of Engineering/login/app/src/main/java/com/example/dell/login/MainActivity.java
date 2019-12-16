package com.example.dell.login;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ActionBar;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;

import static java.lang.Thread.sleep;

public class MainActivity extends AppCompatActivity {
    TextView textlogin,textquiz;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

     //   actionBar = getActionBar();
     //   actionBar.hide();


        textlogin=findViewById(R.id.loginTXT);
        textquiz=findViewById(R.id.textquiz);

        textlogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                    Intent act2= new Intent(getApplicationContext(),Loginpage.class);
                    startActivity(act2);
            }
        });
        textquiz.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                Intent actq=new Intent(getApplicationContext(),quiz.class);
                startActivity(actq);
            }
        });

    }
}
