package com.noveli.cursojava.aulasobrecargametodo;

public class Calculadora {

    public int soma(int num1, int num2) {
        return num1 + num2;
    }

    public double soma(double num1, double num2) {
        return num1 + num2;
    }

    public double soma(int num1, double num2) {
        return num1 + num2;
    }

    public double soma(double num1, int num2) {
        return num1 + num2;
    }

    public int soma(int num1, int num2, int num3) {
        return num1 + num2 + num3;
    }
}
