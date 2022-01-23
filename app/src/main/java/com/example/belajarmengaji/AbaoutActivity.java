package com.example.belajarmengaji;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.BitmapFactory;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;

import java.io.FileNotFoundException;
import java.io.InputStream;

public class AbaoutActivity extends AppCompatActivity {

    Button pindah;
    private static final int SELECT_PHOTO = 100;
    ImageView imageView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_abaout);

        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        final MediaPlayer suaraButton = MediaPlayer.create(this, R.raw.button);

        pindah = (Button) findViewById(R.id.btnCamera3);
        pindah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                suaraButton.start();
                Intent intent = new Intent(AbaoutActivity.this,MapsActivity.class);
                startActivity(intent);
            }
        });
        pindah = (Button) findViewById(R.id.btnCamera2);
        pindah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                suaraButton.start();
                Intent intent = new Intent(AbaoutActivity.this,ProfilActivity.class);
                startActivity(intent);
            }
        });
        imageView = findViewById(R.id.image_Camera);

    }

    public void openCamera(View view) {
        Intent intent = new Intent(Intent.ACTION_PICK);
        intent.setType("image/*");
        startActivityForResult(intent,SELECT_PHOTO);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data){
        super.onActivityResult(requestCode,resultCode,data);

        if(requestCode == SELECT_PHOTO){
            Uri selectImage = data.getData();
            InputStream inputStream = null;
            try {
                assert selectImage != null;
                inputStream = getContentResolver().openInputStream(selectImage);
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }

            BitmapFactory.decodeStream(inputStream);
            imageView.setImageURI(selectImage);
        }
    }
}
