package com.asif.asif_calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    TextView History, Display;
    Button btn7, btn8,btn9,btn4,btn5,btn6,btn1,btn2,btn3,btn0,btnC,btnDiv,btnMul,btnMai, btnPlus, btnEql;
    Double a, b, result;
    int operationalFlag = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
        btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);
        btn3.setOnClickListener(this);
        btn4.setOnClickListener(this);
        btn5.setOnClickListener(this);
        btn6.setOnClickListener(this);
        btn7.setOnClickListener(this);
        btn8.setOnClickListener(this);
        btn9.setOnClickListener(this);
        btn0.setOnClickListener(this);
        btnPlus.setOnClickListener(this);
        btnMai.setOnClickListener(this);
        btnDiv.setOnClickListener(this);
        btnMul.setOnClickListener(this);
        btnEql.setOnClickListener(this);
        btnC.setOnClickListener(this);

    }
    @Override
    public void onClick(View view) {
        String tem = "";
        switch (view.getId()) {
            case R.id.btn1:
                tem = Display.getText().toString();
                Display.setText(tem + "1");
                break;
            case R.id.btn2:
                tem = Display.getText().toString();
                Display.setText(tem + "2");
                break;
            case R.id.btn3:
                tem = Display.getText().toString();
                Display.setText(tem + "3");
                break;
            case R.id.btn4:
                tem = Display.getText().toString();
                Display.setText(tem + "4");
                break;
            case R.id.btn5:
                tem = Display.getText().toString();
                Display.setText(tem + "5");
                break;
            case R.id.btn6:
                tem = Display.getText().toString();
                Display.setText(tem + "6");
                break;
            case R.id.btn7:
                tem = Display.getText().toString();
                Display.setText(tem + "7");
                break;
            case R.id.btn8:
                tem = Display.getText().toString();
                Display.setText(tem + "8");
                break;
            case R.id.btn9:
                tem = Display.getText().toString();
                Display.setText(tem + "9");
                break;
            case R.id.btn0:
                tem = Display.getText().toString();
                Display.setText(tem + "0");
                break;
            case R.id.btnPlus:
                tem = Display.getText().toString();
                a = Double.parseDouble(tem);
                History.setText(tem + "+");
                operationalFlag = 1;
                Display.setText("");
                break;
            case R.id.btnMai:
                tem = Display.getText().toString();
                a = Double.parseDouble(tem);
                History.setText(tem + "-");
                operationalFlag = 2;
                Display.setText("");
                break;
            case R.id.btnMul:
                tem = Display.getText().toString();
                a = Double.parseDouble(tem);
                History.setText(tem + "*");
                operationalFlag = 3;
                Display.setText("");
                break;
            case R.id.btnDiv:
                tem = Display.getText().toString();
                a = Double.parseDouble(tem);
                History.setText(tem + "/");
                operationalFlag = 4;
                Display.setText("");
                break;

            case R.id.btnEql:
                tem = Display.getText().toString();
                b = Double.parseDouble(tem);
                long intB=b.intValue();
                switch (operationalFlag) {
                    case 1:
                        result = a + b;
                        break;
                    case 2:
                        result = a - b;
                        break;
                    case 3:
                        result = a * b;
                        break;
                    case 4:
                        result = a / b;
                        break;
                }
                tem = History.getText().toString();
                tem = tem + String.valueOf(intB) + "=";
                History.setText(tem);
                Display.setText(String.valueOf(result.intValue()));
                break;
        }
        btnC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Display.setText("");
                History.setText("");
                a = 0.0;
                b = 0.0;
            }
        });

        }

    private void init() {

        History = findViewById(R.id.History);
        Display = findViewById(R.id.Display);
        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);
        btn3 = findViewById(R.id.btn3);
        btn4 = findViewById(R.id.btn4);
        btn5 = findViewById(R.id.btn5);
        btn6 = findViewById(R.id.btn6);
        btn7 = findViewById(R.id.btn7);
        btn8 = findViewById(R.id.btn8);
        btn9 = findViewById(R.id.btn9);
        btn0 = findViewById(R.id.btn0);
        btnPlus = findViewById(R.id.btnPlus);
        btnEql = findViewById(R.id.btnEql);
        btnMai = findViewById(R.id.btnMai);
        btnDiv = findViewById(R.id.btnDiv);
        btnMul = findViewById(R.id.btnMul);
        btnC = findViewById(R.id.btnC);
    }

}