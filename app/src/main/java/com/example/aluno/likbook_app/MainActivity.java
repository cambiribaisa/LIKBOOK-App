package com.example.aluno.likbook_app;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;


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

    private Button cad;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        cad = (Button) findViewById(R.id.cad);
        cad.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, CadastroDisciplinaActivity.class));

            }
        });

















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