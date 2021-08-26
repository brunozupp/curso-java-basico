package com.noveli.cursojava.aulainterface;

public class Mamifero implements Animal {

    @Override
    public void voar() {
        System.out.println(Constantes.URL_BLOG);
    }

    @Override
    public boolean consegueEngravidar() {
        return false;
    }
}
