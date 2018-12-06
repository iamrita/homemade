package android2018.amrita.com.homemadescreens;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TableRow;
import android.widget.TextView;

import org.w3c.dom.Text;

public class LiveMealActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_live_meal);

        TextView translate = (TextView)findViewById(R.id.live_translate);
        TextView phrases = (TextView)findViewById(R.id.phrases);
        LinearLayout explore = (LinearLayout)findViewById(R.id.explore);
        final Context context = this;

        explore.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(context, ExploreActivity.class);
                startActivity(intent);
            }
        });
        translate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(context, TranslatorActivity.class);
                startActivity(intent);

            }
        });

        phrases.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(context, PhrasesActivity.class);
                startActivity(intent);
            }
        });


    }
}
