package com.my.mw_rbg_app;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.widget.RelativeLayout;
import android.widget.SeekBar;

public class MainActivity extends AppCompatActivity {

    SeekBar redSeekBar;
    SeekBar greenSeekBar;
    SeekBar blueSeekBar;

    int red = 255;
    int green = 255;
    int blue = 255;

    RelativeLayout main;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        main = findViewById(R.id.mainId);
        main.setBackgroundColor(Color.rgb(red, green, blue));
        redSeekBar = findViewById(R.id.red);
        greenSeekBar = findViewById(R.id.green);
        blueSeekBar = findViewById(R.id.blue);

        redSeekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                red = seekBar.getProgress();
                main.setBackgroundColor(Color.rgb(red, green, blue));
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });
        greenSeekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                green = seekBar.getProgress();
                main.setBackgroundColor(Color.rgb(red, green, blue));
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });
        blueSeekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                blue = seekBar.getProgress();
                main.setBackgroundColor(Color.rgb(red, green, blue));
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });
    }
}