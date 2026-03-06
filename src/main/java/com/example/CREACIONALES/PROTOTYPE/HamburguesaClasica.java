package com.example.CREACIONALES.PROTOTYPE;

public class HamburguesaClasica extends HamburguesaPrototype {
    public HamburguesaClasica() {
        this.pan = "Blanco con sésamo";
        this.carne = "Res 200g";
        this.extras = "Queso y tomate";
    }

    @Override
    public HamburguesaPrototype clonar() {
        return new HamburguesaClasica();
        // En un caso real, aquí copiarías todos los atributos al nuevo objeto
    }
}