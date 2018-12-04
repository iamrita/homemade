package android2018.amrita.com.homemadescreens;

import android.app.DialogFragment;


import android.app.Dialog;
import android.app.TimePickerDialog;
import android.content.Context;
import android.content.Intent;
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

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_schedule);

        Button sendAvailability = (Button)findViewById(R.id.send_availability);
        final Context context = this;

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
        System.out.println("HOUR IS HOUR IS " + hour);
        System.out.println("MINUTE IS MINUTE IS" + minute);
    }

}
