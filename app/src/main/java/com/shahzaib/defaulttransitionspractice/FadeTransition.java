package com.shahzaib.defaulttransitionspractice;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.transition.Fade;
import android.transition.TransitionManager;
import android.view.View;
import android.view.ViewGroup;

public class FadeTransition extends AppCompatActivity {

    View myView;
    ViewGroup root_fade_activity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fade_transition);
        root_fade_activity = findViewById(R.id.root_fade_activity);
        myView = findViewById(R.id.myView);

    }


    public void startFadeAnimation(View view) {
        Fade fade = new Fade();
        fade.setDuration(2000);

        TransitionManager.beginDelayedTransition(root_fade_activity, fade);
        makeLayoutChanges();
    }

    private void makeLayoutChanges() {
        if (isViewVisible(myView)) {
            myView.setVisibility(View.INVISIBLE);
        } else {
            myView.setVisibility(View.VISIBLE);
        }
    }
    private boolean isViewVisible(View myView) {
        return myView.getVisibility() == View.VISIBLE;
    }


}
