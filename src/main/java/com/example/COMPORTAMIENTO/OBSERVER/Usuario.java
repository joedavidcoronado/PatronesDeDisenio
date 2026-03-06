package com.example.COMPORTAMIENTO.OBSERVER;

public class Usuario implements Suscriptor {
    private String nombre;

    public Usuario(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public void actualizar(String videoTitulo) {
        System.out.println("Hola " + nombre + ", nueva notificación: " + videoTitulo);
    }
}