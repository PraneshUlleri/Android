package com.example.emailapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
 EditText sub, email,content;
Button b;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        sub=findViewById(R.id.editText5);
        email=findViewById(R.id.editText4);
        content=findViewById(R.id.editText3);
        b=findViewById(R.id.button);

        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String mailid=email.getText().toString();
                String maillist[] =mailid.split(",");
                String subject=sub.getText().toString();
                String letter = content.getText().toString();

                Intent mail =  new Intent(Intent.ACTION_SEND);
                mail.putExtra(Intent.EXTRA_EMAIL,maillist);
                mail.putExtra(Intent.EXTRA_SUBJECT,subject);
                mail.putExtra(Intent.EXTRA_TEXT,letter);

                mail.setType("letter/rfc822");
                startActivity(mail);
            }
        });

    }
}
