package com.vimalcvs.colledge;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.MapFragment;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
import com.vimalcvs.colledge.ourteam.TeamProfile_1;
import com.vimalcvs.colledge.ourteam.TeamProfile_10;
import com.vimalcvs.colledge.ourteam.TeamProfile_11;
import com.vimalcvs.colledge.ourteam.TeamProfile_12;
import com.vimalcvs.colledge.ourteam.TeamProfile_13;
import com.vimalcvs.colledge.ourteam.TeamProfile_14;
import com.vimalcvs.colledge.ourteam.TeamProfile_15;
import com.vimalcvs.colledge.ourteam.TeamProfile_16;
import com.vimalcvs.colledge.ourteam.TeamProfile_2;
import com.vimalcvs.colledge.ourteam.TeamProfile_3;
import com.vimalcvs.colledge.ourteam.TeamProfile_4;
import com.vimalcvs.colledge.ourteam.TeamProfile_5;
import com.vimalcvs.colledge.ourteam.TeamProfile_6;
import com.vimalcvs.colledge.ourteam.TeamProfile_7;
import com.vimalcvs.colledge.ourteam.TeamProfile_8;
import com.vimalcvs.colledge.ourteam.TeamProfile_9;

/**
 * Created by VIMALCVS on 23.11.2018.
 */
public class AboutSociety extends AppCompatActivity implements OnMapReadyCallback {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_society);


        LinearLayout layout1 =(LinearLayout) findViewById(R.id.profile1);
        LinearLayout layout2 =(LinearLayout) findViewById(R.id.profile2);
        LinearLayout layout3 =(LinearLayout) findViewById(R.id.profile3);
        LinearLayout layout4 =(LinearLayout) findViewById(R.id.profile4);
        LinearLayout layout5 =(LinearLayout) findViewById(R.id.profile5);
        LinearLayout layout6 =(LinearLayout) findViewById(R.id.profile6);
        LinearLayout layout7 =(LinearLayout) findViewById(R.id.profile7);
        LinearLayout layout8 =(LinearLayout) findViewById(R.id.profile8);
        LinearLayout layout9 =(LinearLayout) findViewById(R.id.profile9);
        LinearLayout layout10 =(LinearLayout) findViewById(R.id.profile10);
        LinearLayout layout11 =(LinearLayout) findViewById(R.id.profile11);
        LinearLayout layout12 =(LinearLayout) findViewById(R.id.profile12);
        LinearLayout layout13 =(LinearLayout) findViewById(R.id.profile13);
        LinearLayout layout14 =(LinearLayout) findViewById(R.id.profile14);
        LinearLayout layout15 =(LinearLayout) findViewById(R.id.profile15);
        LinearLayout layout16 =(LinearLayout) findViewById(R.id.profile16);

        layout1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i= new Intent(AboutSociety.this,TeamProfile_1.class);
                i.setFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
                startActivity(i);
            }
        });

        layout2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i= new Intent(AboutSociety.this,TeamProfile_2.class);
                i.setFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
                startActivity(i);
            }
        });

        layout3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i= new Intent(AboutSociety.this,TeamProfile_3.class);
                i.setFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
                startActivity(i);
            }
        });

        layout4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i= new Intent(AboutSociety.this,TeamProfile_4.class);
                i.setFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
                startActivity(i);
            }
        });

        layout5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i= new Intent(AboutSociety.this,TeamProfile_5.class);
                i.setFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
                startActivity(i);
            }
        });

        layout6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i= new Intent(AboutSociety.this,TeamProfile_6.class);
                i.setFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
                startActivity(i);
            }
        });

        layout7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i= new Intent(AboutSociety.this,TeamProfile_7.class);
                i.setFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
                startActivity(i);
            }
        });
        layout8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i= new Intent(AboutSociety.this,TeamProfile_8.class);
                i.setFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
                startActivity(i);
            }
        });

        layout9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i= new Intent(AboutSociety.this,TeamProfile_9.class);
                i.setFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
                startActivity(i);
            }
        });

        layout10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i= new Intent(AboutSociety.this,TeamProfile_10.class);
                i.setFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
                startActivity(i);
            }
        });

        layout11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i= new Intent(AboutSociety.this,TeamProfile_11.class);
                i.setFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
                startActivity(i);
            }
        });

        layout12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i= new Intent(AboutSociety.this,TeamProfile_12.class);
                i.setFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
                startActivity(i);
            }
        });

        layout13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i= new Intent(AboutSociety.this,TeamProfile_13.class);
                i.setFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
                startActivity(i);
            }
        });
        layout14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i= new Intent(AboutSociety.this,TeamProfile_14.class);
                i.setFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
                startActivity(i);
            }
        });
        layout15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i= new Intent(AboutSociety.this,TeamProfile_15.class);
                i.setFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
                startActivity(i);
            }
        });

        layout16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i= new Intent(AboutSociety.this,TeamProfile_16.class);
                i.setFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
                startActivity(i);
            }
        });



        initMap();
    }

    private void initMap() {

        MapFragment mapFragment = (MapFragment) getFragmentManager().findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }

    @Override
    public void onMapReady(GoogleMap map) {

        LatLng latLng = new LatLng(13.05241, 80.25082);
        map.animateCamera(CameraUpdateFactory.newLatLng(latLng));
        map.addMarker(new MarkerOptions().position(latLng).title("Raj Amal"));
        map.setMapType(GoogleMap.MAP_TYPE_TERRAIN);
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        overridePendingTransition(R.anim.in_from_left, R.anim.out_to_right);
    }

}