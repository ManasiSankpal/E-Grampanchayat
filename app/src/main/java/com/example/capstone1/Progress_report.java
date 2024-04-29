package com.example.capstone1;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class Progress_report extends AppCompatActivity {
    EditText e1, e2, e3, e4, e5, e6;
    Button b1;
    RadioGroup r;
    progress myDB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_progress_report);
        setContentView(R.layout.activity_progress_report);
        e1 = findViewById(R.id.editTextTextPersonName);
        e2 = findViewById(R.id.editTextTextPersonName2);
        e3 = findViewById(R.id.editTextTextPersonName3);
        e4 = findViewById(R.id.editTextNumber);
        e5 = findViewById(R.id.editTextTextPersonName5);
        e6 = findViewById(R.id.editTextNumber2);
        b1 = findViewById(R.id.button);
        r=findViewById(R.id.radioid);
        myDB=new progress(this);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String id = e1.getText().toString();
                String activityName = e2.getText().toString();
                String location = e3.getText().toString();
                String period = e4.getText().toString();
                String ActivitydoneBy = e5.getText().toString();
                String ActivityAmount = e6.getText().toString();
                /*int Status = r.getCheckedRadioButtonId();

               if (id.equals("") ||activityName.equals("") || location.equals("") ||period.equals("") || ActivitydoneBy.equals("") || ActivityAmount.equals("")) {
                    Toast.makeText(Progress_report.this, "fill all the fields", Toast.LENGTH_SHORT).show();
                } else {
                    boolean result = myDB.insertData(id, activityName, location, period, ActivitydoneBy, ActivityAmount, Status);

                    if (result==true) {
                        Toast.makeText(Progress_report.this, "Saved Successfully", Toast.LENGTH_SHORT).show();
                    } else {
                        Toast.makeText(Progress_report.this, "Not Saved", Toast.LENGTH_SHORT).show();
                    }
                }*/
                int Status = r.getCheckedRadioButtonId();
                if (Status==2131296643) {
                    String stat = "Completed";

                      if (id.equals("") ||activityName.equals("") || location.equals("") ||period.equals("") || ActivitydoneBy.equals("") || ActivityAmount.equals("")) {
                        Toast.makeText(Progress_report.this, "fill all the fields", Toast.LENGTH_SHORT).show();
                    } else {
                          boolean result = myDB.insertData(id, activityName, location, period, ActivitydoneBy, ActivityAmount, stat);

                          if (result==true) {
                            Toast.makeText(Progress_report.this, "Saved Successfully", Toast.LENGTH_SHORT).show();
                        } else {
                            Toast.makeText(Progress_report.this, "Not Saved", Toast.LENGTH_SHORT).show();
                        }
                    }
                }
                if (Status == 2131296644) {
                    String stat = "Uncompleted";

                    if (id.equals("") ||activityName.equals("") || location.equals("") ||period.equals("") || ActivitydoneBy.equals("") || ActivityAmount.equals("")) {
                        Toast.makeText(Progress_report.this, "fill all the fields", Toast.LENGTH_SHORT).show();
                    } else {
                          boolean result = myDB.insertData(id, activityName, location, period, ActivitydoneBy, ActivityAmount, stat);
                          if (result == true) {
                            Toast.makeText(Progress_report.this, "Saved Successfully", Toast.LENGTH_SHORT).show();
                        } else {
                            Toast.makeText(Progress_report.this, "Not Saved", Toast.LENGTH_SHORT).show();
                        }
                    }
                }
                if (Status == 2131296645) {
                    String stat = "Ongoing";


                    if (id.equals("") ||activityName.equals("") || location.equals("") ||period.equals("") || ActivitydoneBy.equals("") || ActivityAmount.equals("")) {
                        Toast.makeText(Progress_report.this, "fill all the fields", Toast.LENGTH_SHORT).show();
                    } else {
                        boolean result = myDB.insertData(id, activityName, location, period, ActivitydoneBy, ActivityAmount, stat);

                        if (result == true) {
                            Toast.makeText(Progress_report.this, "Saved Successfully", Toast.LENGTH_SHORT).show();
                        } else {
                            Toast.makeText(Progress_report.this, "Not Saved", Toast.LENGTH_SHORT).show();
                        }
                    }
                }

            }
        });
        }
    }

