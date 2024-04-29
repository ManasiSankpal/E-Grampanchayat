package com.example.capstone1;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

public class user extends AppCompatActivity {


    ImageView img,img1,img3,img4,img5,img6;
    Achievementdata ac;
    Decisiondata d;
    progress pr;
    profiledata prf;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_home);
        setContentView(R.layout.activity_user);
        img = findViewById(R.id.image2);
        img1=findViewById(R.id.image7);
        img3=findViewById(R.id.image4);
        img4=findViewById(R.id.image6);
        img5=findViewById(R.id.image3);
        img6=findViewById(R.id.image5);
        ac = new Achievementdata(this);
        pr = new progress(this);
        d = new Decisiondata(this);
        prf= new profiledata(this);
        img1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Cursor t = ac.getinfo();
                if (t.getCount() == 0) {
                    Toast.makeText(user.this, "No data found", Toast.LENGTH_SHORT).show();
                }

                StringBuffer buffer = new StringBuffer();
                while (t.moveToNext()) {
                    buffer.append("Id: " + t.getString(0) + "\n");
                    buffer.append("Date: " + t.getString(1) + "\n");
                    buffer.append("Achievement : " + t.getString(2) + "\n\n");
                    buffer.append("............................................................."+"\n\n");


                }
                AlertDialog.Builder builder = new AlertDialog.Builder(user.this);
                builder.setCancelable(true);
                builder.setTitle("Achievements");
                builder.setMessage(buffer.toString());
                builder.show();
            }
        });
        img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Cursor t = pr.getinfo1();
                if (t.getCount() == 0) {
                    Toast.makeText(user.this, "No data found", Toast.LENGTH_SHORT).show();
                }

                StringBuffer buffer = new StringBuffer();
                while (t.moveToNext()) {
                    buffer.append("Id :  " + t.getString(0) + "\n");
                    buffer.append("ActivityName :  " + t.getString(1) + "\n");
                    buffer.append("Address :  " + t.getString(2) + "\n");
                    buffer.append("period :  " + t.getString(3) + "\n");
                    buffer.append("Activitydoneby :  " + t.getString(4) + "\n");
                    buffer.append("TotalAmount :  " + t.getString(5) + "\n");
                    buffer.append( "Status :  "+ t.getString(6) + "\n\n");
                    buffer.append("............................................................."+"\n\n");


                }
                AlertDialog.Builder builder = new AlertDialog.Builder(user.this);
                builder.setCancelable(true);
                builder.setTitle("Progress Report \n\n");
                builder.setMessage(buffer.toString());
                builder.show();
            }
        });
        img3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Cursor t = d.getinfo2();
                if (t.getCount() == 0) {
                    Toast.makeText(user.this, "No data found", Toast.LENGTH_SHORT).show();
                }

                StringBuffer buffer = new StringBuffer();
                while (t.moveToNext()) {

                    buffer.append("Date :  " + t.getString(0) + "\n");
                    buffer.append("Decisions Taken :  " + t.getString(1) + "\n\n");
                    buffer.append("............................................................."+"\n\n");
                }
                AlertDialog.Builder builder = new AlertDialog.Builder(user.this);
                builder.setCancelable(true);
                builder.setTitle("decision");
                builder.setMessage(buffer.toString());
                builder.show();
            }
        });
       img4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(user.this,ucomp.class);
                startActivity(i);
            }
        });
       img5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Cursor t1= prf.get1();
                if (t1.getCount() == 0) {
                    Toast.makeText(user.this, "No data found", Toast.LENGTH_SHORT).show();
                }
                StringBuffer buffer = new StringBuffer();
                while (t1.moveToNext()) {
                    buffer.append("Villege : " + t1.getString(0) + "\n");
                    buffer.append("Sarpanch Name : " + t1.getString(1) + "\n");
                    buffer.append("Mobile No : " + t1.getString(2) + "\n");
                    buffer.append("Address : " + t1.getString(3) + "\n\n");
                    buffer.append("............................................................."+"\n\n");
                    buffer.append("Secretory"+"\n");
                    buffer.append("Name : " + t1.getString(4) + "\n");
                    buffer.append("Mobile No : " + t1.getString(5) + "\n");
                    buffer.append("Address : " + t1.getString(6) + "\n");
                }
                AlertDialog.Builder builder = new AlertDialog.Builder(user.this);
                builder.setCancelable(true);
                builder.setTitle("Panchayat Profile ");
                builder.setMessage(buffer.toString());
                builder.show();
            }
        });
       img6.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               Intent intent=new Intent(user.this,scheme.class);
               startActivity(intent);
           }
       });
    }
}
