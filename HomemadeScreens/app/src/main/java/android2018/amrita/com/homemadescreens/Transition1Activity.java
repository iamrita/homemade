package android2018.amrita.com.homemadescreens;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Transition1Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_transition1);

        Button begin = (Button)findViewById(R.id.begin_button);
        final Context context = this;

        begin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(context, ExploreV2Activity.class);
                startActivity(intent);
            }
        });
    }
}
