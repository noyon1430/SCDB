package com.example.noyon.schoolofcareerdevelopmentbangladesh;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class OnlineCourses extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_online_courses);
        String url= "http://course.scdbbd.com/";
        WebView onlineCourses=(WebView) findViewById(R.id.WebView);

        onlineCourses.loadUrl(url);
    }
}
