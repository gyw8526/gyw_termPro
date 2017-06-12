package com.example.wook.myapplication;

//import android.support.v4.widget.TextViewCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

//import java.util.HashMap;
//import java.util.Map;

//import static java.lang.Integer.*;
import android.widget.Toast;

//import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {
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

        final TextView textView = (TextView)findViewById(R.id.textView);

        View.OnClickListener clickListener = new View.OnClickListener() {
            @Override
            public void onClick(View v){
                Toast.makeText(v.getContext(),((Button)v).getText(),Toast.LENGTH_SHORT).show();
                textView.setText(((Button) v).getText());
                //String text = (String) textView.getText();
                //text += ((Button) v).getText();
                //textView.setText(Integer.parseInt(text)+"");
            }
        };
        button0.setOnClickListener(clickListener);
        button1.setOnClickListener(clickListener);
        button2.setOnClickListener(clickListener);
        button3.setOnClickListener(clickListener);
        button4.setOnClickListener(clickListener);
        button5.setOnClickListener(clickListener);
        button6.setOnClickListener(clickListener);
        button7.setOnClickListener(clickListener);
        button8.setOnClickListener(clickListener);
        button9.setOnClickListener(clickListener);
        buttonC.setOnClickListener(clickListener);
        buttonDot.setOnClickListener(clickListener);
    }
}
