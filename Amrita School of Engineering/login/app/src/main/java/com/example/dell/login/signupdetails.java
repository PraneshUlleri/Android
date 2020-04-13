package com.example.dell.login;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class signupdetails extends AppCompatActivity {
TextView txtname,txtemail,ph;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signupdetails);



        txtname=findViewById(R.id.textname);
        txtemail=findViewById(R.id.txtmail);
        ph=findViewById(R.id.txtphone);

        String username=getIntent().getStringExtra("name");
        txtname.setText( username );
        String em=getIntent().getStringExtra("mail");
        txtemail.setText( em );
        String phone=getIntent().getStringExtra("ph");
        ph.setText( phone );


    }
}
