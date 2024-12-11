package org.example;

import java.util.Scanner;

public class Reutilizables {

    //CASO 1
    public class solution { // Asume fichero llamado solution.java

        static Scanner entrada;

        public static void casoDePrueba() {

            // TU CÓDIGO AQUÍ

        } // casoDePrueba

        public static void main(String[] args) {

            entrada = new java.util.Scanner(System.in);

            int numCasos = entrada.nextInt();
            for (int i = 0; i < numCasos; i++)
                casoDePrueba();
        } // main
    } // class solution

    //CASO 2
    // Asume fichero llamado solution.java
    public class solution2 {

        static  Scanner entrada;

        public static boolean casoDePrueba() {
            //leer caso de prueba
            if (casoDePrueba())
            return false;
        else {
                // CÓDIGO PRINCIPAL AQUÍ
                return true;
            }
        } // casoDePrueba

        public static void main(String[] args) {
            entrada = new java.util.Scanner(System.in);
            while (casoDePrueba()) {
            }
        } // main

    } // class solution

    //CASO 3
    // Asume fichero llamado solution.java
    public class solution3 {

        static Scanner entrada;

        public static boolean casoDePrueba() {
            if (!entrada.hasNext())
                return false;
            else {
                // CÓDIGO PRINCIPAL AQUÍ
                // (incluyendo la lectura del caso de prueba)
                return true;
            }
        } // casoDePrueba

        public static void main(String[] args) {
            entrada = new java.util.Scanner(System.in);
            while (casoDePrueba()) {
            }
        } // main

    } // class solution

    //intro();
    public static void intro () {

        System.out.println("⠀   ______________________________________________________________________\n" +
                "  |:..                                                      ``:::%%%%%%HH|\n" +
                "  |%%%:::::..                S T A R    W A R S                `:::::%%%%|\n" +
                "  |HH%%%%%:::::....._______________________________________________::::::|\n" +
                "\n" +
                "   __________________________________\n" +
                "  |:                           ``::%H|\n" +
                "  |%:.       César Portero        `:%|\n" +
                "  |H%::..___________________________:|\n" +
                "\n" +
                "                        .                      .             +        .\n" +
                "     .    __ _o|                        .\n" +
                "         |  /__|===--        .                                       <=>\n" +
                "         [__|______~~--._                      .                .      .\n" +
                "   .    |\\  `---.__:====]-----...,,_____                *      .         ` -\n" +
                "        |[>-----|_______<----------_____;::===--\n" +
                "        |/_____.....-----'''~~~~~~~                        .               .\n" +
                "   +               .                                   1ºDAW. PROGRAMACIÓN\n" +
                "\n" +
                "------------------------------------------------\n");

    }

}
