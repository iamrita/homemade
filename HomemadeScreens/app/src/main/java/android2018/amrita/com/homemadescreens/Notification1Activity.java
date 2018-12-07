package android2018.amrita.com.homemadescreens;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class Notification1Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notification1);
        final Context context = this;

        /*TextView notif = (TextView)findViewById(R.id.notif);

        notif.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(context, MealActivity.class);
                startActivity(intent);
            }
        });*/

        RelativeLayout notif1 = (RelativeLayout)findViewById(R.id.notif1);
        notif1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(context, MealActivity.class);
                startActivity(intent);
            }
        });
    }
}
