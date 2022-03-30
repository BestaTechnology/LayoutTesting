package fasal.haryana.gov.layouttesting.activities;


import android.os.Bundle;
import android.view.Window;

import androidx.appcompat.app.AppCompatActivity;

import fasal.haryana.gov.layouttesting.R;
import fasal.haryana.gov.layouttesting.utils.Constants;

public class TransitionActivity extends AppCompatActivity {

    Constants.TransitionType type;
    String toolbarTitle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        // inside your activity (if you did not enable transitions in your theme)
        // For AppCompat getWindow must be called before calling super.OnCreate
        // Must be called before setContentView
        getWindow().requestFeature(Window.FEATURE_CONTENT_TRANSITIONS);

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_transition);

//        initPage();



        // For overlap between Exiting  MainActivity.java and Entering TransitionActivity.java
    }



}