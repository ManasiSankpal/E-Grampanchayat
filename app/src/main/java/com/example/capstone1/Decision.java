package com.example.capstone1;

import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class Decision extends AppCompatActivity {
     EditText e1,e2;
     Button b;
    Decisiondata myDB;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_decision);
        e1=findViewById(R.id.editText);
        e2=findViewById(R.id.editText2);
        b=findViewById(R.id.button);
        myDB=new Decisiondata(this);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String date = e1.getText().toString();
                String Deci = e2.getText().toString();
                          if (date.equals("") || Deci.equals("")) {
                    Toast.makeText(Decision.this, "fill all the fields", Toast.LENGTH_SHORT).show();
                }else {
                              boolean resu = myDB.insertData(date, Deci);
                              if (resu == true) {
                    Toast.makeText(Decision.this, "Inserted Successfully", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(Decision.this, "Not inserted", Toast.LENGTH_SHORT).show();
                }
            }
        }
        });

    }
}
