package com.example.CREACIONALES.PROTOTYPE;

public class Main {
    public static void main(String[] args) {
        // 1. Obtenemos un clon del prototipo "clasica"
        HamburguesaPrototype pedido1 = HamburguesaStore.getHamburguesa("clasica");

        // 2. Personalizamos el clon sin afectar al modelo original
        pedido1.setExtras("Queso, tomate y MUCHO TOCINO");

        // 3. Verificamos
        System.out.print("Pedido Especial: ");
        pedido1.mostrarInfo();

        // El prototipo original en la Store sigue intacto
        System.out.print("Modelo Base en Store: ");
        HamburguesaStore.getHamburguesa("clasica").mostrarInfo();
    }
}