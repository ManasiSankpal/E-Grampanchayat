package com.example.capstone1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;

public class scheme extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_scheme);

    }
    public void s1(View view){
        Intent browerIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://rdd.maharashtra.gov.in/en/Self-Training-Institutionss"));
        startActivity(browerIntent);
    }
    public void s2(View view){
        Intent browerIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("http://ddugky.gov.in/"));
        startActivity(browerIntent);
    }
    public void s3(View view){
        Intent browerIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.spoctree.com/campaign/home-loan/pmay-clss-scheme/?utm_source=Goog&utm_medium=g&utm_content=71080676319&utm_term=kwd-306872603455&utm_campaign=831660148&feeditemid=&placement=&loc_interest_ms=&loc_physical_ms=1007783&gclid=CjwKCAjw9-KTBhBcEiwAr19ig3cSC46VjclWVScF297-wMC1l_nAtGCLXCoYzkYCmtwCKR2ZXJVlzBoCjdAQAvD_BwE&creative=454402187981&device=m&devicemodel=&matchtype=b&target=&random=9079882020773631292&adposition="));
        startActivity(browerIntent);
    }
    public void s4(View view){
        Intent browerIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("http://mksp.gov.in/"));
        startActivity(browerIntent);
    }
    public void s5(View view){
        Intent browerIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://rgsa.gov.in/"));
        startActivity(browerIntent);
    }
    public void s6(View view){
        Intent browerIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://rurban.gov.in/index.php/public_home/about_us#:~:text=The%20Shyama%20Prasad%20Mukherji%20Rurban%20Mission%20(SPMRM)%20follows%20the%20vision,nature%2C%20thus%20creating%20a%20cluster"));
        startActivity(browerIntent);
    }
}