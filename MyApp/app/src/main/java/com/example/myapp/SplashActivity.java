package com.example.myapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;

import com.google.android.material.snackbar.Snackbar;

public class SplashActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_splash);

        Thread thread = new Thread(){
           public void run(){
               try{
                   sleep(4000);
               }
               catch (Exception e){
                   e.printStackTrace();

               }
               finally{
                   Intent intent = new Intent(SplashActivity.this, MainActivity.class);
                   startActivity(intent);


               }
           }
        };thread.start();
    }

}