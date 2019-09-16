package com.example.aluno.likbook_app;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.orm.SchemaGenerator;
import com.orm.SugarContext;
import com.orm.SugarDb;

public class CadastroPessoaActivity extends AppCompatActivity {

    private EditText nome;
    private EditText email;
    private Button save;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro_pessoa);

        SugarContext.init(getApplicationContext());
        SchemaGenerator schemaGenerator = new SchemaGenerator(this);
        schemaGenerator.createDatabase(new SugarDb(this).getDB());

        save = (Button) findViewById(R.id.save);
        nome = (EditText) findViewById(R.id.nome);
        email = (EditText) findViewById(R.id.email);

        save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(CadastroPessoaActivity.this, "Salvando Pessoa!", Toast.LENGTH_SHORT).show();
                String n = nome.getText().toString();
                String e = nome.getText().toString();

                Pessoa p = new Pessoa;
                p.setNome(n);
                p.setEmail(e);

                p.save();

                nome.setText("");
                email.setText("");

            }
        });


        nome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        email.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


            }
        });


    }
}
