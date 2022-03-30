package fasal.haryana.gov.layouttesting.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ActivityOptions;
import android.content.Intent;
import android.os.Bundle;
import android.transition.Slide;
import android.util.Pair;
import android.view.Gravity;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.android.material.textfield.TextInputLayout;

import fasal.haryana.gov.layouttesting.R;
import fasal.haryana.gov.layouttesting.utils.Constants;

public class MainActivity extends AppCompatActivity {

    TextView transition,titletv;
    ImageView logoIv;

    EditText name;
    TextInputLayout textInputLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {


        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        transition= findViewById(R.id.transition_tv);
        titletv= findViewById(R.id.title_id);
        logoIv= findViewById(R.id.logo_id);
        name= findViewById(R.id.name);
        textInputLayout= findViewById(R.id.name_inp);

        transition.setOnClickListener(this::onClick);

        setupWindowAnimations();
    }



    private void setupWindowAnimations() {

        // Re-enter transition is executed when returning back to this activity
        Slide slideTransition = new Slide();
        slideTransition.setSlideEdge(Gravity.LEFT); // Use START if using right - to - left locale
        slideTransition.setDuration(1000);

        getWindow().setReenterTransition(slideTransition);  // When MainActivity Re-enter the Screen
        getWindow().setExitTransition(slideTransition);     // When MainActivity Exits the Screen

        // For overlap of Re Entering Activity - MainActivity.java and Exiting TransitionActivity.java
        getWindow().setAllowReturnTransitionOverlap(false);
    }

    public void explodeTransitionByCode(View view) {

        ActivityOptions options = ActivityOptions.makeSceneTransitionAnimation(this);
        Intent i = new Intent(MainActivity.this, TransitionActivity.class);
        i.putExtra(Constants.KEY_ANIM_TYPE, Constants.TransitionType.ExplodeJava);
        i.putExtra(Constants.KEY_TITLE, "Explode By Java");
        startActivity(i, options.toBundle());

    }

//    public void explodeTransitionByXML(View view) {
//
//        ActivityOptions options = ActivityOptions.makeSceneTransitionAnimation(this);
//        Intent i = new Intent(MainActivity.this, TransitionActivity.class);
//        i.putExtra(Constants.KEY_ANIM_TYPE, Constants.TransitionType.ExplodeXML);
//        i.putExtra(Constants.KEY_TITLE, "Explode By Xml");
//        startActivity(i, options.toBundle());
//
//    }

    public void slideTransitionByCode(View view) {

        ActivityOptions options = ActivityOptions.makeSceneTransitionAnimation(this);
        Intent i = new Intent(MainActivity.this, TransitionActivity.class);
        i.putExtra(Constants.KEY_ANIM_TYPE, Constants.TransitionType.SlideJava);
        i.putExtra(Constants.KEY_TITLE, "Slide By Java Code");
        startActivity(i, options.toBundle());
    }

//    public void slideTransitionByXML(View view) {
//
//        ActivityOptions options = ActivityOptions.makeSceneTransitionAnimation(this);
//        Intent i = new Intent(MainActivity.this, TransitionActivity.class);
//        i.putExtra(Constants.KEY_ANIM_TYPE, Constants.TransitionType.SlideXML);
//        i.putExtra(Constants.KEY_TITLE, "Slide By XML");
//        startActivity(i, options.toBundle());
//    }

    public void fadeTransitionByJava(View view) {
        ActivityOptions options = ActivityOptions.makeSceneTransitionAnimation(this);
        Intent i = new Intent(MainActivity.this, TransitionActivity.class);
        i.putExtra(Constants.KEY_ANIM_TYPE, Constants.TransitionType.FadeJava);
        i.putExtra(Constants.KEY_TITLE, "Fade By Java");
        startActivity(i, options.toBundle());

    }

//    public void fadeTransitionByXML(View view) {
//        ActivityOptions options = ActivityOptions.makeSceneTransitionAnimation(this);
//        Intent i = new Intent(MainActivity.this, TransitionActivity.class);
//        i.putExtra(Constants.KEY_ANIM_TYPE, Constants.TransitionType.FadeXML);
//        i.putExtra(Constants.KEY_TITLE, "Fade By XML");
//        startActivity(i, options.toBundle());
//
//    }




    /*use of shared content transition
    * vidoe link :  https://youtu.be/eAooM-F1X9c
    * */
    private void onClick(View view) {
        Pair[] pairs;
        pairs = new Pair[2];
        pairs[0] = new Pair<View, String>(logoIv, "logo_t");
        pairs[1] = new Pair<View, String>(titletv, "title_t");
        ActivityOptions activityOptions = ActivityOptions.makeSceneTransitionAnimation(this, pairs);
        Intent intent = new Intent(MainActivity.this, SecondActivity.class);
        startActivity(intent, activityOptions.toBundle());
    }

    public void checkRippleAnimation(View view) {
    }

    public void sharedElementTransition(View view) {
    }

    public void signupfun(View view) {

        boolean isvalid= true;

        if(name.getText().toString().isEmpty()){
            textInputLayout.setError("Enter Name");
            isvalid=false;
        }else {
            textInputLayout.setErrorEnabled(false);
        }
    }
}