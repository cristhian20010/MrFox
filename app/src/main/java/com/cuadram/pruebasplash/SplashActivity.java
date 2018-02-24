package com.cuadram.pruebasplash;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

public class SplashActivity extends AppCompatActivity implements Animation.AnimationListener{



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        TextView myTitle = (TextView)findViewById(R.id.Subtitle);
        TextView mySubtitle = (TextView)findViewById(R.id.subtitle);
        ImageView myImage = (ImageView)findViewById(R.id.imageView);


        Animation myanim = AnimationUtils.loadAnimation(this, R.anim.fadein);
        Animation myanim2 = AnimationUtils.loadAnimation(this, R.anim.leftin);

        myImage.startAnimation(myanim);
        myTitle.startAnimation(myanim2);

        myanim2.setAnimationListener(this);
    }

    @Override
    public void onAnimationStart(Animation animation) {


    }

    @Override
    public void onAnimationEnd(Animation animation) {

        Intent intent = new Intent(SplashActivity.this, LoginActivity.class);
        startActivity(intent);
        finish();
    }

    @Override
    public void onAnimationRepeat(Animation animation) {

    }
}
