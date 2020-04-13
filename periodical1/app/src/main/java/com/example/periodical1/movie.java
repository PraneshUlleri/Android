package com.example.periodical1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RatingBar;
import android.widget.TextView;
import android.widget.Toast;

public class movie extends AppCompatActivity {
TextView date;
Button rating;
RatingBar r1,r2,r3,r4,r5;
float maxrate=0,avgrate,rate;
String bestmov;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_movie);
        rating= findViewById(R.id.button2);
           r1=findViewById(R.id.ratingBar);
           r2=findViewById(R.id.ratingBar2);
           r3=findViewById(R.id.ratingBar3);
           r4=findViewById(R.id.ratingBar4);
        r5=findViewById(R.id.ratingBar5);
            rating.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if(maxrate<r1.getRating()){maxrate=r1.getRating(); bestmov="frozen2";}
                    if(maxrate<r2.getRating()){maxrate=r2.getRating(); bestmov="Rocketman";}
                    if(maxrate<r3.getRating()){maxrate=r3.getRating(); bestmov="My Spy";}
                    if(maxrate<r4.getRating()){maxrate=r4.getRating(); bestmov="Joker";}
                    if(maxrate<r5.getRating()){maxrate=r5.getRating(); bestmov="Aladdin";}
                    rate= r1.getRating()+r2.getRating()+r3.getRating()+r4.getRating()+r5.getRating();
                    avgrate=rate/5;
                    Toast.makeText(getApplicationContext(),"Average Rating: "+avgrate+"\n " +
                            "best rate movie:"+bestmov ,Toast.LENGTH_SHORT).show();

                }
            });

    }
}
