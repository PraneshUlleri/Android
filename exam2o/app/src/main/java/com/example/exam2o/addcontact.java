package com.example.exam2o;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class addcontact extends AppCompatActivity {
EditText edname,ednumber,edemail;
RadioGroup rg;
RadioButton f,m;
    int selectedId;
Button b;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_addcontact);
        edname=findViewById(R.id.editText);
        ednumber=findViewById(R.id.editText2);
        edemail=findViewById(R.id.editText3);
        b=findViewById(R.id.button);
        rg=findViewById(R.id.rgroup);
        selectedId = rg.getCheckedRadioButtonId();
        f=findViewById(R.id.female);
        m=findViewById(R.id.male);


        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(),display.class);
                        i.putExtra("name",edname.getText());
                i.putExtra("num",ednumber.getText());
                i.putExtra("mail",edemail.getText());
                if(f.isChecked()) {
                    i.putExtra("gender","female" );
                    Toast.makeText(getApplicationContext()," feml",Toast.LENGTH_SHORT).show();
                }
                else{i.putExtra("gender","male");}//Toast.makeText(getApplicationContext()," "+,Toast.LENGTH_SHORT).show();
                startActivity(i);
            }
        });


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        MenuInflater menuInflater=getMenuInflater();
        menuInflater.inflate(R.menu.add,menu);
        return true;
    }
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        Intent i = new Intent(getApplicationContext(),MainActivity.class);
        switch (item.getItemId()){
            case R.id.id1:
                Toast.makeText(this,"deleting",Toast.LENGTH_SHORT).show();
                startActivity(i);
                return true;
            case R.id.id2:
                Toast.makeText(this,"starred",Toast.LENGTH_SHORT).show();
                return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
