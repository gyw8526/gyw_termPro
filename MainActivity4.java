package com.example.wook.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import java.util.Stack;
import java.util.StringTokenizer;


class MainActivity extends AppCompatActivity {
    String temp = "";
    boolean fi = false;

    private String Calc(String str){
        if(str.indexOf('(') != -1){
            int fs = str.indexOf('(');
            int ls = str.lastIndexOf(')');
            String s = Calc(str.substring(fs + 1, ls));
            str = str.substring(0, fs) + s + str.substring(ls+1, str.length());
        }

        float cnt = 0;
        Stack <Float> Stk_Num = new Stack<Float>();
        StringTokenizer ST_Num = new StringTokenizer(str,"+-/* ");
        StringTokenizer ST_Oper = new StringTokenizer(str,"1234567890. ");

        Stk_Num.push(Float.parseFloat(ST_Num.nextToken()));
        while(ST_Num.hasMoreTokens()){
            char oper = ST_Oper.nextToken().charAt(0);
            String num = ST_Num.nextToken();
            float a;

            if(oper == '*'){
                a = Stk_Num.pop();
                a *= Float.parseFloat(num);
                Stk_Num.push(a);
            }
            else if(oper == '/'){
                a = Stk_Num.pop();
                a /= Integer.parseInt(num);
                Stk_Num.push(a);
            }
            else if(oper == '+'){
                Stk_Num.push(Float.parseFloat(num));
            }
            else if(oper == '-'){
                Stk_Num.push(-1 * (Float.parseFloat(num)));
            }
        }

        while(!Stk_Num.isEmpty()){
            cnt += Stk_Num.pop();
        }

        return Float.toString(cnt);
    }
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
                textView.setText(Calc(temp));
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
