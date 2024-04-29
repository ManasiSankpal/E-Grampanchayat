package com.example.capstone1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.ImageView;

public class home extends AppCompatActivity {
ImageView img1,img2,img3,img4,img5,img6;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_home);
        img1=findViewById(R.id.image2);
        img2=findViewById(R.id.image3);
        img3=findViewById(R.id.image4);
        //img4=findViewById(R.id.image5);
        img5=findViewById(R.id.image6);
        img6=findViewById(R.id.image7);
        img1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(home.this,Progress_report.class);
                startActivity(intent);
            }
        });

        img2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(home.this,Profile.class);
                startActivity(intent);
            }
        });

        img3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(home.this,Decision.class);
                startActivity(intent);
            }
        });

       /* img4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(home.this,DOC_APP.class);
                startActivity(intent);
            }
        });*/

        img5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(home.this,Replycom.class);
                startActivity(intent);
            }
        });


      img6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(home.this, Achieve.class);
                startActivity(intent);
            }
        });

    }
}