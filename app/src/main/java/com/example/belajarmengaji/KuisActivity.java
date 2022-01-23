package com.example.belajarmengaji;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageButton;

public class KuisActivity extends AppCompatActivity {
    ImageButton pindah;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kuis);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        final MediaPlayer suaraButton = MediaPlayer.create(this, R.raw.button);
        pindah = (ImageButton) findViewById(R.id.menu_kuis_hijaiyah);
        pindah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(KuisActivity.this, KuisTebakHijaiyahActivity.class);
                startActivity(intent);
                suaraButton.start();

            }
        });

        pindah = (ImageButton) findViewById(R.id.menu_kuis_harokat);
        pindah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(KuisActivity.this, KuisTebakHarokatActivity.class);
                startActivity(intent);
                suaraButton.start();

            }
        });

        pindah = (ImageButton) findViewById(R.id.menu_kuis_tanwin);
        pindah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(KuisActivity.this, KuisTebakTanwinActivity.class);
                startActivity(intent);
                suaraButton.start();

            }
        });

        pindah = (ImageButton) findViewById(R.id.menu_kuis_bacaan);
        pindah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(KuisActivity.this, KuisTebakBacaanActivity.class);
                startActivity(intent);
                suaraButton.start();
            }
        });
        pindah = (ImageButton) findViewById(R.id.buttonback10);
        pindah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                suaraButton.start();
                Intent intent = new Intent(KuisActivity.this,MainActivity.class);
                startActivity(intent);
            }
        });
        pindah = (ImageButton) findViewById(R.id.buttonAbout4);
        pindah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                suaraButton.start();
                Intent intent = new Intent(KuisActivity.this,AbaoutActivity.class);
                startActivity(intent);
            }
        });
    }
}