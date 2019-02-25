package com.example.afil2001.synthesizer;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class SynthesizerActivity extends AppCompatActivity {

    private static final String TAG =
            SynthesizerActivity.class.getName();
    private Button mEButton;
    private Button button2;

    private MediaPlayer mpE;
    private MediaPlayer mpF;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_synthesizer);

        mEButton = (Button) findViewById(R.id.eButton);
        button2 = (Button) findViewById(R.id.button2);
        mpE = MediaPlayer.create(this, R.raw.scalee);
        mpF = MediaPlayer.create(this, R.raw.scalef);
    }

    public void onButton1Click ( View v ){
        Log.i(TAG, "Button 1 Clicked");
        mpE.start();
    }

    public void onButton2Click ( View v) {
        Log.i(TAG, "Button 2 Clicked");
        mpF.start();
    }

}



