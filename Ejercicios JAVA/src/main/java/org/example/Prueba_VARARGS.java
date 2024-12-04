package org.example;

import java.util.Arrays;

public class Prueba_VARARGS {

    public static void principal () {

        String [] nombres = prueba("Pepe", "Miguel", "David", "Ismael", "Cesar", "Alejandra");

        System.out.println(Arrays.toString(nombres));

    }

    public static String [] prueba (String... nombres){

        for (int i = 0; i < nombres.length; i++) {

            System.out.println((i + 1) + "º Alumno: " + nombres[i]);

        }

        return nombres;
    }

}
