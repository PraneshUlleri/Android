package com.example.exam2o;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class details extends AppCompatActivity {
TextView t1,t2,t3,t4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        t1=findViewById(R.id.textView2);
        t2=findViewById(R.id.textView3);
        t3=findViewById(R.id.textView4);
        t4=findViewById(R.id.textView5);

        Intent intent = getIntent();
        String u1 = intent.getStringExtra("Nname");
        String u2= intent.getStringExtra("Nnum");
        String u3= intent.getStringExtra("Nmail");
        String u4 = intent.getStringExtra("Ngen");

        t1.setText(u1);
        t2.setText(u2);
        t3.setText(u3);t4.setText(u4);


    }
}
