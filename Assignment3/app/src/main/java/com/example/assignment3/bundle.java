package com.example.assignment3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class bundle extends AppCompatActivity {
TextView t1,t2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bundle);
        t1=findViewById(R.id.textView2);
        t2=findViewById(R.id.textView3);
        Bundle b= getIntent().getExtras();
        String T1 , T2;
        T1=b.getString("k1");
        T2=b.getString("k2");
      //  Toast.makeText(getApplicationContext(),"fvf"+T1,Toast.LENGTH_SHORT);
        t1.setText(T1);
                t2.setText(T2);

    }
}
