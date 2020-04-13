package com.example.assignment3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class act2 extends AppCompatActivity {
EditText et1,et2;
Button b;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_act2);
        et1=findViewById(R.id.editText);
        et2=findViewById(R.id.editText2);
        b=findViewById(R.id.button);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               // Toast.makeText(getApplicationContext(),et1.getText().toString()+"4", Toast.LENGTH_SHORT).show();
                Intent i = new Intent(getApplicationContext(),bundle.class);
                Bundle b=new Bundle();
                b.putString("k1",et1.getText().toString());
                b.putString("k2",et2.getText().toString());
                i.putExtras(b);
                startActivity(i);
            }
        });

    }
}
