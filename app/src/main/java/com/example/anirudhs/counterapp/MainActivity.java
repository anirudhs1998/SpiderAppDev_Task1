package com.example.anirudhs.counterapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Button;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    int clickCounter = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Button clickMe = (Button)findViewById(R.id.clickMe);
        Button resetButton = (Button)findViewById(R.id.resetButton);
        final TextView counterArea = (TextView)findViewById(R.id.counterArea);

        clickMe.setOnClickListener(
                new Button.OnClickListener(){
                    public void onClick(View v){

                        clickCounter++;
                        counterArea.setText(Integer.toString(clickCounter));
                    }
                }
        );

        resetButton.setOnClickListener(
                new Button.OnClickListener(){
                    public void onClick(View v){
                        clickCounter=0;
                        counterArea.setText(Integer.toString(clickCounter));
                    }
                }
        );
    }
}
