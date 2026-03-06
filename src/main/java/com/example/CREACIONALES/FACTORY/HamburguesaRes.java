package com.example.CREACIONALES.FACTORY;

public class HamburguesaRes implements Hamburguesa {
    @Override
    public void preparar() {
        System.out.println("Preparando: Carne de res, queso cheddar y tocino.");
    }
}