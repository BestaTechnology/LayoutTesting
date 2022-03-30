package fasal.haryana.gov.layouttesting.activities;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;

import fasal.haryana.gov.layouttesting.R;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        getWindow().requestFeature(Window.FEATURE_CONTENT_TRANSITIONS);

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Button backbtn = findViewById(R.id.exit_btn);

        backbtn.setOnClickListener(view -> {
            finishAfterTransition();
        });

    }

}