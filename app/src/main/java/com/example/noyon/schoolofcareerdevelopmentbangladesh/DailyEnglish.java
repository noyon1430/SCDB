package com.example.noyon.schoolofcareerdevelopmentbangladesh;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class DailyEnglish extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_daily_english);
        String url= "http://englishclub.scdbbd.com/";
        WebView dailyEnglish=(WebView) findViewById(R.id.WebView);

        dailyEnglish.loadUrl(url);
    }
}
