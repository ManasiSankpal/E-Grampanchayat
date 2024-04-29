package com.example.capstone1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.Toast;

public class Profile extends AppCompatActivity {
    EditText e1, e2, e3, e4, e5, e6,e7;
    Button b1;
    profiledata myDB;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_profile);
        setContentView(R.layout.activity_profile);
        e1 = findViewById(R.id.editTextTextPersonName11);
        e2 = findViewById(R.id.editTextTextPersonName12);
        e3 = findViewById(R.id.editTextTextPersonName13);
        e4 = findViewById(R.id.editTextTextMultiLine3);
        e5 = findViewById(R.id.editTextTextPersonName15);
        e6 = findViewById(R.id.editTextTextPersonName16);
        e7= findViewById(R.id.editTextTextMultiLine2);
        b1 = findViewById(R.id.button7);
        myDB=new profiledata(this);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String villageName= e1.getText().toString();
                String sarapanchName = e2.getText().toString();
                String mobile = e3.getText().toString();
                String addr= e4.getText().toString();
                String Sname = e5.getText().toString();
                String Smobile = e6.getText().toString();
                String Saddr = e7.getText().toString();
                 if (villageName.equals("") || sarapanchName.equals("") || mobile.equals("")||addr.equals("")||Sname.equals("")||Smobile.equals("")||Saddr.equals("")) {
                    Toast.makeText(Profile.this, "fill all the fields", Toast.LENGTH_SHORT).show();
                } else {
                     boolean result = myDB.insertData4(villageName, sarapanchName,mobile,addr,Sname,Smobile,Saddr);


                     if (result == true) {
                        Toast.makeText(Profile.this, "Saved Successfully", Toast.LENGTH_SHORT).show();
                    } else {
                        Toast.makeText(Profile.this, "Not Saved", Toast.LENGTH_SHORT).show();
                    }
                }


            }
        });

    }
}