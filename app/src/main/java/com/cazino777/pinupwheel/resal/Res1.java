package com.cazino777.pinupwheel.resal;

import android.util.Log;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.LinearInterpolator;
import android.widget.Button;
import android.widget.ImageView;

public class Res1 {

    ImageView imageView1;
    ImageView imageView2;
    ImageView imageView3;
    int counter;
    int fff;
    Button button;

    public Res1(ImageView imageView1, ImageView imageView2, ImageView imageView3, int counter, Button button) {
        this.imageView1 = imageView1;
        this.imageView2 = imageView2;
        this.imageView3 = imageView3;
        this.counter = counter;
        this.button = button;
    }

    public int res1() {

        Animation animation = new AlphaAnimation(1, 0);
        animation.setDuration(1000);
        animation.setInterpolator(new LinearInterpolator());
        animation.setRepeatCount(2);
        animation.setRepeatMode(Animation.REVERSE);
        animation.setAnimationListener(new Animation.AnimationListener() {
            @Override
            public void onAnimationStart(Animation animation) {

            }

            @Override
            public void onAnimationEnd(Animation animation) {
                button.setClickable(true);
            }

            @Override
            public void onAnimationRepeat(Animation animation) {

            }
        });

        if (imageView1.getTag() == imageView2.getTag() && imageView3.getTag() == imageView1.getTag()) {
            counter += counter;
            fff = counter;
            imageView1.startAnimation(animation);
            imageView2.startAnimation(animation);
            imageView3.startAnimation(animation);
        } else if (imageView2.getTag() == imageView1.getTag()) {
            Log.d("weq", "rr");
            fff = counter/2;
            imageView1.startAnimation(animation);
            imageView2.startAnimation(animation);
        } else if (imageView2.getTag() == imageView3.getTag()) {
            Log.d("weq", "rr");
            fff = counter/2;
            imageView2.startAnimation(animation);
            imageView3.startAnimation(animation);
        }
        Log.d("www", fff + "");
        return fff;
    }
}
