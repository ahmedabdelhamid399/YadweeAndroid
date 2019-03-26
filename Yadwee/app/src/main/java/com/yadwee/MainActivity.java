package com.yadwee;

import android.content.Intent;
import android.os.Build;
import android.os.Handler;
import android.os.Message;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

import java.util.Timer;
import java.util.TimerTask;

public class MainActivity extends AppCompatActivity {

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ImageView logo = findViewById(R.id.applogo);
        logo.setTranslationY(-1000);
        logo.setTranslationX(-1000);
        logo.animate().translationXBy(1000).setDuration(2000);
        logo.animate().translationYBy(1000).setDuration(2000);
        Handler h = new Handler(){
            @Override
            public void handleMessage(Message msg) {

                Intent i = new Intent().setClass(getApplicationContext(),Redirect.class);
                startActivity(i);
                finish();
            }
        };

        h.sendEmptyMessageDelayed(0, 3000); // 1500 is time in miliseconds

    }
}
