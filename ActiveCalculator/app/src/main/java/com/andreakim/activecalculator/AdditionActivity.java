package com.andreakim.activecalculator;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.List;
// source for addition at http://codehandbook.org/a-simple-android-application-for-adding-two-numbers/

public class AdditionActivity extends AppCompatActivity {

    Button btnAdd = (Button) findViewById(R.id.btn_plus);
    private Intent mIntentToAdd;
    private Intent mIntentToSubtract;
    private Intent mIntentToMultiply;
    private Intent mIntentToDivide;

  //  Button btnSub = (Button) findViewById(R.id.btn_sub);
  //  Button btnMlt = (Button) findViewById(R.id.btn_mlt);
  //  Button btnDiv = (Button) findViewById(R.id.btn_div);



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_addition);
        firstNumber = (EditText)findViewById(R.id.editText1);
        secondNumber = (EditText)findViewById(R.id.editText2);
        resultAdd = (TextView)findViewById(R.id.result1);

        btnAdd.setOnClickListener(new OnClickListener() {

            View.OnClickListener addResult = new View.OnClickListener() {

                public void onClickAdd(View view) {
                    num1 = Double.parseDouble(firstNumber.getText().toString());
                    num2 = Double.parseDouble(secondNumber.getText().toString());
                    sum = num1 + num2;
                    addResult.setText(Double.toString(sum));
                }
            };
        }
    }
}