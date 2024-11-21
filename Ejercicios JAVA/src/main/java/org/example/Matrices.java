package org.example;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Matrices {

    public void clase0() {

        int matriz [][] = new int [3][3]; //imprimir matrices.

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {


                System.out.print(matriz[i][j] + " ");

            }
            System.out.println("\n");
        }

        int matriz2 [][] = {{2,3,4,1},{5,10,32,6}}; //imprimir cada vector por separado.

        for (int fila [] : matriz2) {

            System.out.println(Arrays.toString(fila));

        }

        int matriz3 [][] = new int [3][3];

        Scanner entrada = new Scanner(System.in);

        for (int i = 0; i < matriz3.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {

                System.out.println("Introduce la posición (" + i + ", " + j + "): ");
                matriz3[i][j] = entrada.nextInt();

            }
        }

        System.out.println("Tu matriz queda: ");

        for (int i = 0; i < matriz3.length; i++) {
            for (int j = 0; j < matriz3[i].length; j++) {

                System.out.print(matriz3[i][j] + " ");

            }
            System.out.println("\n");
        }
    }

    public void clase1() {

        int m [][] = new int [6][6];

        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {


                if (i == j){
                    m[i][j] = 1;
                }
            }
        }


        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {


                if (m[i][j] == 1){
                    System.out.print("X ");
                }else {
                    System.out.print("- ");
                }
            }
            System.out.println("\n");
        }

        for (int i = 0; i < m.length; i++) {
            for (int j = m[i].length - 1; j >= 0; j--) {

                if (m[i][j] == 1){
                    System.out.print("X ");
                }else {
                    System.out.print("- ");
                }
            }
            System.out.println("\n");
        }
    }

    public void clase2 () {

        Random aleatorio = new Random();

        int matriz [][] = new int [2][4];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {

                matriz[i][j] = aleatorio.nextInt(10);

            }
        }

        for (int[] filas : matriz){

            for (int colmunas : filas){
                System.out.print(colmunas + " ");
            }
            System.out.println("\n");
        }

        final int numero = 8;

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {

                if (matriz[i][j] == numero){
                    System.out.println("Existe.");
                    return;
                }
            }
        }

        System.out.println("No existe.");

    } //Buscar un numero en una matriz e imprimir con for-each bonito.

    public void ejercicio1 () {

        Scanner entrada = new Scanner(System.in);

        int matriz [][] = new int [3][3];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {

                System.out.println("Introduce el numero para la posición (" + i + ", " + j + "): ");
                matriz[i][j] = entrada.nextInt();

            }
        }

        System.out.println("Introduce un numero a buscar. ");
        int numero = entrada.nextInt();
        boolean existe = true;

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {

                if (matriz[i][j] == numero){
                    System.out.println("El número " + numero + " se encuentra en la posición ("+ i + ", " + j + ")");
                }
            }
        }
        if (!existe){
            System.out.println("El numero introducido no existe.");
        }
    }

    public void ejercicio2 () {

        Random aleatorio = new Random();

        int filas = aleatorio.nextInt(5) + 1;
        int columnas = aleatorio.nextInt(5) + 1;

        int matriz [][] = new int [filas][columnas];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {

                matriz[i][j] = aleatorio.nextInt(10);

            }
        }

        System.out.println("MATRIZ:");

        for (int[] x : matriz){

            for (int y : x){
                System.out.print(y + " ");
            }
            System.out.println("\n");
        }

    //SUMA FILAS:

        System.out.println("SUMA DE FLIAS: ");

        int suma = 0;

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {

                suma += matriz[i][j];

            }
            System.out.println("FILA " + (i+1) + " = " + suma);
            suma = 0;
        }

        //SUMA DE COLUMNAS

        System.out.println("SUMA DE COLUMNAS: ");



        for (int i = 0; i < matriz[0].length; i++) {
            for (int j = 0; j < matriz.length; j++) {

                suma += matriz[j][i];

            }
            System.out.println("COLUMNA " + (i+1) + " = " + suma);
            suma = 0;
        }
    }

    public void ejercicio3 () {

        Scanner entrada = new Scanner(System.in);

        System.out.println("¿Cuántos alumnos tienes?");
        int alumnos = entrada.nextInt();

        System.out.println("¿Cuántas asignaturas tienes?");
        int asignaturas = entrada.nextInt();

        String matriz [][] = new String[Integer.parseInt(String.valueOf(asignaturas+1))][Integer.parseInt(String.valueOf(alumnos + 1))];

        for (int i = 0; i < matriz.length ; i++) {

            System.out.println("Introduce el nombre del " + (i+1) + "º estudiante.");
            matriz[i][0] = entrada.nextLine();
            
        }

    }
}
