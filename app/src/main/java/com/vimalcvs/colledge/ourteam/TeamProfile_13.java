package com.vimalcvs.colledge.ourteam;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import com.vimalcvs.colledge.R;
/**
 * Created by VIMALCVS on 23.11.2018.
 */
public class TeamProfile_13 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.team_profile_13);


    }
    @Override
    public void onBackPressed() {
        super.onBackPressed();
        overridePendingTransition(R.anim.in_from_left, R.anim.out_to_right);
    }
}
