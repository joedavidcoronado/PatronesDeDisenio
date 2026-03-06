package com.example.COMPORTAMIENTO.COMMAND;

public class Main {
    public static void main(String[] args) {

        Luz sala = new Luz();
        AireAcondicionado aire = new AireAcondicionado();

        // Los comandos que envuelven las acciones
        Comando luzOn = new ComandoEncenderLuz(sala);
        Comando aireOn = new ComandoEncenderAire(aire);

        // El invocador (Control Remoto)
        ControlRemoto control = new ControlRemoto();

        // Programamos el botón para la luz
        control.setComando(luzOn);
        control.presionarBoton(); // Imprime: Luz encendida.

        // Programamos el mismo botón para el aire
        control.setComando(aireOn);
        control.presionarBoton(); // Imprime: Aire acondicionado en marcha.
    }
}