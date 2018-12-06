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
        final MediaPlayer mPlayer = MediaPlayer.create(PhrasesActivity.this, R.raw.namaste);
        final MediaPlayer mPlayer2 = MediaPlayer.create(PhrasesActivity.this, R.raw.second);
        final MediaPlayer mPlayer3 = MediaPlayer.create(PhrasesActivity.this, R.raw.third);
        final MediaPlayer mPlayer4 = MediaPlayer.create(PhrasesActivity.this, R.raw.fourth);
        final MediaPlayer mPlayer5 = MediaPlayer.create(PhrasesActivity.this, R.raw.fifth);



        mic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mPlayer.start();
            }
        });

        ImageButton mic2 = (ImageButton)findViewById(R.id.mic2);
        ImageButton mic3 = (ImageButton)findViewById(R.id.mic3);
        ImageButton mic4 = (ImageButton)findViewById(R.id.mic4);
        ImageButton mic5 = (ImageButton)findViewById(R.id.mic5);

        mic2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mPlayer2.start();
            }
        });
        mic3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mPlayer3.start();
            }
        });
        mic4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mPlayer4.start();
            }
        });

        mic5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mPlayer5.start();
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
