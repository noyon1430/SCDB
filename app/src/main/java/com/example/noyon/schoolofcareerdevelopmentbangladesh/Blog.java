package com.example.noyon.schoolofcareerdevelopmentbangladesh;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class Blog extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_blog);
        String url= "http://scdbbd.com/blog/";
        WebView blog=(WebView) findViewById(R.id.WebView);

        blog.loadUrl(url);
    }
}
