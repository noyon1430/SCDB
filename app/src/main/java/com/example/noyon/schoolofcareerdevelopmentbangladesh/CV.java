package com.example.noyon.schoolofcareerdevelopmentbangladesh;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;

public class CV extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cv);
        String url= "http://scdbbd.com/cv-maker/";
        WebView cv=(WebView) findViewById(R.id.WebView);

        cv.loadUrl(url);
    }
}
