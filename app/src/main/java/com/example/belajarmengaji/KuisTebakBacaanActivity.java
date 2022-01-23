package com.example.belajarmengaji;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageButton;

public class KuisTebakBacaanActivity extends AppCompatActivity {
    ImageButton pindah;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kuis_tebak_bacaan);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        final MediaPlayer suaraButton = MediaPlayer.create(this, R.raw.button);
        pindah = (ImageButton) findViewById(R.id.kuis_bacaan_hijaiyah);
        pindah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(KuisTebakBacaanActivity.this, KuisTebakBacaanHijaiyhaActivity.class);
                startActivity(intent);
                suaraButton.start();

            }
        });

        pindah = (ImageButton) findViewById(R.id.kuis_bacaan_harokat);
        pindah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(KuisTebakBacaanActivity.this, KuisTebakBacaanHarokatActivity.class);
                startActivity(intent);
                suaraButton.start();

            }
        });

        pindah = (ImageButton) findViewById(R.id.kuis_bacaan_tanwin);
        pindah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(KuisTebakBacaanActivity.this, KuisTebakBacaanTanwinActivity.class);
                startActivity(intent);
                suaraButton.start();

            }
        });
        pindah = (ImageButton) findViewById(R.id.buttonAbout6);
        pindah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                suaraButton.start();
                Intent intent = new Intent(KuisTebakBacaanActivity.this,AbaoutActivity.class);
                startActivity(intent);
            }
        });
        pindah = (ImageButton) findViewById(R.id.back15);
        pindah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                suaraButton.start();
                Intent intent = new Intent(KuisTebakBacaanActivity.this,KuisActivity.class);
                startActivity(intent);
            }
        });
    }
}