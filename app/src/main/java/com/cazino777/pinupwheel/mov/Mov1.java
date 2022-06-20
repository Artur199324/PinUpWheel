package com.cazino777.pinupwheel.mov;

import android.widget.ImageView;

import com.cazino777.pinupwheel.R;

import java.util.Random;

public class Mov1 {
    ImageView imageView1;
    ImageView imageView2;
    ImageView imageView3;
    Random random;

    public Mov1(ImageView imageView1, ImageView imageView2, ImageView imageView3) {
        this.imageView1 = imageView1;
        this.imageView2 = imageView2;
        this.imageView3 = imageView3;
        random = new Random();
    }

    public void move1(){
        int a = random.nextInt(5);
        int b = random.nextInt(5);
        int c = random.nextInt(5);

        if (a == 0){
            imageView1.setImageResource(R.drawable.n1);
            imageView1.setTag(1);
        }

        if (a == 1){
            imageView1.setImageResource(R.drawable.n2);
            imageView1.setTag(2);
        }
        if (a == 2){
            imageView1.setImageResource(R.drawable.n3);
            imageView1.setTag(3);
        }
        if (a == 3){
            imageView1.setImageResource(R.drawable.n4);
            imageView1.setTag(4);
        }
        if (a == 4){
            imageView1.setImageResource(R.drawable.n5);
            imageView1.setTag(5);
        }


        if (b == 0){
            imageView2.setImageResource(R.drawable.n1);
            imageView2.setTag(1);
        }

        if (b == 1){
            imageView2.setImageResource(R.drawable.n2);
            imageView2.setTag(2);
        }
        if (b == 2){
            imageView2.setImageResource(R.drawable.n3);
            imageView2.setTag(3);
        }
        if (b == 3){
            imageView2.setImageResource(R.drawable.n4);
            imageView2.setTag(4);
        }
        if (b == 4){
            imageView2.setImageResource(R.drawable.n5);
            imageView2.setTag(5);
        }


        if (c == 0){
            imageView3.setImageResource(R.drawable.n1);
            imageView3.setTag(1);
        }

        if (c == 1){
            imageView3.setImageResource(R.drawable.n2);
            imageView3.setTag(2);
        }
        if (c == 2){
            imageView3.setImageResource(R.drawable.n3);
            imageView3.setTag(3);
        }
        if (c == 3){
            imageView3.setImageResource(R.drawable.n4);
            imageView3.setTag(4);
        }
        if (c == 4){
            imageView3.setImageResource(R.drawable.n5);
            imageView3.setTag(5);
        }


    }
}
