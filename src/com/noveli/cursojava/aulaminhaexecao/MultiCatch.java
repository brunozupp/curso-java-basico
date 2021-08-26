package com.noveli.cursojava.aulaminhaexecao;

public class MultiCatch {

    public static void main(String[] args) {

        int[] numero = {4,8, 5, 16,32, 21,64,128};
        int[] denom = {2,0,4,8,0, 2, 4};

        for (int i = 0; i < numero.length; i++) {
            try {

                if(numero[i] % 2 != 0) {
                    throw new DivisaoNaoExataException(numero[i],denom[i]);
                }

                System.out.println(numero[i] + "/" + denom[i] + " = " + (numero[i]/denom[i]));
            } catch (ArithmeticException e) {
                System.out.println("Erro ao dividir por zero");
            } catch (DivisaoNaoExataException e) {
                System.out.println(e);
            }
            catch(Throwable e) { // Exception genérica
                System.out.println("Aconteceu um erro");
            }
        }
    }
}
