package com.champwang.test.myapplication;

import android.app.DatePickerDialog;
import android.app.TimePickerDialog;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.TimePicker;

import java.sql.SQLOutput;

/**
 * Created by champwang on 2018/8/7.
 */

public class ChooseADate extends AppCompatActivity {
    Button btnChooseDate;
    Button btnChooseTime;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.choose_date);

        btnChooseDate =  (Button) findViewById(R.id.btnChooseDate);
        btnChooseTime = (Button) findViewById(R.id.btnChooseTime);

        btnChooseDate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new DatePickerDialog(ChooseADate.this, new DatePickerDialog.OnDateSetListener() {
                    @Override
                    public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {
                        String theData = String.format("%d-%d-%d",year, month + 1 , dayOfMonth);
                        System.out.println(theData);
                        btnChooseDate.setText(theData);
                    }
                }, 2018, 8,7).show();

            }
        });


        btnChooseTime.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new TimePickerDialog(ChooseADate.this, new TimePickerDialog.OnTimeSetListener() {
                    @Override
                    public void onTimeSet(TimePicker view, int hourOfDay, int minute) {
                        String theTime = String.format("%d:%d", hourOfDay, minute);
                        System.out.println(theTime);
                        btnChooseTime.setText(theTime);
                    }
                }, 0, 0, true).show();
            }
        });
    }
}
