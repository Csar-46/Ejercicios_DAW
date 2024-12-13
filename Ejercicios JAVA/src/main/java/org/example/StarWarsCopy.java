package org.example;

import javax.sound.midi.Soundbank;
import java.util.Scanner;


public class StarWarsCopy {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada = new java.util.Scanner(System.in);
        while (principal()) {
        }
    }


    public static boolean principal () {

        Scanner entrada = new Scanner(System.in);

        if (!entrada.hasNext()) {

            return false;

        } else {

            entrada.nextLine();

            String [] direcciones = direcciones();

            String [][] pantalla = new String[5][direcciones.length + 2];

            rellenarBordes(pantalla);

            rellenarPantalla(pantalla, direcciones);

            imprimirPantalla(pantalla);

            return true;
        }
    }




    public static String [] direcciones () {

        String cadena = comprobarDirecciones();

        return cadena.toUpperCase().split("");
    }

    public static String comprobarDirecciones () {

        Scanner entrada = new Scanner(System.in);
        String cadena = entrada.next();

        if (!cadena.toUpperCase().matches("[ISB]+")){

            return String.valueOf("0");

        }else if (cadena.length() > 100){

            return String.valueOf("0");

        }

        return cadena;
    }

    public static String [][] rellenarBordes (String [][] pantalla) {

        for (int i = 0; i < pantalla.length; i++) {
            for (int j = 0; j < pantalla[i].length; j++) {

                if (i == 0 || i == pantalla.length - 1 || j == 0 || j == pantalla[i].length - 1) {

                    pantalla[i][j] = String.valueOf('#');

                } else {

                    pantalla[i][j] = String.valueOf(' ');

                }
            }
        }

        return pantalla;
    }

    public static void rellenarPantalla (String [][] pantalla, String [] direcciones) {

        int alturaActual = 3;
        int columnaActual = 1;

        for (int k = 0; k < direcciones.length; k++) {
            String direccion = direcciones[k];

            if (direccion.equals("I")) {

                pantalla[alturaActual][columnaActual] = "_";

            } else if (direccion.equals("S")) {
                if (alturaActual == 0){
                    return;
                }

                pantalla[alturaActual][columnaActual] = "/";
                alturaActual--;

            } else if (direccion.equals("B")) {
                alturaActual++;

                if (alturaActual == 4){

                    return;

                }

                pantalla[alturaActual][columnaActual] = "\\";

            }

            columnaActual++;

        }
    }

    public static void imprimirPantalla (String [][] pantalla) {

        for (int i = 0; i < pantalla.length; i++) {

            for (int j = 0; j < pantalla[i].length; j++) {
                System.out.print(pantalla[i][j]);
            }

            System.out.println();

        }
    }


}







