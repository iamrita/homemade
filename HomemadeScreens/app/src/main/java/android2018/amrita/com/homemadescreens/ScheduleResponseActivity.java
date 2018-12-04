package android2018.amrita.com.homemadescreens;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Spinner;

public class ScheduleResponseActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_schedule_response);
        final Button confirm = (Button)findViewById(R.id.confirm_button);
        final Context context = this;
//        final Spinner spinner1 = (Spinner)findViewById(R.id.spinner1);
//        final Spinner spinner2 = (Spinner)findViewById(R.id.spinner2);
//        final Spinner spinner3 = (Spinner)findViewById(R.id.spinner3);
        //confirm.setEnabled(false);


        confirm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
              /*  if ((!spinner1.getSelectedItem().toString().equals("Select Date")) && (!spinner2.getSelectedItem().toString().equals("Select Start Time")) &&
                        (!spinner3.getSelectedItem().toString().equals("Select End Time"))) {
                    confirm.setEnabled(true);
                }*/
                Intent intent = new Intent(context, DishSelectionActivity.class);
                startActivity(intent);


            }
        });

        ImageButton back = (ImageButton)findViewById(R.id.back);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(context, MealActivity.class);
                startActivity(intent);
            }
        });
    }
}
