package com.example.CREACIONALES.BUILDER;

public class HamburguesaBuilder {
    protected String pan;
    protected String carne;
    protected String queso = "Ninguno";
    protected boolean tieneTocino = false;
    protected boolean tieneLechuga = false;
    protected boolean tieneTomate = false;
    protected String salsa = "Sin salsa";

    // Los elementos obligatorios se piden en el constructor del Builder
    public HamburguesaBuilder(String pan, String carne) {
        this.pan = pan;
        this.carne = carne;
    }

    public HamburguesaBuilder conQueso(String queso) {
        this.queso = queso;
        return this;
    }

    public HamburguesaBuilder conTocino() {
        this.tieneTocino = true;
        return this;
    }

    public HamburguesaBuilder conVegetales(boolean lechuga, boolean tomate) {
        this.tieneLechuga = lechuga;
        this.tieneTomate = tomate;
        return this;
    }

    public HamburguesaBuilder conSalsa(String salsa) {
        this.salsa = salsa;
        return this;
    }

    // El método que finalmente entrega el objeto real
    public Hamburguesa build() {
        return new Hamburguesa(this);
    }
}