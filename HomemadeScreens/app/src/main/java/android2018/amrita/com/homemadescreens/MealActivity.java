package android2018.amrita.com.homemadescreens;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TableRow;

public class MealActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_meal);
        TableRow amrita = (TableRow)findViewById(R.id.amrita_row);
        LinearLayout explore = (LinearLayout)findViewById(R.id.explore);
        final Context context = this;

       

        amrita.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(context, ScheduleResponseActivity.class);
                startActivity(intent);
            }
        });
    }


}
