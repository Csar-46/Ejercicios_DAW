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
    } //Imprimir X en la diagonal de una matriz.

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
    } //Buscador de variables en una matriz.

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
    } //For-each para imprimir matrices l principio.

    public void extra () {

        Random aleatorio = new Random();
        Scanner entrada = new Scanner(System.in);

        int filaA;
        int columnaA;
        int filaB;
        int columnaB;

        System.out.println("Introduce cuantas filas quieres en la matriz A:");
        filaA = entrada.nextInt();

        System.out.println("Introduce cuantas columnas quieres en la matriz A:");
        columnaA = entrada.nextInt();
        int A [][] = new int [filaA][columnaA];

        System.out.println("Introduce cuantas filas quieres en la matriz B:");
        filaB = entrada.nextInt();

        System.out.println("Introduce cuantas columnas quieres en la matriz B:");
        columnaB = entrada.nextInt();
        int B [][] = new int [filaB][columnaB];

        int M [][] = new int [filaA][columnaA];

        if (filaA!= filaB || columnaA != columnaB){
            System.out.println("Las dimensiones no son iguales...");
            return;
        }

        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[i].length; j++) {

                A[i][j] = aleatorio.nextInt(20) + 1;

            }

        }

        for (int i = 0; i < B.length; i++) {
            for (int j = 0; j < B[i].length; j++) {

                B[i][j] = aleatorio.nextInt(20) + 1;

            }
        }


        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[i].length; j++) {

                if (A[i][j] > B[i][j]){
                    M[i][j] = A[i][j];
                } else if (B[i][j] > A[i][j]) {
                    M[i][j] = B[i][j];
                }else {
                    M[i][j] = 0;
                }
            }
        }

        System.out.println("MATRIZ A:");
        for (int[] x : A){

            for (int y : x){
                System.out.print(y + " ");
            }
            System.out.println("\n");
        }

        System.out.println("MATRIZ B:");
        for (int[] x : B){

            for (int y : x){
                System.out.print(y + " ");
            }
            System.out.println("\n");
        }

        System.out.println("MATRIZ M:");
        for (int[] x : M){

            for (int y : x){
                System.out.print(y + " ");
            }
            System.out.println("\n");
        }

    } //Comparación de valores para crear una matriz con los mayores enre 2 matrices.

    public void ejercicio3 () {

        Scanner entrada = new Scanner(System.in);
        String alumno = "";
        String asignatura = "";
        String nota = "";

        System.out.println("¿Cuántos alumnos tienes?");
        int alumnos = entrada.nextInt();

        System.out.println("¿Cuántas asignaturas tienes?");
        int asignaturas = entrada.nextInt();

        String matriz [][] = new String[alumnos + 1][asignaturas + 1];
        matriz[0][0] = "ESTUDIANTES";

        for (int i = 1; i < matriz.length; i++) {

            System.out.println("Introduce el nombre del " + i + "º estudiante.");
            alumno = entrada.next();
            matriz[i][0] = alumno;
            
        }

        for (int i = 1; i < matriz.length; i++) {

            System.out.println("Introduce el nombre de la " + i + "º asignatura.");
            asignatura = entrada.next();
            matriz[0][i] = asignatura;

        }

        for (int i = 1; i < matriz.length; i++) {
            for (int j = 1; j < matriz[i].length; j++) {
                System.out.println("Inserta la nota de " + matriz[i][0] + " para " + matriz[0][j]);
                nota = entrada.next();
                matriz[i][j] = nota;
            }
        }

        for (String[] x : matriz){

            for (String y : x){
                System.out.print(y + " ");
            }
            System.out.println("\n");
        }

        float media_alumno = 0;

        for (int i = 1; i < matriz.length; i++) {
            for (int j = 1; j < matriz[i].length; j++) {

                media_alumno += Integer.parseInt(matriz[i][j]);

            }
            System.out.println("La media del alumno " + matriz[i][0] + " es " + (media_alumno/asignaturas));
            media_alumno = 0;
        }

        int media_asignatura = 0;
        for (int i = 1; i < matriz[0].length ; i++) {
            for (int j = 1; j < matriz.length; j++) {

                media_asignatura += Integer.parseInt(matriz[i][j]);

            }

            System.out.println("La media de " + matriz[0][i] + " es " + (media_asignatura/alumnos));

        }

    }

    public void vectores_matriz () {

        int vector [] = {3,4,5,3,1};

        int matriz [][] = new int [3][vector.length];

        for (int i = 0; i < vector.length; i++) {

            matriz[2][i] = vector[i];

        }

        System.out.println(Arrays.toString(vector));

        for (int[] x : matriz){

            for (int y : x){
                System.out.print(y + " ");
            }
            System.out.println("\n");
        }
    }

    public void vectores_matriz2 () {

        Scanner entrada  = new Scanner(System.in);

        String matriz [][] = new String[10][10];

        for (int i = 0; i < matriz.length; i++) {

            System.out.println("Introduce la fila " + i + ": ");
            String valor_fila [] = entrada.next().split("");

            for (int j = 0; j < matriz[i].length; j++) {

                matriz[i][j] = valor_fila[j];

            }
        }

        for (String[] x : matriz){

            for (String y : x){
                System.out.print(y + " ");
            }
            System.out.println("\n");
        }

    }
}
