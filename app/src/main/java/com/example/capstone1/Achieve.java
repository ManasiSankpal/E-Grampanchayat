package com.example.capstone1;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Achieve extends AppCompatActivity {
    EditText e,e1,e2;
    Button b,b1;
    Achievementdata ac;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_home);
        setContentView(R.layout.activity_achieve);
        e=findViewById(R.id.editText);
        e1=findViewById(R.id.editText2);
        e2=findViewById(R.id.editText3);
        b=findViewById(R.id.button2);

        ac=new Achievementdata(this);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String id = e.getText().toString();
                String date = e1.getText().toString();
                String achievem = e2.getText().toString();

                if (id.equals("")||date.equals("") || achievem.equals("")) {
                    Toast.makeText(Achieve.this, "fill all the fields", Toast.LENGTH_SHORT).show();
                } else {
                    boolean resu = ac.insertData(id, date, achievem);
                    if (resu == true) {
                        Toast.makeText(Achieve.this, "Inserted Successfully", Toast.LENGTH_SHORT).show();
                    } else {
                        Toast.makeText(Achieve.this, "Not inserted", Toast.LENGTH_SHORT).show();
                    }
                }
            }
        });

    }
}
