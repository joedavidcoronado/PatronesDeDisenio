package com.example.CREACIONALES.FACTORY;

public class HamburguesaVegana implements Hamburguesa {
    @Override
    public void preparar() {
        System.out.println("Preparando: Medallón de lentejas, palta y tomate.");
    }
}