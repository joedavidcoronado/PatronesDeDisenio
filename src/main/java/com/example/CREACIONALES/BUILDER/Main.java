package com.example.CREACIONALES.BUILDER;

public class Main {
    public static void main(String[] args) {
        Hamburguesa hamburguesa = new HamburguesaBuilder(
                "masa",
                "termino medio")
                .conVegetales(false, true)
                .conTocino().conSalsa("si").build();
    }
}