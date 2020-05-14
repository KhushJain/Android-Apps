package com.example.animations;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    //boolean bartIsShowing = true;

    public void fade(View view){

        Log.i("Info", "ImageView tapped");

        //ImageView bartImageView = (ImageView) findViewById(R.id.bartImageView);

        //ImageView homerImageView = (ImageView) findViewById(R.id.homerImageView);

        //bartImageView.animate().scaleX(0.5f).scaleY(0.5f).setDuration(1000);

        //bartImageView.animate().rotation(180).alpha(0).setDuration(1000);

        //bartImageView.animate().rotation(180).setDuration(1000);

        //bartImageView.animate().translationYBy(1000).setDuration(2000);

        /*
        if(bartIsShowing) {
            bartIsShowing = false;
            bartImageView.animate().alpha(0).setDuration(2000);
            homerImageView.animate().alpha(1).setDuration(2000);
        } else {
            bartIsShowing = true;
            bartImageView.animate().alpha(1).setDuration(2000);
            homerImageView.animate().alpha(0).setDuration(2000);
        }
        */
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView bartImageView = (ImageView) findViewById(R.id.bartImageView);

        bartImageView.setX(-1000);

        bartImageView.animate().translationXBy(1000).rotation(3600).setDuration(2000);

    }
}
