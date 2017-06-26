package com.example.wook.myapplication;

import java.util.Stack;
import java.util.StringTokenizer;

/**
 * Created by wook on 2017-06-26.
 */

public class Calculator {
    String Calc(String str){
        if(str.indexOf('(') != -1){
            int fs = str.indexOf('(');
            int ls = str.lastIndexOf(')');
            String s = Calc(str.substring(fs + 1, ls));
            str = str.substring(0, fs) + s + str.substring(ls+1, str.length());
        }

        float cnt = 0;
        Stack<Float> Stk_Num = new Stack<Float>();
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
}
