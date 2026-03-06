package com.example.COMPORTAMIENTO.OBSERVER;
import java.util.ArrayList;
import java.util.List;

public class CanalYouTube {
    private List<Suscriptor> suscriptores = new ArrayList<>();
    private String nombreCanal;

    public CanalYouTube(String nombre) {
        this.nombreCanal = nombre;
    }

    public void suscribir(Suscriptor s) {
        suscriptores.add(s);
    }

    public void desuscribir(Suscriptor s) {
        suscriptores.remove(s);
    }

    public void subirVideo(String titulo) {
        System.out.println(nombreCanal + " ha subido: " + titulo);
        notificar(titulo);
    }

    private void notificar(String titulo) {
        for (Suscriptor s : suscriptores) {
            s.actualizar(titulo);
        }
    }
}