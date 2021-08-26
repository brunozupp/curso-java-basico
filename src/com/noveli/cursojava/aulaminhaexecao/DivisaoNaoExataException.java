package com.noveli.cursojava.aulaminhaexecao;

public class DivisaoNaoExataException extends Exception {

    private final int num;
    private final int dem;

    public DivisaoNaoExataException(int num, int dem) {
        this.num = num;
        this.dem = dem;
    }

    @Override
    public String toString() {
        return "Resultado de " + num + "/" + dem + " não é um inteiro!";
    }
}
