package com.example.capstone1;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Replycom extends AppCompatActivity {
     Button b,b1;
     feedbackdata fb1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_replycom);
        setContentView(R.layout.activity_replycom);
        b=findViewById(R.id.button);
        b1=findViewById(R.id.button1);
        fb1=new feedbackdata(this);

        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Cursor t1= fb1.getinfo();
                if (t1.getCount() == 0) {
                    Toast.makeText(Replycom.this, "No data found", Toast.LENGTH_SHORT).show();
                }
                StringBuffer buffer = new StringBuffer();
                while (t1.moveToNext()) {
                    buffer.append("Id : " + t1.getString(0) + "\n");
                    buffer.append(" Name : " + t1.getString(1) + "\n");
                    buffer.append("Address : " + t1.getString(2) + "\n");
                    buffer.append("Mobile No : " + t1.getString(3) + "\n\n");
                    buffer.append("Complaint : " + t1.getString(4) + "\n\n");
                     }
                AlertDialog.Builder builder = new AlertDialog.Builder(Replycom.this);
                builder.setCancelable(true);
                builder.setTitle("Complaint ");
                builder.setMessage(buffer.toString());
                builder.show();

            }
        });
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Replycom.this,Feedback.class);
                startActivity(intent);
            }
        });
    }
}