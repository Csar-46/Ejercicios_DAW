package org.example;

import java.util.Random;
import java.util.Scanner;

public class Aleatorio {

    public void ejercicio1(){

        Random random = new Random();

        int random1 = random.nextInt(6) + 1;
        int random2 = random.nextInt(6) + 1;
        int suma = random1 + random2;

        System.out.println("El primer número es: " + random1);
        System.out.println("El segundo número es: " + random2);
        System.out.println("La suma de ambos es: " + suma);
    }

    public void ejercicio2 () {

        Random random = new Random();

        String caracteres = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        int longitud = 10;
        String contrasenya = "";

        int aleatorio;

        for (int i = 0 ; i < longitud ; i++){

            aleatorio = random.nextInt(caracteres.length());
            contrasenya += (caracteres.charAt(aleatorio));

        }
        System.out.println("Tu contraseña segura es: " + contrasenya);
    }

    public void ejercicio3 () {

        Random random = new Random();
        Scanner entrada = new Scanner(System.in);

        int max = 1;
        int min = 2;

        while (max<min){

            System.out.println("Introduce el maximo: ");
            max = entrada.nextInt();
            System.out.println("Introduce el minimo: ");
            min = entrada.nextInt();

        }
        System.out.println("Introduce la cantidad de números que quieres entre el máximo y el mánimo");
        int cantidad = entrada.nextInt();

        for (int i = 0 ; i < cantidad ; i++){

            int aleatorio = random.nextInt((max - min + 1) + min);
            System.out.println(aleatorio);

        }
    }

    public void ejercicio4 (){

        Random random = new Random();

        String caracteres = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        int longitud = random.nextInt(2) + 6;
        String contrasenya = "";

        int aleatorio;

        for (int i = 0 ; i < longitud ; i++){

            aleatorio = random.nextInt(caracteres.length());
            contrasenya += (caracteres.charAt(aleatorio));

        }
        System.out.println("Tu contraseña segura es: " + contrasenya);
    }
}
