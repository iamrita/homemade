package android2018.amrita.com.homemadescreens;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.RadioButton;
import android.widget.Spinner;

public class ScheduleResponseActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_schedule_response);
        final Button confirm = (Button)findViewById(R.id.confirm_button);
        final Button decline = (Button)findViewById(R.id.decline);
        confirm.setBackgroundColor(Color.parseColor("#808080"));
        confirm.setEnabled(false);
        final Context context = this;

        RadioButton btn1 = (RadioButton)findViewById(R.id.btn1);
        RadioButton btn2 = (RadioButton)findViewById(R.id.btn2);
        RadioButton btn3 = (RadioButton)findViewById(R.id.btn3);
        RadioButton btn4 = (RadioButton)findViewById(R.id.btn4);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                confirm.setEnabled(true);
                confirm.setBackgroundColor(Color.parseColor("#ff008000"));


            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                confirm.setEnabled(true);
                confirm.setBackgroundColor(Color.parseColor("#ff008000"));
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                confirm.setEnabled(true);
                confirm.setBackgroundColor(Color.parseColor("#ff008000"));

            }
        });

        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                confirm.setEnabled(true);
                confirm.setBackgroundColor(Color.parseColor("#ff008000"));

            }
        });


        decline.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(context, MealActivity.class);
                startActivity(intent);
            }
        });


        confirm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
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
