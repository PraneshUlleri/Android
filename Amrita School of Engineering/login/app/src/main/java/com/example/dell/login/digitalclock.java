package com.example.dell.login;

import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Locale;

public class digitalclock extends AppCompatActivity {
    Button restart;
    TextView timertxt;
    private static final long START_TIME_IN_MILLIS=600000;
    Switch sw;
    private boolean mTimerRunning;
    private CountDownTimer mcountDownTimer;
    private long mtimeLeftInMillis=START_TIME_IN_MILLIS;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_digitalclock);
        timertxt=findViewById(R.id.textTimer);
        restart=findViewById(R.id.button2);
        sw=findViewById(R.id.switch1);

      //  start();

        sw.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                   start();
                } else {
                   pause();
                }
            }
        });
        if(sw.isChecked()){
            Toast.makeText(this,"csc"+sw.isChecked(),Toast.LENGTH_SHORT);
        }
        //if(mTimerRunning){pause();}else{start();}



        restart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                rtimer();
            }
        });

        updateCountDownText();
    }

    private void rtimer() {
        mtimeLeftInMillis=START_TIME_IN_MILLIS;
        updateCountDownText();


    }

    private void start() {
        mcountDownTimer= new CountDownTimer(mtimeLeftInMillis,1000){

            @Override
            public void onTick(long millisUntilFinished) {
                mtimeLeftInMillis=millisUntilFinished;
                updateCountDownText();
            }

            @Override
            public void onFinish() {
                mTimerRunning=false;
                restart.setVisibility(View.VISIBLE);
            }
        }.start();
        mTimerRunning=true;

    }

    private void updateCountDownText() {
        int mini= (int)(mtimeLeftInMillis/1000)/60;
        int sec= (int)(mtimeLeftInMillis/1000)%60;
        String time=String.format(Locale.getDefault(),"%02d:%02d",mini,sec);
        timertxt.setText(time);
    }

    private void pause() {
    mcountDownTimer.cancel();
    mTimerRunning=false;

    }


}
