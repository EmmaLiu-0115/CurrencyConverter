package com.example.currencyconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class pounds extends AppCompatActivity {
    TextView textView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pounds);

        textView = (TextView) findViewById(R.id.textView3);
        Intent intent = getIntent();
        String str = intent.getStringExtra("message");
        double pou = Double.parseDouble(str) * 0.77;

        textView.setText("pounds "+ pou);

    }
}
