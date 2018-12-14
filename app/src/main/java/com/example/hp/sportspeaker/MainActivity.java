package com.example.hp.sportspeaker;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private MediaPlayer mediaPlayer;
    private ImageButton imgBoxing, imgKickboxing, imgJudo, imgKarate, imgAikido, imgTaekwondo;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imgBoxing = findViewById(R.id.imgBoxing);
        imgKickboxing = findViewById(R.id.imgKickboxing);
        imgJudo = findViewById(R.id.imgJudo);
        imgKarate = findViewById(R.id.imgKarate);
        imgAikido = findViewById(R.id.imgAikido);
        imgTaekwondo = findViewById(R.id.imgTeakwondo);


        imgBoxing.setOnClickListener(MainActivity.this);
        imgKickboxing.setOnClickListener(MainActivity.this);
        imgJudo.setOnClickListener(MainActivity.this);
        imgKarate.setOnClickListener(MainActivity.this);
        imgAikido.setOnClickListener(MainActivity.this);
        imgTaekwondo.setOnClickListener(MainActivity.this);


    }

    @Override
    public void onClick(View btnIsClicked) {
        String imgTagSound = btnIsClicked.getTag().toString();

        switch (btnIsClicked.getId()){

            case R.id.imgBoxing:

                playSound(imgTagSound);

                break;

            case R.id.imgKickboxing:

                playSound(imgTagSound);

                break;

            case R.id.imgJudo:

                playSound(imgTagSound);

                break;

            case R.id.imgKarate:

                playSound(imgTagSound);

                break;

            case R.id.imgAikido:

                playSound(imgTagSound);

                break;

            case R.id.imgTeakwondo:

                playSound(imgTagSound);

                break;
        }

    }
    private void playSound (String imgTagSound) {

        mediaPlayer = MediaPlayer.create(this, getResources().getIdentifier(imgTagSound, "raw", getPackageName()));
        mediaPlayer.start();

    }
}
