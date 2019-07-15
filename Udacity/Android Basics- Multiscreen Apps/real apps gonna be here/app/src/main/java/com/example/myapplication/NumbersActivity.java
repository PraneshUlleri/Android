package com.example.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class NumbersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers);
        ArrayList<word>words= new ArrayList<word>();

        words.add(new word("zero", "poojyam"));
        words.add(new word("one","onnu"));
        words.add(new word("two","randu"));
        words.add(new word("three","moonu"));
        words.add(new word("four","nallu"));
        words.add(new word("five","anju"));
        words.add(new word("six","arru"));
        words.add(new word("seven","aeru"));
        words.add(new word("eight","aetu"));
        words.add(new word("nine","oomadu"));
        words.add(new word("ten","pathu"));
        //LinearLayout root = (LinearLayout)findViewById(R.id.numbers);

//        for (int i=0;i<word.size();i++){
//            TextView wordView= new TextView(this);
//            wordView.setText(word.get(i));
//            root.addView(wordView);
//
//        }
        //ArrayAdapter<word> itemsAdapter = new ArrayAdapter<word>(this, R.layout.list_item, word);
        //
        WordAdapter adapter= new WordAdapter(this, words);
        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(adapter);
    }
}
