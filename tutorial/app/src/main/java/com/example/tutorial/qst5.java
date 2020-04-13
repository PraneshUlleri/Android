package com.example.tutorial;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;

public class qst5 extends AppCompatActivity {
    String [] country= {"India", "China","USA","Canada","bahrain","saudi","UAE","japan","ukraine","russia"};
    AutoCompleteTextView ac;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_qst5);

        ac=findViewById(R.id.ac);
        ArrayAdapter aa= new ArrayAdapter(this,android.R.layout.select_dialog_item,country );
        ac.setAdapter(aa);
    }
}
