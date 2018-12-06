package android2018.amrita.com.homemadescreens;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TableRow;

public class MealConfirmedActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_meal_confirmed);

        TableRow amrita_confirmed = (TableRow)findViewById(R.id.amrita_row);
        LinearLayout explore = (LinearLayout)findViewById(R.id.explore);
        final Context context = this;

        amrita_confirmed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(context, UpcomingActivity.class);
                startActivity(intent);
            }
        });

        explore.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(context, ExploreActivity.class);
                startActivity(intent);
            }
        });

        Button mealTime = (Button)findViewById(R.id.mealTime);
        mealTime.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(context, Notification2Activity.class);
                startActivity(intent);
            }
        });

    }
}
