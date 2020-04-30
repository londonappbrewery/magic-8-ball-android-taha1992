package com.londonappbrewery.magiceightball;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final ImageView ball = (ImageView) findViewById(R.id.image_ball);
        Button ASK = (Button) findViewById(R.id.Button_Play);
        final int[] arrayBall = {
                R.drawable.ball1,
                R.drawable.ball2,
                R.drawable.ball3,
                R.drawable.ball4,
                R.drawable.ball5
        };

        ASK.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Random RNG = new Random();
                int N = RNG.nextInt(5);

                ball.setImageResource(arrayBall[N]);
            }
        });






    }
}
