package com.example.capstone1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Complentbox extends AppCompatActivity {
    EditText e,e1,e2,e3,e4;
    Button b;
    feedbackdata f;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_complentbox);

        e=findViewById(R.id.editText17);
        e1=findViewById(R.id.editText3);
        e2=findViewById(R.id.editText);
        e3=findViewById(R.id.editText2);
        e4=findViewById(R.id.editText4);
        b=findViewById(R.id.button4);
        f=new feedbackdata(this);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String Id = e.getText().toString();
                String Name = e1.getText().toString();
                String address = e2.getText().toString();
                String  mob= e3.getText().toString();
                String  complaint= e4.getText().toString();

                if (Name.equals("") || address.equals("")|| mob.equals("")||complaint.equals("")) {
                    Toast.makeText(Complentbox.this, "fill all the fields", Toast.LENGTH_SHORT).show();
                } else {
                    boolean resu = f.insertData1(Id,Name,address,mob,complaint);
                    if (resu == true) {
                        Toast.makeText(Complentbox.this, "Inserted Successfully", Toast.LENGTH_SHORT).show();
                    } else {
                        Toast.makeText(Complentbox.this, "Not inserted", Toast.LENGTH_SHORT).show();
                    }
                }
            }
        });



    }
}