package com.vimalcvs.colledge;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.ActionBar;
import android.util.Patterns;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.CollapsingToolbarLayout;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;
import com.afollestad.materialdialogs.DialogAction;
import com.afollestad.materialdialogs.MaterialDialog;
import com.github.javiersantos.materialstyleddialogs.MaterialStyledDialog;
import com.github.javiersantos.materialstyleddialogs.enums.Style;
import com.smarteist.autoimageslider.SliderLayout;
import com.smarteist.autoimageslider.SliderView;
import com.vimalcvs.colledge.helper.SpreadsheetWebService;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;

/**
 * Created by VIMALCVS on 25.08.2018.
 */

public class Feedback extends AppCompatActivity {
    SliderLayout sliderLayout;
    private EditText feedbackInputField;
    private EditText nameInputField;
    private EditText emailInputField;
    private Toolbar toolbar;
    private CollapsingToolbarLayout collapsingToolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_feedback);


        collapsingToolbar = (CollapsingToolbarLayout) findViewById(R.id.collapsing);
        collapsingToolbar.setTitle("Your Feedback");

        toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        ActionBar ab = getSupportActionBar();
        ab.setDisplayHomeAsUpEnabled(true);


    feedbackInputField = (EditText) findViewById(R.id.feedback_input);
        nameInputField = (EditText) findViewById(R.id.name_input);
        emailInputField = (EditText) findViewById(R.id.email_input);

        findViewById(R.id.submit_button).setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        validateInput();
                    }
                }
        );

        sliderLayout = findViewById(R.id.imageSlider);
        sliderLayout.setIndicatorAnimation(SliderLayout.Animations.FILL); //set indicator animation by using SliderLayout.Animations. :WORM or THIN_WORM or COLOR or DROP or FILL or NONE or SCALE or SCALE_DOWN or SLIDE and SWAP!!
        sliderLayout.setScrollTimeInSec(1); //set scroll delay in seconds :

        setSliderViews();
    }

    private void setSliderViews() {

        for (int i = 0; i <= 3; i++) {

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
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        if (id == R.id.action_settings) {
            new MaterialStyledDialog.Builder(this)
                    .setTitle("About")
                    .setDescription(R.string.dialog_content)
                    .setStyle(Style.HEADER_WITH_TITLE)
                    .setHeaderColor(R.color.colorPrimary)
                    .setPositiveText("Github")
                    .withDialogAnimation(true)
                    .onPositive(new MaterialDialog.SingleButtonCallback() {
                        @Override
                        public void onClick(@NonNull MaterialDialog dialog, @NonNull DialogAction which) {
                            String url = (getString(R.string.github_url));
                            Intent i = new Intent(Intent.ACTION_VIEW);
                            i.setData(Uri.parse(url));
                            startActivity(i);
                        }
                    })
                    .setNegativeText("Ok")
                    .onNegative(new MaterialDialog.SingleButtonCallback() {
                        @Override
                        public void onClick(@NonNull MaterialDialog dialog, @NonNull DialogAction which) {

                        }
                    })
                    .withDivider(true)
                    .setCancelable(false)
                    .show();
        }
        else  if (id == R.id. action_notifications) {
            new MaterialStyledDialog.Builder(this)
                    .setTitle("About")
                    .setDescription(R.string.dialog_content)
                    .setStyle(Style.HEADER_WITH_TITLE)
                    .setHeaderColor(R.color.colorPrimary)
                    .setPositiveText("Github")
                    .withDialogAnimation(true)
                    .onPositive(new MaterialDialog.SingleButtonCallback() {
                        @Override
                        public void onClick(@NonNull MaterialDialog dialog, @NonNull DialogAction which) {
                            String url = (getString(R.string.github_url));
                            Intent i = new Intent(Intent.ACTION_VIEW);
                            i.setData(Uri.parse(url));
                            startActivity(i);
                        }
                    })
                    .setNegativeText("Ok")
                    .onNegative(new MaterialDialog.SingleButtonCallback() {
                        @Override
                        public void onClick(@NonNull MaterialDialog dialog, @NonNull DialogAction which) {

                        }
                    })
                    .withDivider(true)
                    .setCancelable(false)
                    .show();
        }


        return super.onOptionsItemSelected(item);
    }

    private void validateInput() { // Validate text input

        if (feedbackInputField.getText().toString().trim().length() == 0 && nameInputField.getText().toString().trim().length() == 0 && emailInputField.getText().toString().trim().length() == 0) {
            feedbackInputField.setError("Enter your feedback!");
            nameInputField.setError("Enter your name!");
            emailInputField.setError("Enter your email!");
            Toast.makeText(Feedback.this, "Please fill in the required fields!", Toast.LENGTH_LONG).show();
        } else {
            validateEmail();
        }
    }

    private void validateEmail() {
        if (Patterns.EMAIL_ADDRESS.matcher(emailInputField.getText()).matches())
            sendData();
        else {
            emailInputField.setError("Enter a valid email!");
            Toast.makeText(Feedback.this, "Please fill in a Valid Email Address!", Toast.LENGTH_LONG).show();
        }
    }

    private void sendData() { // Send feedback to Google Spreadsheet if text input is valid

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://docs.google.com/forms/d/e/") // Your spreadsheet URL
                .build();
        final SpreadsheetWebService spreadsheetWebService = retrofit.create(SpreadsheetWebService.class);

        String feedbackInput = feedbackInputField.getText().toString();
        String nameInput = nameInputField.getText().toString();
        String emailInput = emailInputField.getText().toString();

        Call<Void> feedbackCall = spreadsheetWebService.feedbackSend(feedbackInput, nameInput, emailInput);
        feedbackCall.enqueue(new Callback<Void>() {
            @Override
            public void onResponse(Call<Void> call, Response<Void> response) {
                Log.d("XXX", "Submitted. " + response);
                Toast.makeText(Feedback.this,"Your feedback was submitted!",Toast.LENGTH_LONG).show();
                // Clear all fields after submitting
                feedbackInputField.setText("");
                nameInputField.setText("");
                emailInputField.setText("");
            }

            @Override
            public void onFailure(Call<Void> call, Throwable t) {
                Log.e("XXX", "Failed", t);
                Toast.makeText(Feedback.this,"There was an error!",Toast.LENGTH_LONG).show();
            }
        });
    }

}