package com.example.exampleapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public void clickFunction(View view){

        EditText nameEditText = (EditText) findViewById(R.id.nameEditText);

        ImageView catImageView = (ImageView) findViewById(R.id.catImageView);

        Log.i("Info", "Button Pressed");

        Log.i("Values", nameEditText.getText().toString());

        catImageView.setImageResource(R.drawable.cat2);

        Toast.makeText(this, "Hi " + nameEditText.getText().toString(), Toast.LENGTH_SHORT).show();

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
