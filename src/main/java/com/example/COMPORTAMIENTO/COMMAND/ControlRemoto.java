package com.example.COMPORTAMIENTO.COMMAND;

public class ControlRemoto {
    private Comando boton;

    public void setComando(Comando comando) {
        this.boton = comando;
    }

    public void presionarBoton() {
        boton.ejecutar();
    }
}