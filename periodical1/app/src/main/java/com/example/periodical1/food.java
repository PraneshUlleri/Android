package com.example.periodical1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.strictmode.WebViewMethodCalledOnWrongThreadViolation;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class food extends AppCompatActivity {
TextView date;
AutoCompleteTextView ac;
Button b;
String [] drinks= {"Coke", "Pepsi","Fanta"};
RadioGroup r;
RadioButton b1,b2;
CheckBox i1,i2,i3,i4;
int val=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food);
        date=findViewById(R.id.txtdate);

        ac=findViewById(R.id.autoc);
        ArrayAdapter aa= new ArrayAdapter(this,android.R.layout.select_dialog_item,drinks );
        ac.setAdapter(aa);
        b1=findViewById(R.id.rbtn1);
        b2=findViewById(R.id.rbtn2);
        i1=findViewById(R.id.checkBox3);
                i2=findViewById(R.id.checkBox4);

                i3=findViewById(R.id.checkBox5);
                i4=findViewById(R.id.checkBox6);
            b=findViewById(R.id.btnorder);

        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            if(b1.isChecked()){val+=100;}
            else if(b2.isChecked()){val+=200;}
            if(i1.isChecked()){val+=50;}
                if(i2.isChecked()){val+=30;}
                if(i3.isChecked()){val+=50;}
                if(i4.isChecked()){val+=30;}
            if(ac!=null){val+=40;}


                    Toast.makeText(getApplicationContext(), "price " +val, Toast.LENGTH_SHORT).show();

            }
        });
   }


}
