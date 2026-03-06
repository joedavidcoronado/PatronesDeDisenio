package com.example.COMPORTAMIENTO.COMMAND;

public class ComandoEncenderAire implements Comando {
    private AireAcondicionado aire;

    public ComandoEncenderAire(AireAcondicionado aire) { this.aire = aire; }

    public void ejecutar() { aire.encender(); }
    public void deshacer() { aire.apagar(); }
}
