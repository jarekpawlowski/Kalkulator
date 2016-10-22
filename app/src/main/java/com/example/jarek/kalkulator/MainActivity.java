package com.example.jarek.kalkulator;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity{    //Activity {

    public static int exitState = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button simpleCalcButton = (Button) findViewById(R.id.simple_calc_button);
        simpleCalcButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, SimpleCalc.class);
                startActivity(intent);
            }
        });

        Button advCalcButton = (Button) findViewById(R.id.advanced_calc_button);
        advCalcButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, AdvancedCalcActivity.class);
                startActivity(intent);
            }
        });

        Button aboutButton = (Button) findViewById(R.id.about_button);
        aboutButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, Pop.class));
            }
        });

        if(exitState == 1) {
            onBackPressed();
        }
    }

    @Override
    public void onDestroy(){
        super.onDestroy();
        //Toast.makeText(this, "Ala ma kota", Toast.LENGTH_LONG).show();
    }

    public void exitApp(View v){
        finish();
    }

    public void onBackPressed(){
        exitState = 1;
        AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
        builder.setMessage("Do you want to exit?");
        builder.setCancelable(true);

        builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int id){
                exitState = 0;
                finish();
            }
        });

        builder.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int id) {
                exitState = 0;
                dialog.cancel();
            }
        });

        AlertDialog alert = builder.create();
        alert.show();
    }

}
