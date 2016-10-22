package com.example.jarek.kalkulator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class SimpleCalc extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_simple_calc);
        changeText();
        ButterKnife.bind(this);
    }

    @BindView(R.id.button1SC)
    Button b1SC;

    @OnClick(R.id.button1SC)
    public void Button1SCClick()
    {
        TextView tv = (TextView) findViewById(R.id.textViewSC);
        tv.setText("1");
    }

    @BindView(R.id.button2SC) Button b2SC;

    @OnClick(R.id.button2SC)
    public void Button2SCClick()
    {
        TextView tv = (TextView) findViewById(R.id.textViewSC);
        tv.setText("2");
    }

    @BindView(R.id.button3SC) Button b3SC;

    @OnClick(R.id.button3SC)
    public void Button3SCClick()
    {
        TextView tv = (TextView) findViewById(R.id.textViewSC);
        tv.setText("3");
    }

    @BindView(R.id.button4SC) Button b4SC;

    @OnClick(R.id.button4SC)
    public void Button4SCClick()
    {
        TextView tv = (TextView) findViewById(R.id.textViewSC);
        tv.setText("4");
    }

    @BindView(R.id.button5SC) Button b5SC;

    @OnClick(R.id.button5SC)
    public void Button5SCClick()
    {
        TextView tv = (TextView) findViewById(R.id.textViewSC);
        tv.setText("5");
    }

    @BindView(R.id.button6SC) Button b6SC;

    @OnClick(R.id.button6SC)
    public void Button6SCClick()
    {
        TextView tv = (TextView) findViewById(R.id.textViewSC);
        tv.setText("6");
    }

    @BindView(R.id.button7SC) Button b7SC;

    @OnClick(R.id.button7SC)
    public void Button7SCClick()
    {
        TextView tv = (TextView) findViewById(R.id.textViewSC);
        tv.setText("7");
    }

    @BindView(R.id.button8SC) Button b8SC;

    @OnClick(R.id.button8SC)
    public void Button8SCClick()
    {
        TextView tv = (TextView) findViewById(R.id.textViewSC);
        tv.setText("8");
    }

    @BindView(R.id.button9SC) Button b9SC;

    @OnClick(R.id.button9SC)
    public void Button9SCClick()
    {
        TextView tv = (TextView) findViewById(R.id.textViewSC);
        tv.setText("9");
    }

    @BindView(R.id.buttonCSC) Button bCSC;

    @OnClick(R.id.buttonCSC)
    public void ButtonCSCClick()
    {
        TextView tv = (TextView) findViewById(R.id.textViewSC);
        tv.setText("0");
    }

    @BindView(R.id.textViewSC) TextView atv;
    private void changeText(){
        final TextView textToChange = (TextView) findViewById(R.id.textViewSC);
        Button changeTextButton = (Button) findViewById(R.id.button0SC);

        changeTextButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textToChange.setText("0");
            }
        });
    }
}
