package com.vimalcvs.colledge;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
/**
 * Created by VimalCVS on 24/11/18.
 */
public class TheEdgeSquad extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.aboutus_education);

        ImageView whatsapp =(ImageView) findViewById(R.id.id_whatsapp);
        ImageView facebook =(ImageView) findViewById(R.id.id_facebook);
        ImageView instagram =(ImageView) findViewById(R.id.id_instagram);

        //whatsapp link

        whatsapp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String whatsapp = "http://www.whatsapp.com";
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(whatsapp));
                startActivity(i);
            }
        });

        //facebook link

        facebook.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String facebook = "http://www.facebook.com";
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(facebook));
                startActivity(i);
            }
        });

         //instagram link

        instagram.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String instagram = "http://www.instagram.com";
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(instagram));
                startActivity(i);
            }
        });

    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        overridePendingTransition(R.anim.in_from_left, R.anim.out_to_right);
    }
}
