package android2018.amrita.com.homemadescreens;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TableRow;

public class ExploreV2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_explore_v2);
        TableRow row = (TableRow)findViewById(R.id.table_clicked);
        final Context context = this;

        row.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                System.out.println("WADDDDDDDUPPP");
                Intent intent = new Intent(context, profileActivityLeila.class);
                startActivity(intent);
            }
        });


    }
}
