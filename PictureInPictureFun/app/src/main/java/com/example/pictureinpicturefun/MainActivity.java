package com.example.pictureinpicturefun;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    public void goPip(View view) {
        enterPictureInPictureMode();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public void onPictureInPictureModeChanged(boolean isInPictureInPictureMode) {
        super.onPictureInPictureModeChanged(isInPictureInPictureMode);

        TextView textView = findViewById(R.id.textView);
        Button pipButton = findViewById(R.id.pipButton);

        if (isInPictureInPictureMode) {
            // GOING INTO PIP
            pipButton.setVisibility(View.INVISIBLE);
            getSupportActionBar().hide();
            textView.setText("$10,403.53");
        } else {
            // GOING OUT OF PIP
            pipButton.setVisibility(View.VISIBLE);
            getSupportActionBar().show();
            textView.setText("Hello World!");
        }

    }
}
