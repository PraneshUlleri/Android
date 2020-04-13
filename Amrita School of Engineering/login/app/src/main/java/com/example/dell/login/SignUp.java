package com.example.dell.login;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class SignUp extends AppCompatActivity {
    EditText etFname,etLname,email, phonenumber;
    Button signup,login;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        etFname=findViewById(R.id.editFName);
        etLname=findViewById(R.id.editLName);
        email=findViewById(R.id.editemail);
        phonenumber=findViewById(R.id.editph);
         login=findViewById(R.id.btnlogin);
         signup=findViewById(R.id.btnsignup);
         login.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 Intent i = new Intent(getApplicationContext(),Loginpage.class);
                 startActivity(i);
             }
         });
        signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(),signupdetails.class);
                String n= etFname.getText().toString();
                String em =email.getText().toString();
                String ph =phonenumber.getText().toString();

                i.putExtra("name",n);
                i.putExtra("mail",em);
                i.putExtra("ph",ph);
                startActivity(i);
            }
        });
//           signup.setOnClickListener(new View.OnClickListener() {
//               @Override
//               public void onClick(View v) {
//
//               }
//           });

    }
}
