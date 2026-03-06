package com.example.CREACIONALES.FACTORY;

public class Main {
    public static void main(String[] args) {
        Hamburguesa pedido1 = HamburguesaFactory.crearHamburguesa("pollo");
        pedido1.preparar();
    }
}
