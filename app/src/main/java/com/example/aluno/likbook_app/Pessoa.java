package com.example.aluno.likbook_app;

import com.orm.SugarRecord;


public class Pessoa extends SugarRecord{

    private String nome;
    private String email;

    public Pessoa() {
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
