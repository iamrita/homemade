package android2018.amrita.com.homemadescreens;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.media.Image;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.RadioButton;

public class DishSelectionActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dish_selection);

        Button curry = (Button)findViewById(R.id.curry_ingredients);
        Button naan = (Button)findViewById(R.id.naan_ingredients);
        Button sweets = (Button)findViewById(R.id.sweets_ingredients);
        final Button confirm = (Button)findViewById(R.id.confirm_button);
        ImageButton back = (ImageButton)findViewById(R.id.back);
        final Context context = this;

        RadioButton btn1 = (RadioButton)findViewById(R.id.sweets_btn);
        RadioButton btn2 = (RadioButton)findViewById(R.id.naan_btn);
        RadioButton btn3 = (RadioButton)findViewById(R.id.curry_btn);



        confirm.setEnabled(false);
        confirm.setBackgroundColor(Color.parseColor("#808080"));

        curry.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(context, Ingredients2Activity.class);
                startActivity(intent);

            }
        });

        naan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(context, IngredientsActivity.class);
                startActivity(intent);
            }
        });

        sweets.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(context, Ingredients3Activity.class);
                startActivity(intent);
            }
        });

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
            public void onClick(View view)
            {
                confirm.setEnabled(true);
                confirm.setBackgroundColor(Color.parseColor("#ff008000"));


            }
        });

        confirm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(context, ConfirmLocalActivity.class);
                startActivity(intent);
            }
        });

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(context, ScheduleResponseActivity.class);
                startActivity(intent);
            }
        });
    }
}
