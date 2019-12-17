package com.example.dell.login;

import android.os.Build;
import android.os.Bundle;
import android.widget.DatePicker;
import android.widget.TextView;
import android.widget.TimePicker;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

public class dateTime extends AppCompatActivity {
TextView string,date;

    DatePicker simpleDatePicker;
    TimePicker simpleTimePicker;
    @RequiresApi(api = Build.VERSION_CODES.O)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_date_time);
        string=findViewById(R.id.textdateandtime);

        simpleTimePicker=findViewById(R.id.simpleTimePicker);
        simpleTimePicker.setIs24HourView(false);
         simpleTimePicker.setOnTimeChangedListener(new TimePicker.OnTimeChangedListener() {
            @Override
            public void onTimeChanged(TimePicker view, int hourOfDay, int minute) {

              string.setText("Time is: " + hourOfDay + " : " + minute);

            }
        });
date=findViewById(R.id.textdate);
        simpleDatePicker =findViewById(R.id.simpleDatePicker);


        simpleDatePicker.setOnDateChangedListener(new DatePicker.OnDateChangedListener() {
            @Override
            public void onDateChanged(DatePicker view, int year, int monthOfYear, int dayOfMonth) {
                date.setText(dayOfMonth+" : " + monthOfYear + " : " +year);
            }
        });

    }
}
