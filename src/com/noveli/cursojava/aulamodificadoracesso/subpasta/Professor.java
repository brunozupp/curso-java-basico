package com.noveli.cursojava.aulamodificadoracesso.subpasta;

import com.noveli.cursojava.aulamodificadoracesso.Pessoa;

public class Professor extends Pessoa {

    private String materia;

    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }

    public void testar() {
        // Não funciona pois o tipo de modificador de acesso é o default, sendo assim, Professor
        // não está na mesma pasta que Pessoa, por isso não consegue acessar o atributo diretamente
        //sobrenome = "teste";
    }
}
