package com.example.tutorial;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RatingBar;
import android.widget.TextView;

public class qst3 extends AppCompatActivity {
RatingBar  rb1,rb2;
Button b;
TextView t1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_qst3);
        t1=findViewById(R.id.t33);
        rb1=findViewById(R.id.ratingBar);
        rb2=findViewById(R.id.ratingBar2);
        b=findViewById(R.id.b1);

        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                t1.setText("Your rating for Endgame:"+rb1.getRating() +"\n rating for Joker:"+rb2.getRating());
            }
        });
    }
}
