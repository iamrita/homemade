package android2018.amrita.com.homemadescreens;

import android.app.DialogFragment;


import android.app.Dialog;
import android.app.TimePickerDialog;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.text.format.DateFormat;
import android.view.View;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.*;

import java.util.Calendar;


public class ScheduleActivity extends AppCompatActivity{

    Button sendAvailability;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_schedule);


        sendAvailability = (Button)findViewById(R.id.send_availability);
        final Context context = this;
        sendAvailability.setEnabled(false);
        sendAvailability.setBackgroundColor(Color.parseColor("#808080"));

        sendAvailability.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(context, ConfirmTravelerActivity.class);
                startActivity(intent);

            }
        });

        ImageButton back = (ImageButton)findViewById(R.id.back);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(context, profileActivityLeila.class);
                startActivity(intent);
            }
        });


    }

    public void showTimePickerDialog(View v) {

        android.app.DialogFragment newFragment = new TimePickerFragment();
        newFragment.show(getFragmentManager(), "TimePicker");
        int hour = ((TimePickerFragment) newFragment).getHour();
        int minute = ((TimePickerFragment) newFragment).getMinute();

    }

    public void showTimePickerDialog2(View v) {
        android.app.DialogFragment newFragment = new TimePickerFragment2();
        newFragment.show(getFragmentManager(), "TimePicker");
        int hour = ((TimePickerFragment2) newFragment).getHour();
        int minute = ((TimePickerFragment2) newFragment).getMinute();

    }
    public void showTimePickerDialog3(View v) {
        android.app.DialogFragment newFragment = new TimePickerFragment3();
        newFragment.show(getFragmentManager(), "TimePicker");
        int hour = ((TimePickerFragment3) newFragment).getHour();
        int minute = ((TimePickerFragment3) newFragment).getMinute();

    }
    public void showTimePickerDialog4(View v) {
        android.app.DialogFragment newFragment = new TimePickerFragment4();
        newFragment.show(getFragmentManager(), "TimePicker");
        int hour = ((TimePickerFragment4) newFragment).getHour();
        int minute = ((TimePickerFragment4) newFragment).getMinute();

        sendAvailability.setEnabled(true);
        sendAvailability.setBackgroundColor(Color.parseColor("#bb284c"));

    }

}
