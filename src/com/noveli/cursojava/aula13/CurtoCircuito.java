package com.noveli.cursojava.aula13;

public class CurtoCircuito {

    public static void main(String[] args) {

        boolean verdadeiro = true;
        boolean falso = false;

        // Mesmo que o valor do lado esquerdo seja falso, ele ainda analisa o lado direito da expressão
        boolean resultado1 = falso & verdadeiro;

        // Curto circuito, pois se a primeira parte da expressão for falso, ele nem analisa a outra
        boolean resultado2 = falso && verdadeiro;

        System.out.println(resultado1);
        System.out.println(resultado2);
    }
}
