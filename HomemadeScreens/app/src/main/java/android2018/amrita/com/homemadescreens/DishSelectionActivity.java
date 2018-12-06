package android2018.amrita.com.homemadescreens;

import android.content.Context;
import android.content.Intent;
import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class DishSelectionActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dish_selection);

        Button curry = (Button)findViewById(R.id.curry_ingredients);
        Button naan = (Button)findViewById(R.id.naan_ingredients);
        Button sweets = (Button)findViewById(R.id.sweets_ingredients);
        Button confirm = (Button)findViewById(R.id.confirm_button);
        ImageButton back = (ImageButton)findViewById(R.id.back);
        final Context context = this;

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
