package com.example.phonephotoprintsapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {
    int printsEntered;
    double totalPrice;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setLogo(R.mipmap.ic_launcher_foreground);
        getSupportActionBar().setDisplayUseLogoEnabled(true);
        final EditText prints = (EditText) findViewById(R.id.txtPrints);
        final RadioButton rad4x6 = (RadioButton) findViewById(R.id.rad4x6);
        final RadioButton rad5x7 = (RadioButton) findViewById(R.id.rad5x7);
        final RadioButton rad8x10 = (RadioButton) findViewById(R.id.rad8x10);
        final TextView result = (TextView) findViewById(R.id.txtResult);
        Button orderPrints = (Button) findViewById(R.id.btnOrder);
        orderPrints.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                printsEntered = Integer.parseInt(prints.getText().toString());
                DecimalFormat currency = new DecimalFormat("$###,###.##");



                if(rad4x6.isChecked( )) {
                    if (printsEntered <= 50) {
                        totalPrice = printsEntered * 0.19;
                        result.setText("The Order Cost is" + currency.format(totalPrice));
                    } else {
                        Toast.makeText(MainActivity.this,"Prints must be no more than 50", Toast.LENGTH_LONG).show( );
                    }


                }
                if(rad5x7.isChecked( )) {
                    if (printsEntered <= 50) {
                        totalPrice = printsEntered * 0.49;
                        result.setText("The Order Cost is" + currency.format(totalPrice));
                    } else {
                        Toast.makeText(MainActivity.this, "Prints must be no more than 50", Toast.LENGTH_LONG).show();
                    }
                }
                if(rad8x10.isChecked( )) {
                    if (printsEntered <= 50) {
                        totalPrice = printsEntered * 0.79;
                        result.setText("The Order Cost is" + currency.format(totalPrice));
                    } else {
                        Toast.makeText(MainActivity.this, "Prints must be no more than 50", Toast.LENGTH_LONG).show();
                    }
                }

            }
        });
    }
}