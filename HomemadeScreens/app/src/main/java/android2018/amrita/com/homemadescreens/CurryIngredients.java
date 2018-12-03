package android2018.amrita.com.homemadescreens;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class CurryIngredients extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_curry_ingredients);

        ImageView back = (ImageView)findViewById(R.id.back_ingredients);
        final Context context = this;
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(context, UpcomingActivity.class);
                startActivity(intent);
            }
        });
    }
}
