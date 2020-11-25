package com.aknindustries.currencyconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView textView;
    Button button;
    EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = findViewById(R.id.textView);
        button = findViewById(R.id.button);
        editText = findViewById(R.id.editTextNumber);
        button.setOnClickListener(v -> {
            double amountInDollars = Double.parseDouble(editText.getText().toString());
            double amountInRupees = amountInDollars * 75.6;
            @SuppressLint("DefaultLocale") String displayMessage = "It equals " + String.format("%.2f",amountInRupees) + " rupees!";
            textView.setText(displayMessage);
        });
    }
}