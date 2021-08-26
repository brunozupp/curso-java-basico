package com.noveli.cursojava.aulamodificadoracesso;

public class Aluno extends Pessoa {

    private String curso;

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public void testar() {
        sobrenome = "teste";
        idade = 18;
    }
}
