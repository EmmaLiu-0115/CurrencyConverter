package com.example.currencyconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    public void clickFunction (View view){

        EditText myTextField = (EditText)findViewById(R.id.editText);

        //Toast.makeText(MainActivity.this, myTextField.getText().toString(), Toast.LENGTH_LONG).show();
        //Log.i("info", "Button pressed");
        String s = myTextField.getText().toString();
        goToActivity2(s);
    }
    public void goToActivity2(String s){
        Intent intent = new Intent(this, pounds.class);
        intent.putExtra("message",s);
        startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
