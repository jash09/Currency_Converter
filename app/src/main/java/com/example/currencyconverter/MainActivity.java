package com.example.currencyconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public void convertCurrency(View view){

        Log.i("Info","Button Pressed");

        EditText editText= (EditText) findViewById(R.id.editText);

        String amountinINR=editText.getText().toString();

        Double amountinINRDouble=Double.parseDouble(amountinINR);

        Double amountinDollar= 1.3*amountinINRDouble;

        String amountInDollarsString = Double.toString(amountinDollar);

        Log.i("Amount in Dollars",amountInDollarsString);

       Toast.makeText(this,"INR" + amountinINR + "is $" + amountInDollarsString,Toast.LENGTH_LONG).show();






    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
