package com.example.tutorial;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class qst2 extends AppCompatActivity {
Button bp,bm;
TextView t1;
int i=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_qst2);
        t1=findViewById(R.id.textView6);
        bp= findViewById(R.id.button);
        bm=findViewById(R.id.button2);
        bp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i++;
                t1.setText(i+"");
            }
        });
        bm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i--;
                t1.setText(i+"");
            }
        });
    }
}
