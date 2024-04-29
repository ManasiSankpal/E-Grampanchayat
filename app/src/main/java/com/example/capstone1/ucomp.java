package com.example.capstone1;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.Toast;

public class ucomp extends AppCompatActivity {
Button b1,b2;
feedbackdata fb;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_ucomp);
        b1=findViewById(R.id.button6);
        b2=findViewById(R.id.button5);
        fb=new feedbackdata(this);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(ucomp.this,Complentbox.class);
                startActivity(intent);
            }
        });
       /* b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Cursor t = fb.getinfo2();
                if (t.getCount() == 0) {
                    Toast.makeText(ucomp.this, "No data found", Toast.LENGTH_SHORT).show();
                }

                StringBuffer buffer = new StringBuffer();
                while (t.moveToNext()) {
                    buffer.append("Id" + t.getString(0) + "\n");
                    buffer.append("Name" + t.getString(1) + "\n");
                    buffer.append("Address" + t.getString(2) + "\n");
                    buffer.append("Status" + t.getString(3) + "\n");
                    buffer.append("Statement" + t.getString(4) + "\n\n");
                    buffer.append("............................................................."+"\n\n");

                }
                AlertDialog.Builder builder = new AlertDialog.Builder(ucomp.this);
                builder.setCancelable(true);
                builder.setTitle("View Feedback");
                builder.setMessage(buffer.toString());
                builder.show();
            }
        });*/
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(ucomp.this,viewAction.class);
                startActivity(i);
            }
        });
    }
}