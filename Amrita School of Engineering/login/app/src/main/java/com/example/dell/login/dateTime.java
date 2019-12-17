package com.example.dell.login;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.TextView;
import android.widget.TimePicker;

import androidx.appcompat.app.AppCompatActivity;

public class dateTime extends AppCompatActivity {
TextView string,date;
Button submit;
    DatePicker simpleDatePicker;
    TimePicker simpleTimePicker;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_date_time);
        string=findViewById(R.id.textdateandtime);

      //  simpleDatePicker=findViewById(R.id.calendarView);
        simpleTimePicker=findViewById(R.id.simpleTimePicker);
        simpleTimePicker.setIs24HourView(false);
         simpleTimePicker.setOnTimeChangedListener(new TimePicker.OnTimeChangedListener() {
            @Override
            public void onTimeChanged(TimePicker view, int hourOfDay, int minute) {
                // display a toast with changed values of time picker
              string.setText("Time is :: " + hourOfDay + " : " + minute); // set the current time in text view

            }
        });
date=findViewById(R.id.textdate);
        simpleDatePicker =findViewById(R.id.simpleDatePicker);
        submit = findViewById(R.id.submitbutton);
        // perform click event on submit button
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // get the values for day of month , month and year from a date picker
                int day =  simpleDatePicker.getDayOfMonth();
                int month = (simpleDatePicker.getMonth() + 1);
                int year = simpleDatePicker.getYear();
                // display the values by using a toast
                date.setText("Date:"+day+"/"+month+"/"+year);
            }
        });



    }
}
