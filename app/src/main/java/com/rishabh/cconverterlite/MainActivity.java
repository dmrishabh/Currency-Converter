package com.rishabh.cconverterlite;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.text.DecimalFormat;
import java.util.Formatter;

public class  MainActivity extends AppCompatActivity {

    Button euro,dollar,pound,yen,dinar,bitcoin,rubal,ausDollar,candollar;
    TextView textView;
    EditText editText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
     //-----------------------------------------------//
        textView=findViewById(R.id.display);
        editText=findViewById(R.id.enterTxt);
        euro=findViewById(R.id.euro);
        dollar=findViewById(R.id.dollar);
        pound=findViewById(R.id.pound);
        yen=findViewById(R.id.yen);
        dinar=findViewById(R.id.dinar);
        bitcoin=findViewById(R.id.bitcoin);
        rubal=findViewById(R.id.rubal);
        ausDollar=findViewById(R.id.australianDollar);
        candollar=findViewById(R.id.canadianDollar);
    //------------------------------------------------//
    //setting on click listner
    //------------------------------------------------//
        euro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String Z = editText.getText().toString();

                if (TextUtils.isEmpty(Z)){
                    editText.setError("Enter Rupees first");
                }
                else {

                    double n,k;

                    n=Double.parseDouble(Z);
                    textView.setText(null);

                    Formatter formatter =new Formatter();

                    k = n * 0.011;

                    DecimalFormat decimalFormat = new DecimalFormat("#.00");
                    textView.setText(""+decimalFormat.format(k));

       // bad manner because there is no formatting        //    textView.setText(""+k);
                }
            }
        });

        dollar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String Z = editText.getText().toString();

                if (TextUtils.isEmpty(Z)){
                    editText.setError("Enter Rupees first");
                }
                else {

                    double n,k;

                    n=Double.parseDouble(Z);
                    textView.setText(null);

                    Formatter formatter =new Formatter();

                    k = n * 0.013;

                    DecimalFormat decimalFormat = new DecimalFormat("#.000");
                    textView.setText(""+decimalFormat.format(k));

                    // bad manner because there is no formatting        //    textView.setText(""+k);
                }
            }
        });

        pound.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String Z = editText.getText().toString();

                if (TextUtils.isEmpty(Z)){
                    editText.setError("Enter Rupees first");
                }
                else {

                    double n,k;

                    n=Double.parseDouble(Z);
                    textView.setText(null);

                    Formatter formatter =new Formatter();

                    k = n * 0.010;

                    DecimalFormat decimalFormat = new DecimalFormat("#.000");
                    textView.setText(""+decimalFormat.format(k));

                    // bad manner because there is no formatting        //    textView.setText(""+k);
                }
            }
        });

        yen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String Z = editText.getText().toString();

                if (TextUtils.isEmpty(Z)){
                    editText.setError("Enter Rupees first");
                }
                else {

                    double n,k;

                    n=Double.parseDouble(Z);
                    textView.setText(null);

                    Formatter formatter =new Formatter();

                    k = n * 1.42;

                    DecimalFormat decimalFormat = new DecimalFormat("#.00");
                    textView.setText(""+decimalFormat.format(k));

                    // bad manner because there is no formatting        //    textView.setText(""+k);
                }
            }
        });

        dinar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String Z = editText.getText().toString();

                if (TextUtils.isEmpty(Z)){
                    editText.setError("Enter Rupees first");
                }
                else {

                    double n,k;

                    n=Double.parseDouble(Z);
                    textView.setText(null);

                    Formatter formatter =new Formatter();

                    k = n * 15.94;

                    DecimalFormat decimalFormat = new DecimalFormat("#.00");
                    textView.setText(""+decimalFormat.format(k));

                    // bad manner because there is no formatting        //    textView.setText(""+k);
                }
            }
        });
        bitcoin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String Z = editText.getText().toString();

                if (TextUtils.isEmpty(Z)){
                    editText.setError("Enter Rupees first");
                }
                else {

                    double n,k;

                    n=Double.parseDouble(Z);
                    textView.setText(null);

                    Formatter formatter =new Formatter();

                    k = n * 0.0000011;

                    DecimalFormat decimalFormat = new DecimalFormat("#.0000000");
                    textView.setText(""+decimalFormat.format(k));

                    // bad manner because there is no formatting        //    textView.setText(""+k);
                }
            }
        });

        rubal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String Z = editText.getText().toString();

                if (TextUtils.isEmpty(Z)){
                    editText.setError("Enter Rupees first");
                }
                else {

                    double n,k;

                    n=Double.parseDouble(Z);
                    textView.setText(null);

                    Formatter formatter =new Formatter();

                    k = n * 0.97;

                    DecimalFormat decimalFormat = new DecimalFormat("#.00");
                    textView.setText(""+decimalFormat.format(k));

                    // bad manner because there is no formatting        //    textView.setText(""+k);
                }
            }
        });

        ausDollar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String Z = editText.getText().toString();

                if (TextUtils.isEmpty(Z)){
                    editText.setError("Enter Rupees first");
                }
                else {

                    double n,k;

                    n=Double.parseDouble(Z);
                    textView.setText(null);

                    Formatter formatter =new Formatter();

                    k = n * 0.019;

                    DecimalFormat decimalFormat = new DecimalFormat("#.000");
                    textView.setText(""+decimalFormat.format(k));

                    // bad manner because there is no formatting        //    textView.setText(""+k);
                }
            }
        });

        candollar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String Z = editText.getText().toString();

                if (TextUtils.isEmpty(Z)){
                    editText.setError("Enter Rupees first");
                }
                else {

                    double n,k;

                    n=Double.parseDouble(Z);
                    textView.setText(null);

                    Formatter formatter =new Formatter();

                    k = n * 0.018;

                    DecimalFormat decimalFormat = new DecimalFormat("#.000");
                    textView.setText(""+decimalFormat.format(k));

                    // bad manner because there is no formatting        //    textView.setText(""+k);
                }
            }
        });
    }
}