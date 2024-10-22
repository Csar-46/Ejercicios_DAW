package org.example;

import java.util.Scanner;

public class Bucles {

    public void ejercicio1 () {

        String psw = "CrazyFrog";
        String psw_usuario;

        Scanner entrada = new Scanner(System.in);

        do {

            System.out.println("Introduce tu contraseña:");
            psw_usuario = entrada.next();

            if (psw_usuario.equals(psw)) break;

            System.out.println("ERROR! Contraseña incorrecta.");

        }while (!psw_usuario.equals(psw));

        System.out.println("¡BIENVENIDO!");

    }

    public void ejercicio2() {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Introduce un número cualquiera: ");
        int num = entrada.nextInt();

        while (num >= 1){

            System.out.println(num);
            num--;

        }
    }

    public void ejercicio3 () {

        for ( int i = 1 ; i<=50 ; i++ ){

            int resultado = i%3;

            if (resultado == 0) {

                System.out.println(i);

            }
        }
    }

    public void ejercicio4 () {

        String palabra;
        char letra;

        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduce una palabra: ");
        palabra = entrada.next();

        for (int i = palabra.length() ; i <= palabra.length() ; i++){

            int inicio = 0;

            letra = palabra.charAt(inicio);

            inicio ++; //¡¡¡¡CORREGIR ESTO!!!!

            System.out.println(letra);

        }
    }
}
