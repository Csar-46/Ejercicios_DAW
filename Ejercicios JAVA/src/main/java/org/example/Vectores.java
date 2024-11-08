package org.example;

import java.util.*;

//ESTRUCTURA PARA IMPRIMIR UN VECTOR BONITO:

// System.out.println("El vector original es: ");
// System.out.print("[");
// for (int i = 0; i < vector.length; i++) {
//
//      if (i == vector.length-1){
//
//          System.out.print(" " + vector[i] + " ");
//
//      }else {
//
//          System.out.print(" " + vector[i] + ", ");
//      }
//
//}
//System.out.println("]");

public class Vectores {

    public void ejercicio0() {

        int vector[]; //Crer el vector con el tipo de variable que vamos a usar

        vector = new int[7]; //hemo declarado qe el vector va a tener 7 espacios, del 0 al 6, para poder usarlo.

        vector[2] = 7;
        vector[5] = vector[2] + 4;

        System.out.println(vector[2] + " " + vector[5]);

        System.out.print("[");

        for (int i = 0; i < vector.length; i++) { //Siempre menor por que si no se sale del rango del vector
            System.out.print(" " + vector[i] + ", ");

        }

        System.out.println("]");

        String palabras[] = new String[3];
        palabras[0] = "Pepe";

        System.out.print("[");
        for (int i = 0; i < palabras.length; i++) {
            System.out.print(" " + palabras[i] + ", ");

        }

        System.out.println("]");

    }

    public void ejercicio1() {

        Random aleatorio = new Random();
        int suma = 0;

        int vector[] = new int[8];

        for (int i = 0; i < vector.length; i++) { //Bucle para rellenar el vector

            vector[i] = aleatorio.nextInt(501);
            suma += vector[i];

        }

        System.out.println("La suma de los elementos es: " + suma);

    }

    public void ejercicio2() {

        Scanner entrada = new Scanner(System.in);
        int vector[] = new int[5];
        int valor = 1;

        for (int i = 0; i < vector.length; i++) {

            System.out.println("Introduce el " + valor + "º número del vector.");
            vector[i] = entrada.nextInt();
            valor++;

        }

        System.out.println("El vector original es: ");
        System.out.print("[");
        for (int i = 0; i < vector.length; i++) {

            if (i == vector.length-1){

                System.out.print(" " + vector[i] + " ");

            }else {

                System.out.print(" " + vector[i] + ", ");
            }

        }
        System.out.println("]");

        int tam_mitad = vector.length / 2;
        int aux;

        for (int i = 0; i < tam_mitad; i++) {

            aux = vector[i];
            vector [i] = vector[vector.length -1 -i];
            vector [vector.length -1 -i] = aux;

        }


        System.out.println("El vector invertido es:");
        System.out.print("[");
        for (int i = 0; i < vector.length ; i++) {

            if (i == vector.length-1){

                System.out.print(" " + vector[i] + " ");

            }else {

                System.out.print(" " + vector[i] + ", ");

            }

        }
        System.out.println("]");
    }

    public void ejercicio3() {

        Random aleatorio = new Random();
        Scanner entrada = new Scanner(System.in);

        int num;
        int contador = 0;

        int vector[] = new int[100];

        System.out.println("Ingresa un numero para buscar [0,100]...");
        num = entrada.nextInt();

        for (int i = 0; i < vector.length; i++) { //Bucle para rellenar el vector

            vector[i] = aleatorio.nextInt(101);

        }

        for (int i = 0; i < vector.length; i++) {

            if (num == vector[i]) {
                contador++;
            }

        }

        System.out.println("El número " + num + " aparece " + contador + " veces en el array.");

    }

    public void ejercicio4() {

        Scanner entrada = new Scanner(System.in);
        int vector[] = {4,6,7,2,10};
        int vector2 [] = new int[vector.length - 1];
        int num;

        System.out.println("Ingresa el índice a eliminar: ");
        num = entrada.nextInt();

        for (int i = 0; i < vector.length - 1; i++) {

            if (i < num){

                vector2[i] = vector [i];

            }else{

                vector2[i] = vector [i + 1];

            }

        }


        System.out.println("El array resultante es: ");
        System.out.print("[");
        for (int i = 0; i < vector2.length; i++) {

            System.out.print(" " + vector2[i] + ", ");

        }
        System.out.println("]");

    }

    public void ejercicio5() {


        int vector[] = {3, 5, 2, 1, 4,};
        int aux = vector[0];


        System.out.println("El vector original es: ");
        System.out.print("[");
        for (int i = 0; i < vector.length; i++) {

            System.out.print(" " + vector[i] + ", ");

        }
        System.out.println("]");

        for (int i = 0; i < vector.length; i++) {

            if (i == 0) {

                vector[i] = aux;

            } else {
                vector[i] = vector[i++];

            }
        }

        System.out.println("El vector reordenado es:");
        System.out.print("[");
        for (int i = 0; i < vector.length; i++) {

            System.out.print(" " + vector[i] + ", ");

        }
        System.out.println("]");

    }

    public void vectores_evo () {

        String palabras [] = {"Paco", "Pepe", "Juan", "Maria"};

        for (String i : palabras){

            System.out.println(i);

        }

        String texto_vector = Arrays.toString(palabras);
        System.out.println(texto_vector);

    }

    public void practica1 () {

        Scanner entrada = new Scanner(System.in);
        Random aleatorio = new Random();
        int primero = aleatorio.nextInt(7);
        int valor1 = 0;
        int valor2 = 0;
        int suma1 = 0;
        int suma2 = 0;
        String potencia1 = "";
        String potencia2 = "";
        int samurai1 = 0;
        int samurai2 = 0;
        int equipo1 = 0;
        int equipo2 = 0;
        int empate = 0;


        System.out.println(primero);

        System.out.println("!! EQUIPO 1 ¡¡");

        while (suma1 != 30) {

            System.out.print("Introduce la potencia de los samurais separada por espacios: ");
            potencia1 = entrada.nextLine();

            while ( (Integer.parseInt(potencia1) <1 || Integer.parseInt(potencia1) > 24) ) {
                System.out.println("ERROR. La potencia del samurai debe estar entre 1 y 24. Introducela de nuevo: ");
                potencia1 = entrada.nextLine();
            }


            String Vequipo1 [] = potencia1.split (" ");

            for (int i = 0; i < Vequipo1.length ; i++) {

                valor1 = Integer.parseInt(Vequipo1 [i]);
                suma1 += valor1;

            }

            if (suma1 != 30) {
                if (Vequipo1.length != 7) {

                    System.out.println("ERROR. El equipo debe contar con 7 samurais exactos.");
                    suma1 = 0;
                    continue;

                }
                System.out.println("ERROR. La potencia total no suma 30.");
                suma1 = 0;
            }
        }
        String Vequipo1 [] = potencia1.split (" ");
        System.out.println("Equipo 1 listo para el combate.");



        System.out.println("!! EQUIPO 2 ¡¡");

        while (suma2 != 30) {


            System.out.print("Introduce la potencia de los samurais separada por espacios: ");
            potencia2 = entrada.nextLine();

            while ( (Integer.parseInt(potencia2) <1 || Integer.parseInt(potencia2) > 24) ) {
                System.out.println("ERROR. La potencia del samurai debe estar entre 1 y 24. Introducela de nuevo: ");
                potencia2 = entrada.nextLine();
            }

            String Vequipo2 [] = potencia2.split (" ");



            for (int i = 0; i < Vequipo2.length ; i++) {

                valor2 = Integer.parseInt(Vequipo2 [i]);
                suma2 = suma2 + valor2;

            }

            if (suma2 != 30) {

                if (Vequipo2.length != 7) {
                    System.out.println("ERROR. El equipo debe contar con 7 samurais exactos.");
                    suma2 = 0;
                    continue;
                }

                System.out.println("ERROR. La potencia total no suma 30.");
                suma2 = 0;
            }
        }
        String Vequipo2 [] = potencia2.split (" ");
        System.out.println("Equipo 2 listo para el combate.");

        System.out.println("!QUE COMIENCE EL COMBATE¡");

        System.out.println("La batalla empieza con el Samurai " + (primero + 1) + ".");


        for (int i = 0; i < Vequipo1.length -1; i++) {

            if (equipo1 >=4 || equipo2 >=4){
                break;
            }

            if (primero == 7){
                primero = 0;
            }

            samurai1 = Integer.parseInt(Vequipo1 [primero]);
            samurai2 = Integer.parseInt(Vequipo2 [primero]);

            System.out.print("Samurai " + (primero + 1) + ".");
            if (samurai1 > samurai2){

                System.out.println(" Gana el aquipo 1. " + samurai1 + " vs " + samurai2);
                Vequipo2 [primero] = String.valueOf(0);
                equipo1++;
                primero++;

            } else if (samurai1 < samurai2) {

                System.out.println(" Gana el aquipo 2. " + samurai1 + " vs " + samurai2 );
                Vequipo1 [primero] = String.valueOf(0);
                equipo2++;
                primero++;

            } else {
                System.out.println(" Los samurais se han matado entre si. La ronda es un empate. " + samurai1 + " vs " + samurai2);
                Vequipo1 [primero] = String.valueOf(0);
                Vequipo2 [primero] = String.valueOf(0);
                empate++;
                primero++;
            }
        }

        if (equipo1 > equipo2) {
            System.out.println("!EQUIPO 1 GANA¡ Equipo 2 ha tenido " + equipo1 + " bajas.");
        } else if (equipo1 < equipo2) {
            System.out.println("!EQUIPO 2 GANA¡ Equipo 1 ha tenido " + equipo2 + " bajas.");
        }else {
            System.out.println("!INEDITO¡!HEMOS TENIDO UN EMPATE¡ Parece que todos los samurais eran igual de poderosos.");
        }
    }
}
