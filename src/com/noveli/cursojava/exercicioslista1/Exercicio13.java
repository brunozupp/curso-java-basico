package com.noveli.cursojava.exercicioslista1;

import java.util.Scanner;

public class Exercicio13 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Quanto você ganha por hora: ");
        double preco = scanner.nextDouble();

        System.out.print("Digite o número de horas trabalhadas no mês: ");
        int horas = scanner.nextInt();

        double salarioBruto = preco * horas;

        double impostoDeRenda = salarioBruto * 0.11;

        double inss = salarioBruto * 0.08;

        double sindicato = salarioBruto * 0.05;

        double salarioLiquido = salarioBruto - impostoDeRenda - inss - sindicato;

        System.out.println();
        System.out.println("Salário Bruto = R$ " + salarioBruto);
        System.out.println("INSS = R$ " + inss);
        System.out.println("Sindicato = R$ " + sindicato);
        System.out.println("Imposto de renda = R$ " + impostoDeRenda);
        System.out.println("Salário líquido = R$ " + salarioLiquido);
    }
}
