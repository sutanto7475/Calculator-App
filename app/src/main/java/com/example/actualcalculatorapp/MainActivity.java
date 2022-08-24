package com.example.actualcalculatorapp;

import androidx.appcompat.app.AppCompatActivity;

import java.text.DecimalFormat;
import java.text.NumberFormat;
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
    public DecimalFormat dFormat = new DecimalFormat("#############.####");
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
            numberSumTV.setText("Enter Two Numbers");
            return;
        }
        if(TextUtils.isEmpty(number2ET.getText().toString())){
            numberSumTV.setText("Enter Two Numbers");
            return;
        }
        double num1 = Double.parseDouble((number1ET.getText().toString()));
        double num2 = Double.parseDouble((number2ET.getText().toString()));
        double sum = num1+num2;

        numberSumTV.setText("" + dFormat.format(sum));
    }

    public void findProduct(View view){
        EditText number1ET = findViewById(R.id.num1ET);
        EditText number2ET = findViewById(R.id.num2ET);
        TextView numberSumTV = findViewById(R.id.resultTV);

        if(TextUtils.isEmpty(number1ET.getText().toString())){
            numberSumTV.setText("Enter Two Numbers");
            return;
        }
        if(TextUtils.isEmpty(number2ET.getText().toString())){
            numberSumTV.setText("Enter Two Numbers");
            return;
        }

        double num1 = Double.parseDouble((number1ET.getText().toString()));
        double num2 = Double.parseDouble((number2ET.getText().toString()));
        double product = num1*num2;

        numberSumTV.setText("" + dFormat.format(product));
    }

    public void findQuotient(View view){
        EditText number1ET = findViewById(R.id.num1ET);
        EditText number2ET = findViewById(R.id.num2ET);
        TextView numberSumTV = findViewById(R.id.resultTV);

        if(TextUtils.isEmpty(number1ET.getText().toString())){
            numberSumTV.setText("Enter Two Numbers");
            return;
        }
        if(TextUtils.isEmpty(number2ET.getText().toString())){
            numberSumTV.setText("Enter Two Numbers");
            return;
        }

        if(number2ET.getText().toString().equals("0")){
            numberSumTV.setText("Undefined");
            return;
        }

        double num1 = Double.parseDouble((number1ET.getText().toString()));
        double num2 = Double.parseDouble((number2ET.getText().toString()));
        double quotient = (double)num1/num2;

        numberSumTV.setText("" + dFormat.format(quotient));

    }

    public void findDifference(View view){
        EditText number1ET = findViewById(R.id.num1ET);
        EditText number2ET = findViewById(R.id.num2ET);
        TextView numberSumTV = findViewById(R.id.resultTV);

        if(TextUtils.isEmpty(number1ET.getText().toString())){
            numberSumTV.setText("Enter Two Numbers");
            return;
        }
        if(TextUtils.isEmpty(number2ET.getText().toString())){
            numberSumTV.setText("Enter Two Numbers");
            return;
        }

        double num1 = Double.parseDouble((number1ET.getText().toString()));
        double num2 = Double.parseDouble((number2ET.getText().toString()));
        double difference = num1-num2;

        numberSumTV.setText("" + dFormat.format(difference));
    }

    public void findAns(View view){
        EditText number1ET = findViewById(R.id.num1ET);
        EditText number2ET = findViewById(R.id.num2ET);
        TextView numberSumTV = findViewById(R.id.resultTV);

        if(TextUtils.isEmpty(number1ET.getText().toString())){
            numberSumTV.setText("Enter Two Numbers");
            return;
        }
        if(TextUtils.isEmpty(number2ET.getText().toString())){
            numberSumTV.setText("Enter Two Numbers");
            return;
        }
        if(TextUtils.isEmpty(numberSumTV.getText().toString())){
            return;
        }


        double ans = Double.parseDouble((numberSumTV.getText().toString()));
        number1ET.setText("" + ans);
        number2ET.setText("");
    }

    public void findModulus(View view){
        EditText number1ET = findViewById(R.id.num1ET);
        EditText number2ET = findViewById(R.id.num2ET);
        TextView numberSumTV = findViewById(R.id.resultTV);

        if(TextUtils.isEmpty(number1ET.getText().toString())){
            numberSumTV.setText("Enter Two Numbers");
            return;
        }
        if(TextUtils.isEmpty(number2ET.getText().toString())){
            numberSumTV.setText("Enter Two Numbers");
            return;
        }

        double num1 = Double.parseDouble((number1ET.getText().toString()));
        double num2 = Double.parseDouble((number2ET.getText().toString()));
        double modulus = num1%num2;

        numberSumTV.setText("" + dFormat.format(modulus));
    }

    public void findPower(View view){
        EditText number1ET = findViewById(R.id.num1ET);
        EditText number2ET = findViewById(R.id.num2ET);
        TextView numberSumTV = findViewById(R.id.resultTV);

        if(TextUtils.isEmpty(number1ET.getText().toString())){
            numberSumTV.setText("Enter Two Numbers");
            return;
        }
        if(TextUtils.isEmpty(number2ET.getText().toString())){
            numberSumTV.setText("Enter Two Numbers");
            return;
        }

        double num1 = Double.parseDouble((number1ET.getText().toString()));
        double num2 = Double.parseDouble((number2ET.getText().toString()));
        double power = Math.pow(num1, num2);

        numberSumTV.setText("" + dFormat.format(power));
    }

    public void closeApp(View view){
        System.exit(0);
    }

    public void clearApp(View view){
        EditText number1ET = findViewById(R.id.num1ET);
        EditText number2ET = findViewById(R.id.num2ET);
        TextView numberSumTV = findViewById(R.id.resultTV);

        number1ET.setText("");
        number2ET.setText("");
        numberSumTV.setText("");
    }
}