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


    private ImageButton camera;
    private ImageView foto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if (ActivityCompat.checkSelfPermission(this, Manifest.permission.CAMERA) != PackageManager.PERMISSION_GRANTED){
            ActivityCompat.requestPermissions(this, new String[]{Manifest.permission.CAMERA}, 0);
        }

        foto = (ImageView)  findViewById(R.id.imageViewFoto);
        findViewById(R.id.buttonCamera).setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                tirarFoto();

            }

        });


        btgeo = (ImageButton)  findViewById(R.id.btGeo);
        findViewById(R.id.btGeo).setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {


                //abrir tela geografia




            }

        });








    }

    public void tirarFoto() {
        Intent intent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
        startActivityForResult(intent, 1);
    }


    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {

        if(requestCode == 1 && requestCode == RESULT_OK) {
            Bundle extras = data.getExtras();
            Bitmap imagem = (Bitmap) extras.get("data");
            foto.setImageBitmap(imagem);
        }
        super.onActivityResult(requestCode, resultCode, data);

    }


//https://www.youtube.com/watch?v=1oyvdqc_QZg



}