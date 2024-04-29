package com.example.capstone1;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class Feedback extends AppCompatActivity {
    EditText e, e1, e2, e3;
    Button b;
    feedbackdata f;
    RadioGroup r;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_feedback);
        setContentView(R.layout.activity_feedback);
        e = findViewById(R.id.editTextTextPersonName14);
        e1 = findViewById(R.id.editTextTextPersonName6);
        e2 = findViewById(R.id.editTextTextPersonName9);
        e3 = findViewById(R.id.editTextTextMultiLine);
        b = findViewById(R.id.button);
        r = findViewById(R.id.rd);
        f = new feedbackdata(this);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String id = e.getText().toString();
                String name = e1.getText().toString();
                String address = e2.getText().toString();
                int Status = r.getCheckedRadioButtonId();
                String State = e3.getText().toString();

               /* if (id.equals("") || name.equals("") || address.equals("")||State.equals("")) {
                    Toast.makeText(Feedback.this, "fill all the fields", Toast.LENGTH_SHORT).show();
                } else{
                    boolean r = f.insertData2(id, name, address, Status, State);
                if (r == true) {
                    Toast.makeText(Feedback.this, "Inserted Successfully", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(Feedback.this, "Not inserted", Toast.LENGTH_SHORT).show();
                }
            }*/

                if (Status == 2131296695) {
                    String stat = "Ongoing";
                    Boolean usercheckResult = f.checkId(id);
                    if (id.equals("") || name.equals("") || address.equals("")||State.equals("")||stat.equals("")) {
                        Toast.makeText(Feedback.this, "fill all the fields", Toast.LENGTH_SHORT).show();
                    } else if (usercheckResult == true) {
                        boolean r = f.insertData2(id, name, address, stat, State);

                        if (r == true) {
                            Toast.makeText(Feedback.this, "Inserted Successfully", Toast.LENGTH_SHORT).show();
                        } else {
                            Toast.makeText(Feedback.this, "Not inserted", Toast.LENGTH_SHORT).show();
                        }
                    } else {
                        Toast.makeText(Feedback.this, "Enter valid Id....", Toast.LENGTH_SHORT).show();

                    }

                }

                if (Status == 2131296694) {
                    String stat = "Not Completed";
                    Boolean usercheckResult = f.checkId(id);
                    if (id.equals("") || name.equals("") || address.equals("")||State.equals("")||stat.equals("")) {
                        Toast.makeText(Feedback.this, "fill all the fields", Toast.LENGTH_SHORT).show();
                    } else if (usercheckResult == true) {

                        boolean r = f.insertData2(id, name, address, stat, State);

                        if (r == true) {
                            Toast.makeText(Feedback.this, "Inserted Successfully", Toast.LENGTH_SHORT).show();
                        } else {
                            Toast.makeText(Feedback.this, "Not inserted", Toast.LENGTH_SHORT).show();
                        }
                    } else {
                        Toast.makeText(Feedback.this, "Enter valid Id....", Toast.LENGTH_SHORT).show();

                    }
                }

                if (Status == 2131296262) {
                    String stat = "Completed";
                    Boolean usercheckResult = f.checkId(id);
                    if (id.equals("") || name.equals("") || address.equals("")||State.equals("")||stat.equals("")){
                        Toast.makeText(Feedback.this, "fill all the fields", Toast.LENGTH_SHORT).show();
                    } else if (usercheckResult == true) {
                        boolean r = f.insertData2(id, name, address, stat, State);
                        if (r == true) {
                            Toast.makeText(Feedback.this, "Inserted Successfully", Toast.LENGTH_SHORT).show();
                        } else {
                            Toast.makeText(Feedback.this, "Not inserted", Toast.LENGTH_SHORT).show();
                        }
                    } else {
                        Toast.makeText(Feedback.this, "Enter valid Id....", Toast.LENGTH_SHORT).show();
                    }

                }
            }
        });
    }
}
