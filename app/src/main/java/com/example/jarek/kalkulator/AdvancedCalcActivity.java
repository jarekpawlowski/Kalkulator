package com.example.jarek.kalkulator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class AdvancedCalcActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_advanced_calc);
        changeText();
        ButterKnife.bind(this);
    }

    @BindView(R.id.button1) Button b1;

    @OnClick(R.id.button1)
    public void Button1Click()
    {
        TextView tv = (TextView) findViewById(R.id.textView);
        tv.setText("1");
    }

    @BindView(R.id.button2) Button b2;

    @OnClick(R.id.button2)
    public void Button2Click()
    {
        TextView tv = (TextView) findViewById(R.id.textView);
        tv.setText("2");
    }

    @BindView(R.id.button3) Button b3;

    @OnClick(R.id.button3)
    public void Button3Click()
    {
        TextView tv = (TextView) findViewById(R.id.textView);
        tv.setText("3");
    }

    @BindView(R.id.button4) Button b4;

    @OnClick(R.id.button4)
    public void Button4Click()
    {
        TextView tv = (TextView) findViewById(R.id.textView);
        tv.setText("4");
    }

    @BindView(R.id.button5) Button b5;

    @OnClick(R.id.button5)
    public void Button5Click()
    {
        TextView tv = (TextView) findViewById(R.id.textView);
        tv.setText("5");
    }

    @BindView(R.id.button6) Button b6;

    @OnClick(R.id.button6)
    public void Button6Click()
    {
        TextView tv = (TextView) findViewById(R.id.textView);
        tv.setText("6");
    }

    @BindView(R.id.button7) Button b7;

    @OnClick(R.id.button7)
    public void Button7Click()
    {
        TextView tv = (TextView) findViewById(R.id.textView);
        tv.setText("7");
    }

    @BindView(R.id.button8) Button b8;

    @OnClick(R.id.button8)
    public void Button8Click()
    {
        TextView tv = (TextView) findViewById(R.id.textView);
        tv.setText("8");
    }

    @BindView(R.id.button9) Button b9;

    @OnClick(R.id.button9)
    public void Button9Click()
    {
        TextView tv = (TextView) findViewById(R.id.textView);
        tv.setText("9");
    }

    @BindView(R.id.buttonC) Button bC;

    @OnClick(R.id.buttonC)
    public void ButtonCClick()
    {
        TextView tv = (TextView) findViewById(R.id.textView);
        tv.setText("0");
    }

    @BindView(R.id.textView) TextView atv;
    private void changeText(){
        final TextView textToChange = (TextView) findViewById(R.id.textView);
        Button changeTextButton = (Button) findViewById(R.id.button0);

        changeTextButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textToChange.setText("0");
            }
        });
    }


}
