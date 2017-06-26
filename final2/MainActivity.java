package com.example.wook.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


class MainActivity extends AppCompatActivity {
    String temp = "";
    boolean fi = false;

    Calculator c = new Calculator();
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
        final Button buttonIN = (Button)findViewById(R.id.button10);
        final Button buttonOUT = (Button)findViewById(R.id.button11);
        final Button buttonDot = (Button)findViewById(R.id.buttonDot);
        final Button buttonPlus = (Button)findViewById(R.id.buttonPlus);
        final Button buttonMinus = (Button)findViewById(R.id.buttonMinus);
        final Button buttonMulti = (Button)findViewById(R.id.buttonMulti);
        final Button buttonDevide = (Button)findViewById(R.id.buttonDevide);
        final Button buttonEqual = (Button)findViewById(R.id.buttonEqual);
        final TextView textView = (TextView)findViewById(R.id.textView);
        final TextView textView2 = (TextView)findViewById(R.id.textView2);
        final TextView textView3 = (TextView)findViewById(R.id.textView3);
        final TextView textView4 = (TextView)findViewById(R.id.textView4);

        button0.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                temp +="0";
                textView.setText(temp);
            }
        });
        button1.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                temp +="1";
                textView.setText(temp);
            }
        });
        button2.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                temp +="2";
                textView.setText(temp);
            }
        });
        button3.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                temp+="3";
                textView.setText(temp);
            }
        });
        button4.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                temp +="4";
                textView.setText(temp);
            }
        });
        button5.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                temp +="5";
                textView.setText(temp);
            }
        });
        button6.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                temp +="6";
                textView.setText(temp);
            }
        });
        button7.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                temp +="7";
                textView.setText(temp);
            }
        });
        button8.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                temp +="8";
                textView.setText(temp);
            }
        });
        button9.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                temp +="9";
                textView.setText(temp);
            }
        });
        buttonC.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                temp = "";
                fi = false;
                textView.setText("0");
                textView2.setText("0");
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
                textView2.setText(c.Calc(temp));
            }
        });
        buttonPlus.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                temp+="+";
                textView.setText(temp);
            }
        });
        buttonMinus.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                temp+="-";
                textView.setText(temp);
            }
        });
        buttonMulti.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                temp+="*";
                textView.setText(temp);
            }
        });
        buttonDevide.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                temp+="/";
                textView.setText(temp);
            }
        });
        buttonIN.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                temp+="(";
                textView.setText(temp);
            }
        });
        buttonOUT.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                temp+=")";
                textView.setText(temp);
            }
        });
    }
}
