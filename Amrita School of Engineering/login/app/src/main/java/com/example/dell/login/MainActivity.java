package com.example.dell.login;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    TextView textlogin,textquiz,cal,dat, clock;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

     //   actionBar = getActionBar();
     //   actionBar.hide();

        dat=findViewById(R.id.datetime);
        textlogin=findViewById(R.id.loginTXT);
        textquiz=findViewById(R.id.textquiz);
        cal=findViewById(R.id.textcalc);
        clock=findViewById(R.id.textdigitalclock);
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
        cal.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                Intent actq=new Intent(getApplicationContext(),calc.class);
                startActivity(actq);
            }
        });
        dat.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                Intent dt=new Intent(getApplicationContext(),dateTime.class);
                startActivity(dt);
            }
        });
        clock.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                Intent clk=new Intent(getApplicationContext(),digitalclock.class);
                startActivity(clk);
            }
        });

    }
}
