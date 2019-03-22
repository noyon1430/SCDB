package com.example.noyon.schoolofcareerdevelopmentbangladesh;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class ModelTest extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_model_test);
        String url= "http://test.scdbbd.com/";
        WebView modelTest=(WebView) findViewById(R.id.WebView);

        modelTest.loadUrl(url);
    }
}
