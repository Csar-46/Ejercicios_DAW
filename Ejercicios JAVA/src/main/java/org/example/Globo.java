package org.example;

import java.util.Scanner;

public class Globo {

    public static void glovo (){

        imprimirMenu();

        int opcion = opcionUsuario();

        comprobarOpcion(opcion);

    }

    public static void imprimirMenu () {

        System.out.println("BIENVENIDO A GLOBO APP");
        System.out.println("¿Qué quieres comprar?");
        System.out.println("    > 1. COMIDA");
        System.out.println("    > 2. BEBIDA");
        System.out.println("    > 3. SALIR");

    }

    public static int opcionUsuario () {

        Scanner entrada = new Scanner(System.in);

        return entrada.nextInt();
    }

    public static void comprobarOpcion (int opcion) {

        String pedido = "";

        if (opcion == 1) {

            pedido = comida();

        } else if (opcion == 2) {

            pedido = bebida();

        } else if (opcion == 3) {

            System.exit(0);

        }else{
            System.err.println("LA OPCIÓN NO ES VÁLIDA!");
        }

        System.out.println("Has pedido: " + pedido);

    }

    public static String comida () {

        Scanner entrada = new Scanner(System.in);

        System.out.println("¿Qué quieres tomar?");

        return entrada.next();
    }

    public static String bebida () {

        int edad = pedirEdad();
        String eleccion = "";

        if (edad >= 18){

            eleccion = comida();

        }else{
            System.err.println("NO PUEDES COMPRAR, ERES MENOR!");
            System.exit(0);
        }

        return eleccion;
    }

    public static int pedirEdad () {

        Scanner entrada = new Scanner(System.in);

        System.out.println("¿Qué edad tienes?");

        return entrada.nextInt();
    }

}
