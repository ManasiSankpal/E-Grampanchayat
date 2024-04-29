package com.example.capstone1;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.database.Cursor;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class viewAction extends AppCompatActivity {
EditText e;
Button b;
feedbackdata f;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_view_action);
        e=findViewById(R.id.editText);
        f=new feedbackdata(this);
        b=findViewById(R.id.button3);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String id=e.getText().toString();

                Cursor t = f.getinfo3(id);
                if (t.getCount() == 0) {
                    Toast.makeText(viewAction.this, "No data found", Toast.LENGTH_SHORT).show();
                }

                StringBuffer buffer = new StringBuffer();
                while (t.moveToNext()) {
                    buffer.append("Id: " + t.getString(0) + "\n");
                    buffer.append("Name: " + t.getString(1) + "\n");
                    buffer.append("Address: " + t.getString(2) + "\n");
                    buffer.append("Status: " + t.getString(3) + "\n");
                    buffer.append("Statement: " + t.getString(4) + "\n\n");
                    buffer.append("............................................................."+"\n\n");

                }
                AlertDialog.Builder builder = new AlertDialog.Builder(viewAction.this);
                builder.setCancelable(true);
                builder.setTitle("View Feedback");
                builder.setMessage(buffer.toString());
                builder.show();
            }
        });
    }
}