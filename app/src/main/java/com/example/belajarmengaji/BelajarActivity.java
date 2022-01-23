package com.example.belajarmengaji;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageButton;

public class BelajarActivity extends AppCompatActivity {
    ImageButton pindah;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_belajar);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        final MediaPlayer suaraButton = MediaPlayer.create(this, R.raw.button);
        pindah = (ImageButton) findViewById(R.id.menu_hijaiyah1);
        pindah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(BelajarActivity.this,HijaiyahActivity.class);
                startActivity(intent);
                suaraButton.start();
            }
        });

        pindah = (ImageButton) findViewById(R.id.menu_harokat);
        pindah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(BelajarActivity.this,HarokatActivity.class);
                startActivity(intent);
                suaraButton.start();
            }
        });

        pindah = (ImageButton) findViewById(R.id.menu_tanwin);
        pindah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(BelajarActivity.this,TanwinActivity.class);
                startActivity(intent);
                suaraButton.start();
            }
        });
        pindah = (ImageButton) findViewById(R.id.buttonBack9);
        pindah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                suaraButton.start();
                Intent intent = new Intent(BelajarActivity.this,MainActivity.class);
                startActivity(intent);
            }
        });
        pindah = (ImageButton) findViewById(R.id.buttonAbout1);
        pindah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                suaraButton.start();
                Intent intent = new Intent(BelajarActivity.this,AbaoutActivity.class);
                startActivity(intent);
            }
        });
    }
}