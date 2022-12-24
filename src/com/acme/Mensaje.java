package com.acme;

import java.util.Scanner;

public class Mensaje {
    public String solicitarDatos(String mensaje){
        System.out.println("mensaje = " + mensaje);
        Scanner scn = new Scanner(System.in);
        return scn.nextLine();
    }

    public void saludar(String mensaje) {
        System.out.printf("Hola %s, bienvenido a java", mensaje);
    }
}
