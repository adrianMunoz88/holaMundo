package com.acme;

public class HolaMundo {
    public static void main(String[] args) {

        System.out.println("Hola Mundo");
        Mensaje msj = new Mensaje();
        String nombre = msj.solicitarDatos("Escribe tu nombre");
        String apellido = msj.solicitarDatos("Escribe tu apellido");
        Persona p1 = new Persona(nombre,apellido);
        msj.saludar(p1);


    }
}
