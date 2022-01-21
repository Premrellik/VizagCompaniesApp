package com.rellik.vico;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Handler;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

import com.rellik.vico.LoRi.login;

public class SplashScreen extends AppCompatActivity {


    TextView text;
    ImageView image;
    Animation first, second;
    public static int screenTime = 3600;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);


        text = findViewById(R.id.text);
        image = findViewById(R.id.image);

        first = AnimationUtils.loadAnimation(this, R.anim.animation_text);
        second = AnimationUtils.loadAnimation(this, R.anim.animation_logo);

        text.setAnimation(first);
        image.setAnimation(second);

        new Handler().postDelayed(() -> {
            SharedPreferences sharedPreferences = getSharedPreferences(login.PREFS_NAME, 0);
            boolean hasLoggedIn = sharedPreferences.getBoolean("hasLoggedIn", false);
            if (hasLoggedIn) {
                Intent start = new Intent(SplashScreen.this, MainActivity.class);
                startActivity(start);
                finish();

            } else {
                Intent i = new Intent(SplashScreen.this, login.class);
                SplashScreen.this.startActivity(i);
                SplashScreen.this.finish();

            }
        }, screenTime);
    }
}