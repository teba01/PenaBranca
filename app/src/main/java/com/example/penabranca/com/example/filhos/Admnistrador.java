package com.example.penabranca.com.example.filhos;

import com.example.penabranca.com.example.helper.ConfiguracaoFirebase;
import com.google.firebase.database.DatabaseReference;

public class Admnistrador {

    String senha, nome, email, telefone, id;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public Admnistrador() {
    }

    public void salvar() {

        DatabaseReference firebaseRef = ConfiguracaoFirebase.getFirebase();
        DatabaseReference usuarioRef = firebaseRef
                .child("admnistrador")
                .child(getId());
        usuarioRef.setValue(this);

    }

}
