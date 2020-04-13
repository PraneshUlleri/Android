package com.example.exam2o;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class display extends AppCompatActivity {
    private ListView lv;
    private clistAdapter cadap;
    private List<clist> conlist;
    ImageView iadd;
    String Nname,Nnum,Nmail,Ngen;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display);
        lv=findViewById(R.id.contactlist);
        iadd=findViewById(R.id.imgadd);


        Intent inten =getIntent();
        Nname= inten.getStringExtra("name");
        Nnum= inten.getStringExtra("num");
        Nmail= inten.getStringExtra("mail");
        Ngen= inten.getStringExtra("gender");

        Toast.makeText(this,Nname+" ",Toast.LENGTH_SHORT).show();

        conlist=new ArrayList<>();
        conlist.add (new clist(1, ""+Nname,""+Nnum));
        conlist.add (new clist(2, "bill","15151"));


        cadap = new clistAdapter(getApplicationContext(), conlist);
        lv.setAdapter(cadap);


        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(getApplicationContext(),position+" ",Toast.LENGTH_SHORT).show();

                Intent intt= new Intent(getApplicationContext(),details.class);
                intt.putExtra("name",Nname);
                intt.putExtra("num",Nnum);
                intt.putExtra("mail",Nmail);
                intt.putExtra("gen",Ngen);

                startActivity(intt);
            }
        });
        iadd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(),addcontact.class);
                startActivity(i);
            }
        });

    }
}
