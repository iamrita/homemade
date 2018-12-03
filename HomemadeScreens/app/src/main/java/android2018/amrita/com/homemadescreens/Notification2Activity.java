package android2018.amrita.com.homemadescreens;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Notification2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notification2);

        TextView notification = (TextView)findViewById(R.id.notif);
        final Context context = this;
        notification.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(context, LiveMealActivity.class);
                startActivity(intent);

            }
        });
    }
}
