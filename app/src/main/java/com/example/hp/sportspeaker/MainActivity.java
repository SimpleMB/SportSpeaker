package com.example.hp.sportspeaker;

import android.media.AudioManager;
import android.media.SoundPool;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private SoundPool sp;
    private int sound1, sound2, sound3, sound4, sound5, sound6;
    private ImageButton imgBoxing, imgKickboxing, imgJudo, imgKarate, imgAikido, imgTaekwondo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        sp = new SoundPool(2, AudioManager.STREAM_MUSIC, 0);
        sound1 = sp.load(getApplicationContext(),R.raw.boxing ,1);
        sound2 = sp.load(getApplicationContext(),R.raw.kickboxing ,1);
        sound3 = sp.load(getApplicationContext(),R.raw.judo ,1);
        sound4 = sp.load(getApplicationContext(),R.raw.karate ,1);
        sound5 = sp.load(getApplicationContext(),R.raw.aikido ,1);
        sound6 = sp.load(getApplicationContext(),R.raw.taekwondo ,1);


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

        switch (btnIsClicked.getId()){

            case R.id.imgBoxing:
                sp.play(sound1, 1.0f, 1.0f, 0,0,1f);
                break;

            case R.id.imgKickboxing:
                sp.play(sound2, 1.0f, 1.0f, 0,0,1f);
                break;

            case R.id.imgJudo:
                sp.play(sound3, 1.0f, 1.0f, 0,0,1f);
                break;

            case R.id.imgKarate:
                sp.play(sound4, 1.0f, 1.0f, 0,0,1f);
                break;

            case R.id.imgAikido:
                sp.play(sound5, 1.0f, 1.0f, 0,0,1f);
                break;

            case R.id.imgTeakwondo:
                sp.play(sound6, 1.0f, 1.0f, 0,0,1f);
                break;
        }

    }

}
