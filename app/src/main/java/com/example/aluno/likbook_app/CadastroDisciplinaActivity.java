package com.example.aluno.likbook_app;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.orm.SchemaGenerator;
import com.orm.SugarContext;
import com.orm.SugarDb;

public class CadastroDisciplinaActivity extends AppCompatActivity {

    private EditText nome;
    private EditText descricao;
    private Button save;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro_disciplina);

        SugarContext.init(getApplicationContext());
        SchemaGenerator schemaGenerator = new SchemaGenerator(this);
        schemaGenerator.createDatabase(new SugarDb(this).getDB());

        save = (Button) findViewById(R.id.save);
        nome = (EditText) findViewById(R.id.nome);
        descricao = (EditText) findViewById(R.id.descricao);

        save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String n = nome.getText().toString();
                String e = descricao.getText().toString();

                Disciplina p = new Disciplina();
                p.setNome(n);
                p.setDescricao(e);

                p.save();
                Toast.makeText(CadastroDisciplinaActivity.this, "Salvando Disicplina!", Toast.LENGTH_SHORT).show();

                nome.setText("");
                descricao.setText("");

            }
        });


        nome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        descricao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


            }
        });


    }
}
