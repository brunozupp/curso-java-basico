package com.noveli.cursojava.aula11;

public class VariaveisPontoFlutuante {

    public static void main(String[] args) {

        double valorPassagem = 2.90;

        // Por padrão, o literal do ponto flutuante é o double, por isso que tem que colocar o f no float
        float valorTomate = 3.95f;

        float creditCardNumber = 1234_5678_9012_3456L;

        float pi = 3.14_15F;

        System.out.println("Valor da passagem = " + valorPassagem);
        System.out.println("Valor do tomate = " + valorTomate);
    }
}
