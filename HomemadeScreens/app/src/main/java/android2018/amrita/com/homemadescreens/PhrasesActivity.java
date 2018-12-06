package android2018.amrita.com.homemadescreens;

import android.content.Context;
import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageButton;

public class PhrasesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_phrases);

        ImageButton back = (ImageButton)findViewById(R.id.back_phrases);
        final Context context = this;

        ImageButton mic = (ImageButton)findViewById(R.id.mic1);
        final MediaPlayer mPlayer = MediaPlayer.create(PhrasesActivity.this, R.raw.lathrop);

        mic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mPlayer.start();
            }
        });




       back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(context, LiveMealActivity.class);
                startActivity(intent);
            }
        });
    }
}
