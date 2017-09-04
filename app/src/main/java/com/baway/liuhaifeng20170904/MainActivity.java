package com.baway.liuhaifeng20170904;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
private RoundProgressBar roundProgressBar;
    private Button button;
    private Button button2;
    private Button button3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        roundProgressBar= (RoundProgressBar) findViewById(R.id.progress);
        button= (Button) findViewById(R.id.button);
        button2= (Button) findViewById(R.id.button2);
        button3= (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                roundProgressBar.setTextColor(Color.BLUE);
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                roundProgressBar.setCricleProgressColor(Color.BLACK);
            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                roundProgressBar.setCricleProgressColor(Color.CYAN);
            }
        });
    }


}
