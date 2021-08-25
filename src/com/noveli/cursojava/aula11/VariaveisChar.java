package com.noveli.cursojava.aula11;

public class VariaveisChar {

    public static void main(String[] args) {

        //char o = 'o';
        //char i = 'i';

        // Valor do unicode das letras
        char o = 111;
        char i = 105;

        char interrogacao = 0X003F;

        System.out.println(o + i); // printa 216
        System.out.println("" + o + i + interrogacao); // printa oi
    }
}
