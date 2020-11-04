package com.example.hospitalapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

public class animation extends AppCompatActivity
{
    private static int SPASH_SCREEN =4000;
    Animation topAnim,bottomAnim;
    TextView hospital;
    ImageView hospitallogo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animation);

        //Animation
        topAnim = AnimationUtils.loadAnimation(this,R.anim.top_animation);
        bottomAnim = AnimationUtils.loadAnimation(this,R.anim.bottom_animation);

        //Hooks
        hospitallogo = findViewById(R.id.imageView2);
        hospital = findViewById(R.id.textView5);

        hospitallogo.setAnimation(topAnim);
        hospital.setAnimation(bottomAnim);

        new Handler().postDelayed(new Runnable()
        {
            @Override
            public void run()
            {
                Intent intent = new Intent(animation.this, MainActivity.class);
                startActivity(intent);
                finish();
            }
        },SPASH_SCREEN);

    }
}