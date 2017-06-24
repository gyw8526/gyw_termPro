package com.example.wook.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;


class MainActivity extends AppCompatActivity {
    String temp = "0";
    String first = "0";
    float displayF;
    int displayI;
    boolean fi = false;
    String operator;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button button1 = (Button)findViewById(R.id.button1);
        final Button button2 = (Button)findViewById(R.id.button2);
        final Button button3 = (Button)findViewById(R.id.button3);
        final Button button4 = (Button)findViewById(R.id.button4);
        final Button button5 = (Button)findViewById(R.id.button5);
        final Button button6 = (Button)findViewById(R.id.button6);
        final Button button7 = (Button)findViewById(R.id.button7);
        final Button button8 = (Button)findViewById(R.id.button8);
        final Button button9 = (Button)findViewById(R.id.button9);
        final Button button0 = (Button)findViewById(R.id.button0);
        final Button buttonC = (Button)findViewById(R.id.buttonC);
        final Button buttonDot = (Button)findViewById(R.id.buttonDot);
        final Button buttonPlus = (Button)findViewById(R.id.buttonPlus);
        final Button buttonMinus = (Button)findViewById(R.id.buttonMinus);
        final Button buttonMulti = (Button)findViewById(R.id.buttonMulti);
        final Button buttonDevide = (Button)findViewById(R.id.buttonDevide);
        final Button buttonEqual = (Button)findViewById(R.id.buttonEqual);
        final TextView textView = (TextView)findViewById(R.id.textView);

        button0.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                temp +="0";
                if(fi){
                    displayF = Float.parseFloat(temp);
                    temp = Float.toString(displayF);
                }
                else{
                    displayI = Integer.parseInt(temp);
                    temp = Integer.toString(displayI);
                }
                textView.setText(temp);
            }
        });
        button1.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                temp +="1";
                if(fi){
                    displayF = Float.parseFloat(temp);
                    temp = Float.toString(displayF);
                }
                else{
                    displayI = Integer.parseInt(temp);
                    temp = Integer.toString(displayI);
                }
                textView.setText(temp);
            }
        });
        button2.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                temp +="2";
                if(fi){
                    displayF = Float.parseFloat(temp);
                    temp = Float.toString(displayF);
                }
                else{
                    displayI = Integer.parseInt(temp);
                    temp = Integer.toString(displayI);
                }
                textView.setText(temp);
            }
        });
        button3.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                temp+="3";
                if(fi){
                    displayF = Float.parseFloat(temp);
                    temp = Float.toString(displayF);
                }
                else{
                    displayI = Integer.parseInt(temp);
                    temp = Integer.toString(displayI);
                }
                textView.setText(temp);
            }
        });
        button4.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                temp +="4";
                if(fi){
                    displayF = Float.parseFloat(temp);
                    temp = Float.toString(displayF);
                }
                else{
                    displayI = Integer.parseInt(temp);
                    temp = Integer.toString(displayI);
                }
                textView.setText(temp);
            }
        });
        button5.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                temp +="5";
                if(fi){
                    displayF = Float.parseFloat(temp);
                    temp = Float.toString(displayF);
                }
                else{
                    displayI = Integer.parseInt(temp);
                    temp = Integer.toString(displayI);
                }
                textView.setText(temp);
            }
        });
        button6.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                temp +="6";
                if(fi){
                    displayF = Float.parseFloat(temp);
                    temp = Float.toString(displayF);
                }
                else{
                    displayI = Integer.parseInt(temp);
                    temp = Integer.toString(displayI);
                }
                textView.setText(temp);
            }
        });
        button7.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                temp +="7";
                if(fi){
                    displayF = Float.parseFloat(temp);
                    temp = Float.toString(displayF);
                }
                else{
                    displayI = Integer.parseInt(temp);
                    temp = Integer.toString(displayI);
                }
                textView.setText(temp);
            }
        });
        button8.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                temp +="8";
                if(fi){
                    displayF = Float.parseFloat(temp);
                    temp = Float.toString(displayF);
                }
                else{
                    displayI = Integer.parseInt(temp);
                    temp = Integer.toString(displayI);
                }
                textView.setText(temp);
            }
        });
        button9.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                temp +="9";
                if(fi){
                    displayF = Float.parseFloat(temp);
                    temp = Float.toString(displayF);
                }
                else{
                    displayI = Integer.parseInt(temp);
                    temp = Integer.toString(displayI);
                }
                textView.setText(temp);
            }
        });
        buttonC.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                temp = "0";
                first = "0";
                fi = false;
                displayF = 0;
                displayI = 0;
                operator = "";
                textView.setText("0");
            }
        });
        buttonDot.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                fi = true;
                temp += ".";
            }
        });
        buttonEqual.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                if(first != "0"){
                    float tmp = 0;
                    switch(operator){
                        case "+" :  tmp = Float.parseFloat(first) + Float.parseFloat(temp);textView.setText(Float.toString(tmp));break;
                        case "*" :  tmp = Float.parseFloat(first) * Float.parseFloat(temp);textView.setText(Float.toString(tmp));break;
                        case "/" :  tmp = Float.parseFloat(first) / Float.parseFloat(temp);textView.setText(Float.toString(tmp));break;
                        case "-" :  tmp = Float.parseFloat(first) - Float.parseFloat(temp);textView.setText(Float.toString(tmp));break;
                    }
                    first = Float.toString(tmp);
                    temp = "0";
                }
            }
        });
        buttonPlus.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                if(first == "0"){
                    first = temp;
                    operator = "+";
                    fi = false;
                    temp = "0";
                }
                else {
                    float tmp = 0;
                    switch(operator){
                        case "+" :  tmp = Float.parseFloat(first) + Float.parseFloat(temp);textView.setText(Float.toString(tmp));break;
                        case "*" :  tmp = Float.parseFloat(first) * Float.parseFloat(temp);textView.setText(Float.toString(tmp));break;
                        case "/" :  tmp = Float.parseFloat(first) / Float.parseFloat(temp);textView.setText(Float.toString(tmp));break;
                        case "-" :  tmp = Float.parseFloat(first) - Float.parseFloat(temp);textView.setText(Float.toString(tmp));break;
                    }
                    first = Float.toString(tmp);
                    operator = "+";
                    fi = false;
                    temp = "0";
                }
            }
        });
        buttonMinus.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                if(first == "0"){
                    first = temp;
                    operator = "-";
                    fi = false;
                    temp = "0";
                }
                else {
                    float tmp = 0;
                    switch(operator){
                        case "+" :  tmp = Float.parseFloat(first) + Float.parseFloat(temp);textView.setText(Float.toString(tmp));break;
                        case "*" :  tmp = Float.parseFloat(first) * Float.parseFloat(temp);textView.setText(Float.toString(tmp));break;
                        case "/" :  tmp = Float.parseFloat(first) / Float.parseFloat(temp);textView.setText(Float.toString(tmp));break;
                        case "-" :  tmp = Float.parseFloat(first) - Float.parseFloat(temp);textView.setText(Float.toString(tmp));break;
                    }
                    first = Float.toString(tmp);
                    operator = "-";
                    fi = false;
                    temp = "0";
                }
            }
        });
        buttonMulti.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                if(first == "0"){
                    first = temp;
                    fi = false;
                    operator = "*";
                    temp = "0";
                }
                else {
                    float tmp = 0;
                    switch(operator){
                        case "+" :  tmp = Float.parseFloat(first) + Float.parseFloat(temp);textView.setText(Float.toString(tmp));break;
                        case "*" :  tmp = Float.parseFloat(first) * Float.parseFloat(temp);textView.setText(Float.toString(tmp));break;
                        case "/" :  tmp = Float.parseFloat(first) / Float.parseFloat(temp);textView.setText(Float.toString(tmp));break;
                        case "-" :  tmp = Float.parseFloat(first) - Float.parseFloat(temp);textView.setText(Float.toString(tmp));break;
                    }
                    first = Float.toString(tmp);
                    operator = "*";
                    fi = false;
                    temp = "0";
                }
            }
        });
        buttonDevide.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                if(first == "0"){
                    first = temp;
                    fi = false;
                    operator = "/";
                    temp = "0";
                }
                else {
                    float tmp = 0;
                    switch(operator){
                        case "+" :  tmp = Float.parseFloat(first) + Float.parseFloat(temp);textView.setText(Float.toString(tmp));break;
                        case "*" :  tmp = Float.parseFloat(first) * Float.parseFloat(temp);textView.setText(Float.toString(tmp));break;
                        case "/" :  tmp = Float.parseFloat(first) / Float.parseFloat(temp);textView.setText(Float.toString(tmp));break;
                        case "-" :  tmp = Float.parseFloat(first) - Float.parseFloat(temp);textView.setText(Float.toString(tmp));break;
                    }
                    first = Float.toString(tmp);
                    operator = "/";
                    fi = false;
                    temp = "0";
                }
            }
        });
    }
}