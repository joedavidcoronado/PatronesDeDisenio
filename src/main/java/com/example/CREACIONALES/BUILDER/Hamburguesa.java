package com.example.CREACIONALES.BUILDER;

public class Hamburguesa {
    private final String pan;
    private final String carne;
    private final String queso;
    private final boolean tieneTocino;
    private final boolean tieneLechuga;
    private final boolean tieneTomate;
    private final String salsa;

    // El constructor es privado: solo el Builder puede usarlo
    protected Hamburguesa(HamburguesaBuilder builder) {
        this.pan = builder.pan;
        this.carne = builder.carne;
        this.queso = builder.queso;
        this.tieneTocino = builder.tieneTocino;
        this.tieneLechuga = builder.tieneLechuga;
        this.tieneTomate = builder.tieneTomate;
        this.salsa = builder.salsa;
    }

    @Override
    public String toString() {
        return "Hamburguesa [Pan: " + pan + ", Carne: " + carne + ", Queso: " + queso +
                ", Tocino: " + tieneTocino + ", Lechuga: " + tieneLechuga +
                ", Tomate: " + tieneTomate + ", Salsa: " + salsa + "]";
    }
}
