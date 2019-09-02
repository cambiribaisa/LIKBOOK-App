package com.example.aluno.likbook_app;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.provider.MediaStore;
import android.support.v4.app.ActivityCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    private ImageButton btgeo;
    private ImageButton btFisi;
    private ImageButton btPort;
    private ImageButton btMat;
    private ImageButton btHist;
    private ImageButton btIngles;
    private ImageButton btSoc;
    private ImageButton btFia;
    private ImageButton btInfo;
    private ImageButton btBio;
    private ImageButton btQuim;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        btgeo = (ImageButton)  findViewById(R.id.btGeo);
        findViewById(R.id.btGeo).setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                startActivity(new Intent(MainActivity.this, GeoActivity.class));
                //abrir tela geografia




            }

        });

        btFisi = (ImageButton)  findViewById(R.id.btFisi);
        findViewById(R.id.btFisi).setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                startActivity(new Intent(MainActivity.this, FisicaActivity.class));
                //abrir tela geografia




            }

        });

    }





//https://www.youtube.com/watch?v=1oyvdqc_QZg



}