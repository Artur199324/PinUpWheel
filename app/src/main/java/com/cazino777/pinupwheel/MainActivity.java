package com.cazino777.pinupwheel;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.cazino777.pinupwheel.mov.Mov1;
import com.cazino777.pinupwheel.mov.Mov2;
import com.cazino777.pinupwheel.mov.Mov3;
import com.cazino777.pinupwheel.resal.Res1;
import com.cazino777.pinupwheel.resal.Res2;
import com.cazino777.pinupwheel.resal.Res3;

public class MainActivity extends AppCompatActivity {

    ImageView image1, image2, image3, image4, image5, image6, image7, image8, image9;
    Button button,buttonB;
    TextView textViewplus, textViewmin, textViewScor, textViewBet;
    int count = 50;
    int sco = 2000;
    int win = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        buttonB = findViewById(R.id.buttonB);
        buttonB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onBackPressed();
            }
        });
        button = findViewById(R.id.button);
        image1 = findViewById(R.id.image1);
        image2 = findViewById(R.id.image2);
        image3 = findViewById(R.id.image3);
        image4 = findViewById(R.id.image4);
        image5 = findViewById(R.id.image5);
        image6 = findViewById(R.id.image6);
        image7 = findViewById(R.id.image7);
        image8 = findViewById(R.id.image8);
        image9 = findViewById(R.id.image9);
        textViewplus = findViewById(R.id.textViewplus);
        textViewmin = findViewById(R.id.textViewmin);
        textViewScor = findViewById(R.id.textViewScor);
        textViewBet = findViewById(R.id.textViewBet);
        sco = getIntent().getIntExtra("ccc",2000);
        textViewScor.setText(""+sco);
        spin();
        sss();
    }

    public void sss() {
        textViewmin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (count !=50){
                    count -= 50;
                    textViewBet.setText(""+count);
                }
            }
        });

        textViewplus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (count !=200){
                    count += count;
                    textViewBet.setText(""+count);
                }

            }
        });
    }

    int a = 0;
    int b = 0;
    int c = 0;

    public void spin() {
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sco -= count;
                textViewScor.setText("" + sco);
                button.setClickable(false);
                a = 0;
                b = 0;
                c = 0;
                win = 0;
                Mov1 mov1 = new Mov1(image1, image2, image3);
                Mov2 mov2 = new Mov2(image4, image5, image6);
                Mov3 mov3 = new Mov3(image7, image8, image9);
                Handler handler = new Handler();
                handler.post(new Runnable() {
                    @Override
                    public void run() {
                        mov1.move1();
                        a++;
                        if (a != 30) {
                            handler.postDelayed(this::run, 10);
                        }
                    }
                });

                handler.post(new Runnable() {
                    @Override
                    public void run() {
                        mov2.move2();
                        b++;
                        if (b != 45) {
                            handler.postDelayed(this::run, 10);
                        }
                    }
                });

                handler.post(new Runnable() {
                    @Override
                    public void run() {
                        mov3.move3();
                        c++;
                        if (c != 60) {
                            handler.postDelayed(this::run, 10);
                        } else {

                            Res1 res1 = new Res1(image1,image2,image3,count,button);
                            Res2 res2 = new Res2(image4,image5,image6,count,button);
                            Res3 res3 = new Res3(image7,image8,image9,count,button);
                            win += res1.res1();
                            win += res2.res2();
                            win += res3.res3();


                            if (win !=0){
                                Toast toast = Toast.makeText(getApplicationContext(), "You won " + win + " points" , Toast.LENGTH_SHORT);
                                toast.show();
                                sco += win;
                                sco += count;
                                textViewScor.setText("" + sco);
                            }else {
                                Toast toast = Toast.makeText(getApplicationContext(), "You lost"  , Toast.LENGTH_SHORT);
                                toast.show();
                                button.setClickable(true);
                            }

                    }
                    }
                });
            }
        });
    }

    @Override
    public void onBackPressed() {
        startActivity(new Intent(getApplicationContext(),StartActivity.class));
        finishAffinity();
    }
}