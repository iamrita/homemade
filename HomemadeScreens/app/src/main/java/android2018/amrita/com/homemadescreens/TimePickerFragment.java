package android2018.amrita.com.homemadescreens;

import android.app.Dialog;
import android.app.DialogFragment;
import android.app.TimePickerDialog;
import android.os.Bundle;
import android.text.format.DateFormat;
import android.widget.Button;
import android.widget.TextView;
import android.widget.TimePicker;

import java.util.Calendar;

public class TimePickerFragment extends DialogFragment
        implements TimePickerDialog.OnTimeSetListener {

    int hourSet;
    int minuteSet;


    public int getHour() {
        return hourSet;
    }

    public int getMinute() {
        return minuteSet;
    }

    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        // Use the current time as the default values for the picker
        final Calendar c = Calendar.getInstance();
        int hour = c.get(Calendar.HOUR_OF_DAY);
        int minute = c.get(Calendar.MINUTE);


        // Create a new instance of TimePickerDialog and return it
        return new TimePickerDialog(getActivity(), this, hour, minute,
                DateFormat.is24HourFormat(getActivity()));
    }

    public void onTimeSet(TimePicker view, int hourOfDay, int minute) {

        hourSet = hourOfDay;
        minuteSet = minute;

        System.out.println("HOUR IS HOUR IS " + hourSet);
        System.out.println("MINUTE IS MINUTE IS" + minuteSet);
        System.out.println("View is hello hello hello" + this.getActivity());


            TextView txt = (TextView) (this.getActivity().findViewById(R.id.start1_text));
            if (minuteSet == 0) {
                txt.setText(hourSet + ":" + minuteSet + "0");
            } else {
                txt.setText(hourSet + ":" + minuteSet);
            }
            TextView txt2 = (TextView) (this.getActivity().findViewById(R.id.end1_text));

            if (minuteSet == 0) {
                txt2.setText((hourSet + 2) + ":" + (minuteSet) + "0");
            } else {
                txt2.setText((hourSet + 2) + ":" + (minuteSet));
            }
            Button btn = (Button)(this.getActivity().findViewById(R.id.select1));
            btn.setText("EDIT");

           /* TextView txt = (TextView) (this.getActivity().findViewById(R.id.start2_text));
            txt.setText(hourSet + ":" + minuteSet);
            TextView txt2 = (TextView) (this.getActivity().findViewById(R.id.end2_text));
            txt2.setText((hourSet + 2) + ":" + (minuteSet));*/



    }
}