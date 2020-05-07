package com.example.smsapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;

import android.Manifest;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.telephony.SmsManager;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class smsManager extends AppCompatActivity {
EditText et,et2;
Button button;
final int SEND_SMS_PERMISSION_REQUEST_CODE = 1 ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sms_manager);
        et=findViewById(R.id.editText);et2=findViewById(R.id.editText2);
        button=findViewById(R.id.button);

        button.setEnabled(false);
        if (checkPermission(Manifest.permission.SEND_SMS)){
            button.setEnabled(true);
        }else {
            ActivityCompat.requestPermissions(this,new String[] {Manifest.permission.SEND_SMS},SEND_SMS_PERMISSION_REQUEST_CODE);
        }

    }

    public void onSend(View v){
        String phone = et.getText().toString();
        String message =et2.getText().toString();
        if (phone == null || phone.length()==0||message==null||message.length()==0){
            return;
        }

        if(checkPermission(Manifest.permission.SEND_SMS)){
            SmsManager smsManager= SmsManager.getDefault();
            smsManager.sendTextMessage(phone,null,message,null,null);
            Toast.makeText(this, "Msg sent!!!", Toast.LENGTH_SHORT).show();
        }else{            Toast.makeText(this, "no permission!!!" ,Toast.LENGTH_SHORT).show();
        }
    }
    public boolean checkPermission(String permission){
        int check = ContextCompat.checkSelfPermission(this , permission);
        return (check== PackageManager.PERMISSION_GRANTED);

    }
}
