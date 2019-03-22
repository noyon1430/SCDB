package com.example.noyon.schoolofcareerdevelopmentbangladesh;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
   //ImageButton androidImageButton;

    public Button button1;
    public Button button3;
    public Button button2;
    public Button button4;


    public void aboutus()
    {
        button1 = (Button) findViewById(R.id.button1);
        button1.setOnClickListener(new View.OnClickListener() {
                                       @Override
                                       public void onClick(View view) {

                                               {
                                                   Intent toy =new Intent(MainActivity.this, AboutUs.class);
                                                   startActivity(toy);
                                               }

                                       }
                                   }


        );
    }
    public void servises ()
    {
        button2 = (Button) findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {
                                       @Override
                                       public void onClick(View view) {

                                           {
                                               Intent toy =new Intent(MainActivity.this, OurServises.class);
                                               startActivity(toy);
                                           }

                                       }
                                   }


        );
    }
    public void contactus() {
        button3 = (Button) findViewById(R.id.button3);
        button3.setOnClickListener(new View.OnClickListener() {
                                       @Override
                                       public void onClick(View view) {

                                           {
                                               Intent toy = new Intent(MainActivity.this, ContactUs.class);
                                               startActivity(toy);
                                           }

                                       }
                                   }


        );
    }
    public void findus() {
        button4 = (Button) findViewById(R.id.button4);
        button4.setOnClickListener(new View.OnClickListener() {
                                       @Override
                                       public void onClick(View view) {

                                           {
                                               Intent toy = new Intent(MainActivity.this, MapsActivity.class);
                                               startActivity(toy);
                                           }

                                       }
                                   }


        );
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       aboutus();
       servises();
       contactus();
       findus();

    }
}
