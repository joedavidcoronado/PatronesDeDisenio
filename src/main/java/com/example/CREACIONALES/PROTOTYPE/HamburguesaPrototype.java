package com.example.CREACIONALES.PROTOTYPE;

public abstract class HamburguesaPrototype implements Cloneable {
    protected String pan;
    protected String carne;
    protected String extras;

    // Método para clonar
    public abstract HamburguesaPrototype clonar();

    // Getters y Setters para modificar el clon
    public void setExtras(String extras) { this.extras = extras; }

    public void mostrarInfo() {
        System.out.println("Hamburguesa [Pan: " + pan + ", Carne: " + carne + ", Extras: " + extras + "]");
    }
}