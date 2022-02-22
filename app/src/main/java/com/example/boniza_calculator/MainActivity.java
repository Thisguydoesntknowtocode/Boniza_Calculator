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

    double var1, var2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


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


        txtVar1 = findViewById(R.id.txtVariable1);
        txtVar2 = findViewById(R.id.txtVariable2);

        var1 = Double.parseDouble(txtVar1.getText().toString());
        var2 = Double.parseDouble(txtVar2.getText().toString());


        switch (v.getId()) {
            case R.id.btnAdd:
                txtAnswer.setText(String.valueOf(var1 + var2 ));


                break;
            case R.id.btnSubtract:
                txtAnswer.setText(String.valueOf(var1 - var2 ));
                break;
            case R.id.btnDivide:
                txtAnswer.setText(String.valueOf(var1 / var2 ));
                break;
            case R.id.btnMultiply:
                txtAnswer.setText(String.valueOf(var1 * var2 ));
                break;
            case R.id.btnModulo:
                txtAnswer.setText(String.valueOf(var1 % var2 ));

                break;
        }

    }







}