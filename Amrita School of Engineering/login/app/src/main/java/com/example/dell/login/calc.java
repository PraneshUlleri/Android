package com.example.dell.login;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class calc extends AppCompatActivity {
Button btndiv, btnclear, btndot,btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,btn0,btnplus,btnminus,btnprod;
TextView res,res1;
    private static final char ADDITION = '+';
    private static final char SUBTRACTION = '-';
    private static final char MULTIPLICATION = '*';
    private static final char DIVISION = '/';

    private char CURRENT_ACTION;
    float a,b,i,c;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calc);


        res1=findViewById(R.id.calctext);
        btn0=findViewById(R.id.btn0);
        btn1=findViewById(R.id.btn1);
        btn2=findViewById(R.id.btn2);
        btn3=findViewById(R.id.btn3);
        btn4=findViewById(R.id.btn4);
        btn5=findViewById(R.id.btn5);
        btn6=findViewById(R.id.btn6);
        btn7=findViewById(R.id.btn7);
        btn8=findViewById(R.id.btn8);
        btn9=findViewById(R.id.btn9);
        btnplus=findViewById(R.id.btnplus);
        btnminus=findViewById(R.id.btnmin);
        btnprod=findViewById(R.id.btnmult);
        btndot=findViewById(R.id.btndot);
        btndiv=findViewById(R.id.btndiv);
        btnclear=findViewById(R.id.btnclear);

        res=findViewById(R.id.calctext1);
        Button btneq = findViewById(R.id.btneq);
        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                res.setText(res.getText().toString()+"0");
            }
        });
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                res.setText(res.getText().toString()+"1");
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                res.setText(res.getText().toString()+"2");
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                res.setText(res.getText().toString()+"3");
            }
        });  btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                res.setText(res.getText().toString()+"4");
            }
        });  btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                res.setText(res.getText().toString()+"5");
            }
        });
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                res.setText(res.getText().toString()+"6");
            }
        });
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                res.setText(res.getText().toString()+"7");
            }
        });
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                res.setText(res.getText().toString()+"8");
            }
        });
        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                res.setText(res.getText().toString()+"9");
            }
        });


        btnplus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                a=Integer.parseInt(res.getText().toString());

                res1.setText(res.getText().toString()+"+");
                res.setText("");
                i=1;
            }
        });

        btndiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               // res.setText(res.getText().toString()+"/");
                a=Integer.parseInt(res.getText().toString());

                res1.setText(res.getText().toString()+"/");
                res.setText("");
                i=2;


            }
        });  btnprod.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               // res.setText(res.getText().toString()+"*");
                a=Integer.valueOf(res.getText().toString());

                res1.setText(res.getText().toString()+"*");
                res.setText("");
                i=3;
            }
        });   btnminus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
              //  res.setText(res.getText().toString()+"-");
                a=Integer.parseInt(res.getText().toString());
                Toast.makeText(calc.this, "hb"+a, Toast.LENGTH_SHORT).show();
                res1.setText(res.getText().toString()+"-");
                res.setText("");
                i=4;
                Toast.makeText(calc.this, "hb"+a, Toast.LENGTH_SHORT).show();
            }
        });
        btndot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                res.setText(res.getText().toString()+".");
            }
        });
        btnclear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                res.setText("");
            }
        });
        btneq.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                b=Integer.valueOf(res.getText().toString());
                Toast.makeText(calc.this,a +"" + b,Toast.LENGTH_SHORT).show();
                if(i==1){c=a+b;
                    res1.setText(c+" ");
                    res.setText("");
                }
                else if(i==2){c=a/b;
                    res1.setText(c+" ");
                    res.setText("");}
                else if(i==3){c=a*b;
                    res1.setText(c+" ");
                    res.setText("");}
                else  if(i==4){c=a-b;
                    res1.setText(c +" ");
                    res.setText("");}

            }
        });
    
    }
}
