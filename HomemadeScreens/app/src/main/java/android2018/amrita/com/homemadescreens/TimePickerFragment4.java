package android2018.amrita.com.homemadescreens;

import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.app.TimePickerDialog;
import android.os.Bundle;
import android.text.format.DateFormat;
import android.widget.Button;
import android.widget.TextView;
import android.widget.TimePicker;

import java.util.Calendar;

public class TimePickerFragment4 extends DialogFragment
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
        AlertDialog.Builder alertDialog = new AlertDialog.Builder(this.getActivity());

        TextView txt = (TextView) (this.getActivity().findViewById(R.id.start4_text));
        TextView txt2 = (TextView) (this.getActivity().findViewById(R.id.end4_text));
        Button btn = (Button)(this.getActivity().findViewById(R.id.select4));

        if (hourSet == 20) {

            alertDialog.setMessage("Your meal with Sigalit M. conflicts with this time. Please select another time.");
            alertDialog.show();
            txt.setText("Select a time");
            txt2.setText("--");
            btn.setText("SELECT");

        } else {
            if (minuteSet == 0) {
                txt.setText(hourSet + ":" + minuteSet + "0");
            } else {
                txt.setText(hourSet + ":" + minuteSet);
            }
        }

        if (minuteSet == 0) {
            txt2.setText((hourSet + 2) + ":" + (minuteSet) + "0");
        } else {
            txt2.setText((hourSet + 2) + ":" + (minuteSet));
        }
        btn.setText("EDIT");




    }
}