package com.example.aluno.likbook_app;

import com.orm.SugarRecord;


public class Disciplina extends SugarRecord{

    private String nome;
    private String descricao;

    public Disciplina() {
    }

    public String getNome() {
        return nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
