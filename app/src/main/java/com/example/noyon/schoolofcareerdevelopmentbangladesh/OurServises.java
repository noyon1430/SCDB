package com.example.noyon.schoolofcareerdevelopmentbangladesh;

import android.content.ContentValues;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class OurServises extends AppCompatActivity {

    public Button buttonC1;
    public Button buttonC2;
    public Button buttonC3;
    public Button buttonC4;
    public Button buttonC5;
    public Button buttonC6;
    public void cv()
    {
        buttonC1 = (Button) findViewById(R.id.buttons1);
        buttonC1.setOnClickListener(new View.OnClickListener() {
                                        @Override
                                        public void onClick(View view) {

                                            {
                                                Intent toy =new Intent(OurServises.this, CV.class);
                                                startActivity(toy);
                                            }

                                        }
                                    }


        );
    }

    public void dailyEnglish()
    {
        buttonC2 = (Button) findViewById(R.id.buttons2);
        buttonC2.setOnClickListener(new View.OnClickListener() {
                                        @Override
                                        public void onClick(View view) {

                                            {
                                                Intent toy =new Intent(OurServises.this, DailyEnglish.class);
                                                startActivity(toy);
                                            }

                                        }
                                    }


        );
    }
    public void onlineCourses()
    {
        buttonC3 = (Button) findViewById(R.id.buttons3);
        buttonC3.setOnClickListener(new View.OnClickListener() {
                                        @Override
                                        public void onClick(View view) {

                                            {
                                                Intent toy =new Intent(OurServises.this, OnlineCourses.class);
                                                startActivity(toy);
                                            }

                                        }
                                    }


        );
    }
    public void eLibrary()
    {
        buttonC4 = (Button) findViewById(R.id.buttons4);
        buttonC4.setOnClickListener(new View.OnClickListener() {
                                        @Override
                                        public void onClick(View view) {

                                            {
                                                Intent toy =new Intent(OurServises.this, ELibrary.class);
                                                startActivity(toy);
                                            }

                                        }
                                    }


        );
    }
    public void modelTest()
    {
        buttonC5 = (Button) findViewById(R.id.buttons5);
        buttonC5.setOnClickListener(new View.OnClickListener() {
                                        @Override
                                        public void onClick(View view) {

                                            {
                                                Intent toy =new Intent(OurServises.this, ModelTest.class);
                                                startActivity(toy);
                                            }

                                        }
                                    }


        );
    }
    public void blog()
    {
        buttonC6 = (Button) findViewById(R.id.buttons6);
        buttonC6.setOnClickListener(new View.OnClickListener() {
                                        @Override
                                        public void onClick(View view) {

                                            {
                                                Intent toy =new Intent(OurServises.this, Blog.class);
                                                startActivity(toy);
                                            }

                                        }
                                    }


        );
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_our_servises);
        cv();
        dailyEnglish();
        onlineCourses();
        eLibrary();
        modelTest();
        blog();
    }
}
