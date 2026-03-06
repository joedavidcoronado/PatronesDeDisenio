package com.example.CREACIONALES.FACTORY;

public class HamburguesaFactory {

    public static Hamburguesa crearHamburguesa(String tipo) {
        if (tipo == null) return null;

        return switch (tipo.toLowerCase()) {
            case "res" -> new HamburguesaRes();
            case "pollo" -> new HamburguesaPollo();
            case "vegana" -> new HamburguesaVegana();
            default -> throw new IllegalArgumentException("Tipo de hamburguesa desconocido: " + tipo);
        };
    }
}