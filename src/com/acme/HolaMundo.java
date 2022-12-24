package com.acme;

public class HolaMundo {
    public static void main(String[] args) {

        System.out.println("Hola Mundo");
        Mensaje msj = new Mensaje();
        String mensaje = msj.solicitarDatos("Escribe tu mensaje");
        msj.saludar(mensaje);

    }
}
