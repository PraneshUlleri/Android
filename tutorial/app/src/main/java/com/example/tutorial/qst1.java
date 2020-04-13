package com.example.tutorial;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.lang.reflect.Array;

public class qst1 extends AppCompatActivity {
Button b;
ConstraintLayout c;
int [] A={R.drawable.b,R.drawable.c,R.drawable.d,R.drawable.e,R.drawable.f,R.drawable.a};
int i=0;
String alpha;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_qst1);
        c=findViewById(R.id.constt);
        b=findViewById(R.id.btnBkgChng);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(i<=6){i=i%6;

                 c.setBackgroundResource(A[i]);
                 i++;}
            }
        });
    }
}
