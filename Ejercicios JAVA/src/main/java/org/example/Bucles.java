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
        int inicio = 0;

        for (int i = palabra.length() ; i > 0 ; i--){

            letra = palabra.charAt(inicio);
            inicio ++;

            System.out.println(letra);

        }
    }

    public void practica2 () {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Introduzca un ISBN: ");
        String ISBN = entrada.next();
        int inicio = 0;
        char digito;
        int suma = 0;
        int resultado;
        int num;
        int incognita = 0;
        int interrogacion = 0;

        while (ISBN.length() != 10){

            System.out.println("Formato erróneo. Es necesario un ISBN de 10 dígitos.");
            ISBN = entrada.next();

        }

        for (int i = 10; i > 0; i--){

            digito = ISBN.charAt(inicio);

            if (digito == 'X'){
                ISBN = ISBN.replace("X", "0");
                suma = suma + 10;
                continue;
            }

            if (digito == '?'){
                incognita = inicio;
                continue;
            }

            num = Integer.parseInt(String.valueOf(digito));
            inicio++;

            resultado = num*i;
            suma = resultado + suma;

        }
        System.out.println(incognita);

        for ( ; incognita > 0 ; interrogacion++){

            suma = suma + (incognita * interrogacion) ;
            if (suma % 11 == 0){
                System.out.println("El número restante es: " + interrogacion);
                break;
            }
        }

        if (suma % 11 == 0){
            System.out.println("El ISBN es válido.");
        } else
            System.out.println("El ISBN no es válido.");
    }
}