package com.example.CREACIONALES.PROTOTYPE;

import java.util.HashMap;
import java.util.Map;

public class HamburguesaStore {
    private static Map<String, HamburguesaPrototype> prototipos = new HashMap<>();

    static {
        // Guardamos los modelos base
        prototipos.put("clasica", new HamburguesaClasica());
    }

    public static HamburguesaPrototype getHamburguesa(String tipo) {
        // IMPORTANTE: Retornamos un CLON, no el original
        return prototipos.get(tipo).clonar();
    }
}