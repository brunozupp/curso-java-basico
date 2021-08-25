package com.noveli.cursojava.exercicioslista1;

import java.util.Scanner;

public class Exercicio14 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Tamanho do arquivo em MB: ");
        double tamanho = scanner.nextDouble();

        System.out.print("Velocidade em Mbps: ");
        double velocidade = scanner.nextDouble();

        double tempoEmSegundos = tamanho / (velocidade / 8);
        double tempoEmMinutos = tempoEmSegundos / 60;

        System.out.println();

        System.out.println("O tempo levado em minutos vai ser de: " + tempoEmMinutos);
    }
}
