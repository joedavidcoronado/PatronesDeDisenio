package com.example.CREACIONALES.SINGLETON;

public class Main {
    public static void main(String[] args) {

        MiConfigurador config = MiConfigurador.getInstancia();
        //Ejemplo de que funciona
        config.saludar();

    }
}