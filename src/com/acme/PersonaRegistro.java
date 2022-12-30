package com.acme;

public record PersonaRegistro(String nombre, String apellido) {

    @Override
    public String toString() {
        //No pongas basura Carnal
        //System.out.println("Esta instruccion no sirve");
        return "%s %s".formatted(nombre,apellido);
    }
}
