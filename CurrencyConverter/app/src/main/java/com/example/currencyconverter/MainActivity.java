package com.example.currencyconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public void convertCurrency(View view){

        Log.i("Info", "Button Pressed");

        EditText editText = (EditText)findViewById(R.id.editText);

        String amountInDollars = editText.getText().toString();

        double amountInDollarsDouble = Double.parseDouble(amountInDollars);

        double amountInRupeeDouble = amountInDollarsDouble * 76.39;

        String amountInRupee = String.format("%.2f", amountInRupeeDouble);

        Toast.makeText(this, "Rupee: " + amountInRupee, Toast.LENGTH_LONG).show();
        Log.i("Info", amountInRupee);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
