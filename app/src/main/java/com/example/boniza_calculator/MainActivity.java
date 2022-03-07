package com.example.boniza_calculator;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {


    EditText txtVar1, txtVar2;
    Button btnAdd, btnSubtract, btnDivide, btnModulo, btnMultiply;
    TextView txtAnswer;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtVar1 = findViewById(R.id.txtVariable1);
        txtVar2 = findViewById(R.id.txtVariable2);

        btnAdd = findViewById(R.id.btnAdd);
        btnSubtract = findViewById(R.id.btnSubtract);
        btnDivide = findViewById(R.id.btnDivide);
        btnModulo = findViewById(R.id.btnModulo);
        btnMultiply = findViewById(R.id.btnMultiply);
        txtAnswer = findViewById(R.id.txtAnswer);


        btnAdd.setOnClickListener(this);
        btnSubtract.setOnClickListener(this);
        btnDivide.setOnClickListener(this);
        btnModulo.setOnClickListener(this);
        btnMultiply.setOnClickListener(this);


    }


    @Override
    public void onClick(View v) {


        double  var1, var2, answer;

        var1 = Double.parseDouble(String.valueOf(txtVar1.getText()));
        var2 = Double.parseDouble(String.valueOf(txtVar2.getText()));


        switch (v.getId()) {

            case R.id.btnAdd:
                txtAnswer.setText(String.valueOf(add(var1, var2)));
                break;
            case R.id.btnSubtract:
                txtAnswer.setText(String.valueOf(subtract(var1, var2)));
                break;
            case R.id.btnDivide:
                txtAnswer.setText(String.valueOf(divide(var1, var2)));
                break;
            case R.id.btnMultiply:
                answer = var1 * var2;
                txtAnswer.setText(String.valueOf(multiply( var1, var2)));
                break;
            case R.id.btnModulo:
                answer = var1 % var2;
                txtAnswer.setText(String.valueOf(modulo(var1, var2 )));

                break;
        }
    }

    double add(double var1, double var2){ return var1 + var2;}
    double subtract(double var1, double var2){ return var1 - var2;}
    double divide(double var1, double var2){ return var1 / var2;}
    double multiply(double var1, double var2){return var1 * var2;}
    double modulo(double var1, double var2){return var1 % var2;}







}