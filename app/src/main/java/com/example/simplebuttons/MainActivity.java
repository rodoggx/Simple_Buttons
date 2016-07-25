package com.example.simplebuttons;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.SoundEffectConstants;
import android.view.View;
import android.widget.Button;

import java.sql.SQLOutput;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivityTAG" ;
    private Button Button1;
    private Button Button2;
    private Button Button3;
    private Button Button4;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button1 = (Button) findViewById(R.id.id_Button1);
        Button2 = (Button) findViewById(R.id.id_Button2);
        Button3 = (Button) findViewById(R.id.id_Button3);
        Button4 = (Button) findViewById(R.id.id_Button4);

        Button1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Button2.setVisibility(View.GONE);
                Button3.setVisibility(View.GONE);
            }
        });

        Button2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {

            }
        });

        Button3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {

            }
        });

        Button4.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Button1.setVisibility(View.VISIBLE);
                Button2.setVisibility(View.VISIBLE);
                Button3.setVisibility(View.VISIBLE);
            }
        });


    }
}