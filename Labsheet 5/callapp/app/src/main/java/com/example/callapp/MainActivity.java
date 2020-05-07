package com.example.callapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.security.PrivateKey;

public class MainActivity extends AppCompatActivity {
    Button b;
    EditText et;
    private static final int REQUEST_CALL=1;

    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b = findViewById(R.id.button);
        et = findViewById(R.id.editText);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                makeCall();
            }
        });
    }

    public void makeCall(){
        String number = et.getText().toString();
        if(number.trim().length()>0){
            if(ContextCompat.checkSelfPermission(MainActivity.this,
                    Manifest.permission.CALL_PHONE ) != PackageManager.PERMISSION_GRANTED){
                ActivityCompat.requestPermissions(MainActivity.this,
                        new String[] {Manifest.permission.CALL_PHONE},REQUEST_CALL);
            }else {
                String dial=  "tel:"+number;
                startActivity(new Intent(Intent.ACTION_CALL,Uri.parse(dial)));
            }
        }else{
            Toast.makeText(MainActivity.this,"Enter number ",Toast.LENGTH_SHORT).show();
        }

        Intent callIntent = new Intent(Intent.ACTION_CALL);
        callIntent.setData(Uri.parse("tel:" + number));

        startActivity(callIntent);

    }
    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {

        if (requestCode==REQUEST_CALL){
            if (grantResults .length>0&& grantResults[0]==PackageManager.PERMISSION_GRANTED){
                makeCall();
            }
            else {
                Toast.makeText(this, "cant call",Toast.LENGTH_SHORT).show();
            }
        }
    }
}
