package com.example.assignment3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class act4 extends AppCompatActivity {
    private ListView l;
    private question3Adapter adapter;
    private List<question3> nq3list;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_act4);


        l=findViewById(R.id.listq3);
        nq3list=new ArrayList<>();
        nq3list.add (new question3(1, "Someone like you","short desc"));
        nq3list.add (new question3(2, "title 2","short desc"));
        nq3list.add (new question3(3, "title 3","short desc"));
        nq3list.add (new question3(4, "title 4","short desc"));
        nq3list.add (new question3(5, "title 5","short desc"));

        adapter = new question3Adapter(getApplicationContext(), nq3list);
        l.setAdapter(adapter);
    }
}
