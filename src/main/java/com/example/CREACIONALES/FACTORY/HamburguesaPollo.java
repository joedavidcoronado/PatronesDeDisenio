package com.example.CREACIONALES.FACTORY;

public class HamburguesaPollo implements Hamburguesa {
    @Override
    public void preparar() {
        System.out.println("Preparando: Pollo crujiente, lechuga y mayonesa.");
    }
}