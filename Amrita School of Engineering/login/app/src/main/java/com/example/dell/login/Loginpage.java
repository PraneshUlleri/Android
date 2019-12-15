package com.example.dell.login;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;

import static android.view.View.VISIBLE;

public class Loginpage extends AppCompatActivity {
ImageView v;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loginpage);

        ImageView v = findViewById(R.id.imageView2);
        v.setVisibility(VISIBLE);
    }
}
