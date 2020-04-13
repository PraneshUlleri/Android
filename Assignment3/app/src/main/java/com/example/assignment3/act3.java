package com.example.assignment3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class act3 extends AppCompatActivity {
private ListView l;
private question3Adapter adapter;
private List<question3> nq3list;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_act3);

        l=findViewById(R.id.listq3);
        nq3list=new ArrayList<>();
        nq3list.add (new question3(1, "title 1","short desc"));
        nq3list.add (new question3(2, "title 2","short desc"));
        nq3list.add (new question3(3, "title 3","short desc"));
        nq3list.add (new question3(4, "title 4","short desc"));
        nq3list.add (new question3(5, "title 5","short desc"));

            adapter = new question3Adapter(getApplicationContext(), nq3list);
            l.setAdapter(adapter);

            l.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                    Toast.makeText(getApplicationContext(),view.getId()+" ",Toast.LENGTH_SHORT).show();
                }
            });

    }
}
