package com.example.honey;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.Window;
import android.view.WindowManager;

public class SplashScreen extends AppCompatActivity {

    private int time_loading=2000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);
        Window window= getWindow();
        window.setFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS,
                WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS);

        //set Splash
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                // intent to our login activity
                Intent logIn = new Intent(SplashScreen.this, MainActivity.class);
                startActivity(logIn);
                finish();
            }
        },time_loading);
    }
}
