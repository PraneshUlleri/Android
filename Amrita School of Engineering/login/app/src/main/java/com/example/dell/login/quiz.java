package com.example.dell.login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class quiz extends AppCompatActivity {
TextView question;

int i=0;
Button btnnext;
RadioGroup radiogroup;
RadioButton radiobutton,option1,option2,option3;
int score=10;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);

        question=findViewById(R.id.textquestion);
        option1=findViewById(R.id.rbtnop1);
        option2=findViewById(R.id.rbtnop2);
        option3=findViewById(R.id.rbtnop3);
        radiogroup=findViewById(R.id.radiogrp);

        if(i==0){
            question.setText("Q1: Are you awesome > > >");
              option1.setText("yes");
              option2.setText("really awesome");
              option3.setText("Ultra legendary awsome");

        }
        btnnext=findViewById(R.id.btnnext);
        btnnext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (i==0){
                    if(option3.isChecked()){
                        score=score+30;
                    }
                    else if(option2.isChecked()){score=score+20;}
                    else if(option1.isChecked()){score=score+10;}
                    question.setText("Q2: Are you daring > > >");
                    option1.setText("yes");
                    option2.setText("really daring");
                    option3.setText("Ultra legendary");
                    i++;

                }
                else if(i==1){
                    if(option3.isChecked()){
                        score=score+30;
                    }
                    else if(option2.isChecked()){score=score+20;}
                    else if(option1.isChecked()){score=score+10;}
                    question.setText("Q3: Are you the trend setter > > >");
                    option1.setText("yes");
                    option2.setText("really a trend setter");
                    option3.setText("Ultra trend-setter");
                    i++;
                    btnnext.setText("submit");

                }
               else if(i==2){
                    if(option3.isChecked()){
                        score=score+30;
                    }
                    else if(option2.isChecked()){score=score+20;}
                    else if(option1.isChecked()){score=score+10;}
                    Intent result=new Intent(getApplicationContext(),result.class);
                    String s= String.valueOf(score);
                    result.putExtra("score",s);
                    startActivity(result);

                }

            }
        });




    }

    public void clickbtn(View v){
        int radio= radiogroup.getCheckedRadioButtonId();
        radiobutton=findViewById(radio);
        Toast.makeText(this,"you selected "+ radiobutton.getText() +score, Toast.LENGTH_SHORT).show();
    }

}
