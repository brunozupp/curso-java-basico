package com.noveli.cursojava.aulamodificadoracesso;

public class Pessoa {

    private String nome;
    String sobrenome;
    protected int idade;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void rir() {
        System.out.println("hahaha");
    }
}
