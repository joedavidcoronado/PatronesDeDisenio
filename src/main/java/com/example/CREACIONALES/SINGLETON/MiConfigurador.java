package com.example.CREACIONALES.SINGLETON;

public class MiConfigurador {

    private static volatile MiConfigurador instancia;

    private MiConfigurador() {
        System.out.println("Instancia creada por única vez.");
    }

    public static MiConfigurador getInstancia() {
        if (instancia == null) {
            synchronized (MiConfigurador.class) {
                if (instancia == null) {
                    instancia = new MiConfigurador();
                }
            }
        }
        return instancia;
    }

    // Un método cualquiera para probar que funciona
    public void saludar() {
        System.out.println("¡Hola desde el Singleton!");
    }
}
