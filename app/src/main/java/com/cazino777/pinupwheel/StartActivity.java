package com.cazino777.pinupwheel;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import java.util.Random;

public class StartActivity extends AppCompatActivity {

    ImageView imageView6,imageView7,imageView8,imageView9;
    TextView textView, textView2,textView3,textView4;
    Button button2,button3,button4;
    int count = 0;

    @Override
    public void onBackPressed() {
        button2.setVisibility(View.VISIBLE);
        button4.setVisibility(View.VISIBLE);
        button3.setVisibility(View.INVISIBLE);
        imageView6.setVisibility(View.INVISIBLE);
        imageView7.setVisibility(View.INVISIBLE);
        imageView8.setVisibility(View.INVISIBLE);
        imageView9.setVisibility(View.INVISIBLE);
    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);
        imageView6 = findViewById(R.id.imageView6);
        imageView7 = findViewById(R.id.imageView7);
        imageView8 = findViewById(R.id.imageView8);
        imageView9 = findViewById(R.id.imageView9);
        button2= findViewById(R.id.button2);
        textView = findViewById(R.id.textView);
        textView2 = findViewById(R.id.textView2);
        textView3 = findViewById(R.id.textView3);
        textView4 = findViewById(R.id.textView4);
        button3 = findViewById(R.id.button3);
        button4 = findViewById(R.id.button4);
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finishAffinity();
            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                button2.setVisibility(View.VISIBLE);
                button4.setVisibility(View.VISIBLE);
                button3.setVisibility(View.INVISIBLE);
                imageView6.setVisibility(View.INVISIBLE);
                imageView7.setVisibility(View.INVISIBLE);
                imageView8.setVisibility(View.INVISIBLE);
                imageView9.setVisibility(View.INVISIBLE);
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                button2.setVisibility(View.INVISIBLE);
                button4.setVisibility(View.INVISIBLE);
                button3.setVisibility(View.VISIBLE);
                imageView6.setVisibility(View.VISIBLE);
                imageView7.setVisibility(View.VISIBLE);
                imageView8.setVisibility(View.VISIBLE);
                imageView9.setVisibility(View.VISIBLE);
            }
        });

        imageView6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                jjj(textView);
                imageView6.setClickable(false);
                imageView7.setClickable(false);
                imageView8.setClickable(false);
                imageView9.setClickable(false);
            }
        });

        imageView7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                jjj(textView2);
                imageView6.setClickable(false);
                imageView7.setClickable(false);
                imageView8.setClickable(false);
                imageView9.setClickable(false);
            }
        });

        imageView8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                jjj(textView3);
                imageView6.setClickable(false);
                imageView7.setClickable(false);
                imageView8.setClickable(false);
                imageView9.setClickable(false);
            }
        });

        imageView9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                jjj(textView4);
                imageView6.setClickable(false);
                imageView7.setClickable(false);
                imageView8.setClickable(false);
                imageView9.setClickable(false);
            }
        });

    }

    public void jjj(TextView textView){

        Random random = new Random();
        switch (random.nextInt(4)){
            case 0 :
                count = 1000;
                textView.setText(count+"");
                textView.setVisibility(View.VISIBLE);
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        Intent intent = new Intent(getApplicationContext(),MainActivity.class);
                        intent.putExtra("ccc",count);
                        startActivity(intent);
                        finishAffinity();
                    }
                },1000);
                break;
            case 1 :
                count = 2000;
                textView.setText(count+"");
                textView.setVisibility(View.VISIBLE);
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        Intent intent = new Intent(getApplicationContext(),MainActivity.class);
                        intent.putExtra("ccc",count);
                        startActivity(intent);
                        finishAffinity();
                    }
                },1000);
                break;
            case 2 :
                count = 3000;
                textView.setText(count+"");
                textView.setVisibility(View.VISIBLE);
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        Intent intent = new Intent(getApplicationContext(),MainActivity.class);
                        intent.putExtra("ccc",count);
                        startActivity(intent);
                        finishAffinity();
                    }
                },1000);
                break;
            case 3 :
                count = 4000;
                textView.setText(count+"");
                textView.setVisibility(View.VISIBLE);
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        Intent intent = new Intent(getApplicationContext(),MainActivity.class);
                        intent.putExtra("ccc",count);
                        startActivity(intent);
                        finishAffinity();
                    }
                },1000);
                break;
        }

    }
}
