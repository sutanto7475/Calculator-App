package com.example.actualcalculatorapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void findSum(View view){
        EditText number1ET = findViewById(R.id.num1ET);
        EditText number2ET = findViewById(R.id.num2ET);
        TextView numberSumTV = findViewById(R.id.resultTV);

        if(TextUtils.isEmpty(number1ET.getText().toString())){
            number1ET.setHint("Input a number");
        }
        double num1 = Double.parseDouble((number1ET.getText().toString()));
        double num2 = Double.parseDouble((number2ET.getText().toString()));
        double sum = num1+num2;

        numberSumTV.setText("" + sum);
    }

    public void findProduct(View view){
        EditText number1ET = findViewById(R.id.num1ET);
        EditText number2ET = findViewById(R.id.num2ET);
        TextView numberSumTV = findViewById(R.id.resultTV);

        double num1 = Double.parseDouble((number1ET.getText().toString()));
        double num2 = Double.parseDouble((number2ET.getText().toString()));
        double product = (double)num1*num2;

        numberSumTV.setText("" + product);
    }

    public void findQuotient(View view){
        EditText number1ET = findViewById(R.id.num1ET);
        EditText number2ET = findViewById(R.id.num2ET);
        TextView numberSumTV = findViewById(R.id.resultTV);
        Button button = findViewById(R.id.Division);
        double num1 = Double.parseDouble((number1ET.getText().toString()));
        double num2 = Double.parseDouble((number2ET.getText().toString()));
        double quotient = (double)num1/num2;

        numberSumTV.setText("" + quotient);

    }

    public void findDifference(View view){
        EditText number1ET = findViewById(R.id.num1ET);
        EditText number2ET = findViewById(R.id.num2ET);
        TextView numberSumTV = findViewById(R.id.resultTV);

        double num1 = Double.parseDouble((number1ET.getText().toString()));
        double num2 = Double.parseDouble((number2ET.getText().toString()));
        double difference = num1-num2;

        numberSumTV.setText("" + difference);
    }

    public void findAns(View view){
        EditText number1ET = findViewById(R.id.num1ET);
        EditText number2Et = findViewById(R.id.num2ET);
        TextView numberSumTV = findViewById(R.id.resultTV);


        double ans = Double.parseDouble((numberSumTV.getText().toString()));
        number1ET.setText("" + ans);
        number2Et.setText("");
    }

    public void findModulus(View view){
        EditText number1ET = findViewById(R.id.num1ET);
        EditText number2ET = findViewById(R.id.num2ET);
        TextView numberSumTV = findViewById(R.id.resultTV);

        double num1 = Double.parseDouble((number1ET.getText().toString()));
        double num2 = Double.parseDouble((number2ET.getText().toString()));
        double modulus = num1%num2;

        numberSumTV.setText("" + modulus);
    }
}