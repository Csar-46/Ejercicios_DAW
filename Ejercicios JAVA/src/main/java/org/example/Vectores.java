package org.example;

import java.util.Random;
import java.util.Scanner;
import java.util.SortedMap;

public class Vectores {

    public void ejercicio0 () {

        int vector []; //Crer el vector con el tipo de variable que vamos a usar

        vector = new int[7]; //hemo declarado qe el vector va a tener 7 espacios, del 0 al 6, para poder usarlo.

        vector [2] = 7;
        vector [5] = vector[2] + 4;

        System.out.println(vector [2] + " " + vector[5]);

        System.out.print("[");

        for (int i = 0 ; i < vector.length ; i++) { //Siempre menor por que si no se sale del rango del vector
            System.out.print(" " + vector [i] + ", ");

        }

        System.out.println("]");

        String palabras [] = new String[3];
        palabras [0] = "Pepe";

        System.out.print("[");
        for (int i = 0 ; i < palabras.length ; i++) {
            System.out.print(" " + palabras [i] + ", ");

        }

        System.out.println("]");

    }

    public void ejercicio1 () {

        Random aleatorio = new Random();
        int suma = 0;

        int vector [] = new int [8];

        for (int i = 0; i < vector.length; i++) { //Bucle para rellenar el vector

            vector [i] = aleatorio.nextInt(501);
            suma += vector[i];

        }

        System.out.println("La suma de los elementos es: " + suma);

    }

    public void ejercicio2 () {

        Scanner entrada = new Scanner(System.in);
        int vector [] = new int[5];
        int valor = 1;

        for (int i = 0; i < vector.length; i++) {

            System.out.println("Introduce el " + valor + "º número del vector.");
            vector [i] = entrada.nextInt();

        }


        System.out.println("El vector original es: ");
        System.out.print("[");
        for (int i = 0; i < vector.length; i++) {

            System.out.print(" " + vector [i] + ", ");

        }
        System.out.println("]");


        System.out.println("El vector invertido es:");
        System.out.print("[");
        for (int i = vector.length -1; i >= 0 ; i--) {

            System.out.print(" " + vector [i] + ", ");

        }
        System.out.println("]");
    }

    public void ejercicio3 () {

        Random aleatorio = new Random();
        Scanner entrada = new Scanner(System.in);

        int num;
        int contador = 0;

        int vector [] = new int [100];

        System.out.println("Ingresa un numero para buscar [0,100]...");
        num = entrada.nextInt();

        for (int i = 0; i < vector.length; i++) { //Bucle para rellenar el vector

            vector [i] = aleatorio.nextInt(101);

        }

        for (int i = 0; i < vector.length; i++) {

            if (num == vector[i]) {
                contador++;
            }

        }

        System.out.println("El número " + num + " aparece " + contador + " veces en el array.");

    }

    public void ejercicio4 () {

        Scanner entrada = new Scanner(System.in);
        int vector [] = new int[5];
        int vector2 [] = new int[5];
        int valor = 1;
        int num;

        for (int i = 0; i < vector.length; i++) {

            System.out.println("Introduce el " + valor + "º número del vector.");
            vector [i] = entrada.nextInt();

        }

        System.out.println("Ingresa el índice a eliminar: ");
        num = entrada.nextInt();

        for (int i = 0; i < vector.length; i++) {

            if (num == vector[i]){
                continue;
            }

            vector2 [i] = vector [i];

        }


        System.out.println("El array resultante es: ");
        System.out.print("[");
        for (int i = 0 ; i < vector.length ; i++) {

            System.out.print(" " + vector2 [i] + ", ");

        }
        System.out.println("]");

    }
}
