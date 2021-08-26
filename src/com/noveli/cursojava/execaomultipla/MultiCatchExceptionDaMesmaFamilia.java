package com.noveli.cursojava.execaomultipla;

public class MultiCatchExceptionDaMesmaFamilia {

    public static void main(String[] args) {

        int[] numero = {4,8,16,32,64,128};
        int[] denom = {2,0,4,8,0};

        for (int i = 0; i < numero.length; i++) {
            try {
                System.out.println(numero[i] + "/" + denom[i] + " = " + (numero[i]/denom[i]));
            } catch (ArithmeticException | ArrayIndexOutOfBoundsException e) { // Exceptions da mesma familia
                System.out.println("Erro ao dividir por zero " + e.getClass());
            } catch(Throwable e) { // Exception genérica
                System.out.println("Aconteceu um erro");
            }
        }
    }
}
