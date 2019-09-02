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


public class GeoActivity extends AppCompatActivity {

    private ImageButton camera1;
    private ImageView foto1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_geo);


        if (ActivityCompat.checkSelfPermission(this, Manifest.permission.CAMERA) != PackageManager.PERMISSION_GRANTED){
            ActivityCompat.requestPermissions(this, new String[]{Manifest.permission.CAMERA}, 0);
        }

        foto1 = (ImageView)  findViewById(R.id.foto1);
        findViewById(R.id.camera1).setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                tirarFoto();

            }

        });


        //btgeo = (ImageButton)  findViewById(R.id.btGeo);
        //findViewById(R.id.btGeo).setOnClickListener(new View.OnClickListener() {

        //  @Override
        //public void onClick(View v) {


        //abrir tela geografia




        //}

        //});


    }

    public void tirarFoto() {
        Intent intent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
        startActivityForResult(intent, 1);
    }


    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {

        //if(requestCode == 1 && requestCode == RESULT_OK) {
        if(requestCode == 1) {
            Bundle extras = data.getExtras();
            Bitmap imagem = (Bitmap) extras.get("data");
            foto1.setImageBitmap(imagem);
        } else {
            Toast.makeText(this, "Houve um problema para tirar a foto, tente novamente!", Toast.LENGTH_LONG).show();
        }
        super.onActivityResult(requestCode, resultCode, data);

    }




    }

