package com.example.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;

public class NumbersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers);
        ArrayList<String>word= new ArrayList<String>();

        word.add("zero");
        word.add("one");
        word.add("two");
        word.add("three");
        word.add("four");
        word.add("five");
        word.add("six");
        word.add("seven");
        word.add("eight");
        word.add("nine");
        word.add("ten");
        LinearLayout root = (LinearLayout)findViewById(R.id.numbers);
        TextView wordView= new TextView(this);
        for (int i=0;i<word.size();i++){
            wordView.setText(word.get(i));

        }
        root.addView(wordView);

    }
}
