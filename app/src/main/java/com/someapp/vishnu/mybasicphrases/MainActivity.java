package com.someapp.vishnu.mybasicphrases;

import android.media.AudioManager;
import android.media.MediaPlayer;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    final int[] sounds = {R.raw.doyouspeakenglish,
                    R.raw.goodevening,
                    R.raw.hello,
                    R.raw.howareyou,
                    R.raw.ilivein,
                    R.raw.mynameis,
                    R.raw.please,
                    R.raw.welcome};

    MediaPlayer mediaPlayer;

    public void onClick(View view) {

        int tag = Integer.parseInt(view.getTag().toString());

        mediaPlayer = MediaPlayer.create(this, sounds[tag]);
        mediaPlayer.start();

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
