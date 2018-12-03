package android2018.amrita.com.homemadescreens;

import android.content.Context;
import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;

public class profileActivityLeila extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
        Button schedule = (Button)findViewById(R.id.schedule_button);
        final Context context = this;

        schedule.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(context, ScheduleActivity.class);
                startActivity(intent);
            }
        });

        ImageButton back = (ImageButton)findViewById(R.id.backButton);
        final Context context2 = this;
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent2 = new Intent(context, ExploreV2Activity.class);
                startActivity(intent2);

            }
        });

        ImageView lomilomi = (ImageView)findViewById(R.id.lomilomi);
        ImageView shrimp = (ImageView)findViewById(R.id.shrimp);
        ImageView sliders = (ImageView)findViewById(R.id.sliders);

        lomilomi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(context, Ingredients4Activity.class);
                startActivity(intent);
            }
        });


        shrimp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(context, Ingredients6Activity.class);
                startActivity(intent);
            }
        });


        sliders.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(context, Ingredients5Activity.class);
                startActivity(intent);
            }
        });



    }

}
