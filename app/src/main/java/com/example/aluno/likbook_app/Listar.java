package com.example.aluno.likbook_app;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import com.orm.query.Select;

import java.util.List;

public class Listar extends AppCompatActivity {

    private List<Disciplina> list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listar);


        ListView listview = (ListView) findViewById(R.id.listaDis);
        List<Disciplina> disciplinas = Disciplina.listAll(Disciplina.class);

        try{
            list = Select.from(Disciplina.class).list();
            String nomesDisciplinas[] = new String[list.size()];
            for (int i = 0; i < list.size(); i++){
                nomesDisciplinas[i] = list.get(i).getNome();
            }

            ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, nomesDisciplinas);
            listview.setAdapter(adapter);
        } catch (Exception e){
            System.out.println("<=================================================>");
            e.printStackTrace();
            System.out.println("<=================================================>");
        }


        Toast.makeText(this, list.get(0).getNome(), Toast.LENGTH_SHORT).show();

    }

    }
