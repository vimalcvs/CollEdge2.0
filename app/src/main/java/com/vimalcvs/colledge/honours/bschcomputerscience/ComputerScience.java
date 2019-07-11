package com.vimalcvs.colledge.honours.bschcomputerscience;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;

import com.smarteist.autoimageslider.SliderLayout;
import com.smarteist.autoimageslider.SliderView;
import com.vimalcvs.colledge.R;   /** * Created by VimalCVS on 22/08/18. */
import com.vimalcvs.colledge.honours.bschcomputerscience.sem1.ComputerScience_SEM1;
import com.vimalcvs.colledge.honours.bschcomputerscience.sem2.ComputerScience_SEM2;
import com.vimalcvs.colledge.honours.bschcomputerscience.sem3.ComputerScience_SEM3;
import com.vimalcvs.colledge.honours.bschcomputerscience.sem4.ComputerScience_SEM4;
import com.vimalcvs.colledge.honours.bschcomputerscience.sem5.ComputerScience_SEM5;
import com.vimalcvs.colledge.honours.bschcomputerscience.sem6.ComputerScience_SEM6;


/**
 * Created by VimalCVS on 22/08/18.
 */
public class ComputerScience extends AppCompatActivity {
    SliderLayout sliderLayout;
    public CardView cardView1, cardView2, cardView3, cardView4, cardView5 ,cardView6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_semester_ui);
        overridePendingTransition(R.anim.right_in, R.anim.left_out);

        cardView1 = (CardView) findViewById(R.id.Semester1);
        cardView2 = (CardView) findViewById(R.id.Semester2);
        cardView3 = (CardView) findViewById(R.id.Semester3);
        cardView4 = (CardView) findViewById(R.id.Semester4);
        cardView5 = (CardView) findViewById(R.id.Semester5);
        cardView6 = (CardView) findViewById(R.id.Semester6);


        cardView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(ComputerScience.this,ComputerScience_SEM1.class);
                startActivity(myIntent);
                overridePendingTransition(R.anim.right_in, R.anim.left_out);
            }
        });

        cardView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(ComputerScience.this, ComputerScience_SEM2.class);
                startActivity(myIntent);
                overridePendingTransition(R.anim.right_in, R.anim.left_out);
            }
        });

        cardView3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(ComputerScience.this, ComputerScience_SEM3.class);
                startActivity(myIntent);
                overridePendingTransition(R.anim.right_in, R.anim.left_out);
            }
        });
        cardView4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(ComputerScience.this,  ComputerScience_SEM4.class);
                startActivity(myIntent);
                overridePendingTransition(R.anim.right_in, R.anim.left_out);

            }
        });
        cardView5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(ComputerScience.this, ComputerScience_SEM5.class);
                startActivity(myIntent);
                overridePendingTransition(R.anim.right_in, R.anim.left_out);
            }
        });

        cardView6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(ComputerScience.this, ComputerScience_SEM6.class);
                startActivity(myIntent);
                overridePendingTransition(R.anim.right_in, R.anim.left_out);
            }
        });

        sliderLayout = findViewById(R.id.imageSlider);
        sliderLayout.setIndicatorAnimation(SliderLayout.Animations.FILL); //set indicator animation by using SliderLayout.Animations. :WORM or THIN_WORM or COLOR or DROP or FILL or NONE or SCALE or SCALE_DOWN or SLIDE and SWAP!!
        sliderLayout.setScrollTimeInSec(1); //set scroll delay in seconds :

        setSliderViews();
    }

    private void setSliderViews() {

        for (int i = 0; i <= 4; i++) {

            SliderView sliderView = new SliderView(this);

            switch (i) {
                case 0:                                                 //EDGE LOGO
                    sliderView.setImageUrl("https://raw.githubusercontent.com/vimalcvs/DUCSLectures/master/theedgesquad.png");
                    break;
                case 1:                                                  //AMPITHEATRE
                    sliderView.setImageUrl("https://firebasestorage.googleapis.com/v0/b/colledge-117d3.appspot.com/o/SLIDING%20IMAGES%2FAMPITHEATRE.jpeg?alt=media&token=8e2d7270-81c5-439f-b5f7-3708dd2f4ecd");
                    break;
                case 2:                                                 //CORRIDOR
                    sliderView.setImageUrl("https://cvscollege.files.wordpress.com/2016/11/cvs-college-image-11.jpg");
                    break;
                case 3:                                                  //BUSHES
                    sliderView.setImageUrl("https://firebasestorage.googleapis.com/v0/b/colledge-117d3.appspot.com/o/SLIDING%20IMAGES%2FBUSHES.jpeg?alt=media&token=cd14b648-be3e-4fc1-8288-a89a54d50f7e");
                    break;
                case 4:                                                  //CVS
                    sliderView.setImageUrl("https://firebasestorage.googleapis.com/v0/b/colledge-117d3.appspot.com/o/SLIDING%20IMAGES%2FCVS.jpeg?alt=media&token=5db388c5-14ac-4fef-b6c7-525be4914111");
                    break;
            }
            //at last add this view in your layout :
            sliderLayout.addSliderView(sliderView);
        }
    }
    @Override
    public void onBackPressed() {
        super.onBackPressed();
        overridePendingTransition(R.anim.in_from_left, R.anim.out_to_right);
    }
}
