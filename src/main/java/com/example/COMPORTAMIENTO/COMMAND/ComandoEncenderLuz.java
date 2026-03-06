package com.example.COMPORTAMIENTO.COMMAND;

public class ComandoEncenderLuz implements Comando {
    private Luz luz;

    public ComandoEncenderLuz(Luz luz) { this.luz = luz; }

    public void ejecutar() { luz.encender(); }
    public void deshacer() { luz.apagar(); }
}

