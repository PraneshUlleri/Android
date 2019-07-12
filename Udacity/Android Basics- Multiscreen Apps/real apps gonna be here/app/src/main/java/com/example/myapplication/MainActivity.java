package com.example.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void family(View view){
        Intent intent=new Intent(this,FamilyActivity.class);
        startActivity(intent);
    }
    public void color(View view){
        Intent intent = new Intent (this, ColorsActivity.class);
        startActivity(intent);
    }

    public void phase(View view){
        Intent intent = new Intent (this, PhasesActivity.class);
        startActivity(intent);
    }

    public void number(View view){
        Intent intent = new Intent (this, NumbersActivity.class);
        startActivity(intent);  
    }


}
