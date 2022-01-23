package com.example.belajarmengaji;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageButton;

public class HarokatActivity extends AppCompatActivity {
    ImageButton pindah;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_harokat);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        final MediaPlayer suaraButton = MediaPlayer.create(this, R.raw.button);
        pindah = (ImageButton) findViewById(R.id.harokat_fathah);
        pindah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(HarokatActivity.this,HarokatFathahActivity.class);
                startActivity(intent);
                suaraButton.start();
            }
        });

        pindah = (ImageButton) findViewById(R.id.harokat_kasroh);
        pindah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(HarokatActivity.this,HarokatKasrohActivity.class);
                startActivity(intent);
                suaraButton.start();
            }
        });

        pindah = (ImageButton) findViewById(R.id.harokat_dhomah);
        pindah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(HarokatActivity.this,HarokatDhomahActivity.class);
                startActivity(intent);
                suaraButton.start();
            }
        });
        pindah = (ImageButton) findViewById(R.id.buttonback4);
        pindah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                suaraButton.start();
                Intent intent = new Intent(HarokatActivity.this,BelajarActivity.class);
                startActivity(intent);
            }
        });
        pindah = (ImageButton) findViewById(R.id.buttonAbout2);
        pindah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                suaraButton.start();
                Intent intent = new Intent(HarokatActivity.this,AbaoutActivity.class);
                startActivity(intent);
            }
        });
    }
}