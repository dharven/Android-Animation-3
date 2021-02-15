package com.example.spin_o_jay;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    private ImageView jay;
    private Animation rotateanimation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        jay = (ImageView)findViewById(R.id.jayID);
        rotateanimation();

    }

    private void rotateanimation() {
        rotateanimation = AnimationUtils.loadAnimation(this,R.anim.spin_anim);
        jay.startAnimation(rotateanimation);
    }


}
