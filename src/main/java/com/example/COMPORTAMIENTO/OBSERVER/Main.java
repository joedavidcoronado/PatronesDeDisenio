package com.example.COMPORTAMIENTO.OBSERVER;

public class Main {
    public static void main(String[] args) {
        CanalYouTube miCanal = new CanalYouTube("Tech con Gemini");

        Usuario user1 = new Usuario("Alice");
        Usuario user2 = new Usuario("Bob");
        Usuario user3 = new Usuario("Julian");

        miCanal.suscribir(user1);
        miCanal.suscribir(user2);

        // Al subir un video, ambos reciben la notificación automáticamente
        miCanal.subirVideo("Tutorial de Patrones de Diseño");
    }
}