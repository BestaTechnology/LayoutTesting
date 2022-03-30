package fasal.haryana.gov.layouttesting;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.app.ActivityOptions;
import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.util.Pair;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView transition,titletv;
    ImageView logoIv;


    @Override
    protected void onCreate(Bundle savedInstanceState) {


        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        transition= findViewById(R.id.transition_tv);
        titletv= findViewById(R.id.title_id);
        logoIv= findViewById(R.id.logo_id);

        transition.setOnClickListener(this::onClick);
    }


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
}