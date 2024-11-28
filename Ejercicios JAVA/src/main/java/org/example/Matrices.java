package org.example;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

import static java.util.regex.Pattern.matches;

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

    public void practica1 () {

        Scanner entrada  = new Scanner(System.in);

        int filas = 0;
        int columnas = 0;
        String busqueda = "";
        boolean error = true;
        boolean error2 = true;


        //Pedimos filas y columnasd e la matriz y controlamos que los datos no sean erroneos.
        while (error) {
            try {

                System.out.println("Introduce el número de filas: ");
                filas = entrada.nextInt();

                if (filas <= 0){
                    System.err.println("ERROR. Introduce valores mayores que 0.");
                    continue;
                }

                System.out.println("Introduce el número de columnas: ");
                columnas = entrada.nextInt();

                if (columnas <= 0){
                    System.err.println("ERROR. Introduce valores mayores que 0.");
                    continue;
                }

                error = false;

            } catch (InputMismatchException e) {
                System.err.println("ERROR. Valores no validos...");
                entrada.nextLine();

            }
        }

        //Creamos la matriz con el tamaño indicado por el usiatio
        String matriz [][] = new String[filas][columnas];

        //La rellenamos con los valores indicados fila por fila
        for (int i = 0; i < matriz.length; i++) {

            String valor_fila[];
            System.out.println("Introduce la fila " + (i + 1) + ": ");
            String texto_fila = entrada.next();
            boolean formato = texto_fila.matches("[a-zA-Z]+");

            valor_fila = texto_fila.split("");

            if (!formato) {
                System.err.println("ERROR, introduce datos válidos (a-z,A-Z).");
                i--;
                continue;
            }

            if (valor_fila.length != filas) {
                System.err.println("ERROR. La cantidad de valores introducidos es incorrecta.");
                return;
            }

            for (int j = 0; j < matriz[i].length; j++) {

                matriz[i][j] = valor_fila[j];

            }
        }

        while (error2) {
            System.out.println("Introduce la palabra que quieres buscar: ");

            //Introducimos la palabra
            busqueda = entrada.next();

            //Comprobamos que contenga solo letras con .matches
            if (!busqueda.matches("[a-zA-Z]+")) {
                System.err.println("ERROR. La palabra debe contener solo letras.");
            } else {
                error2 = false;
            }
        }

        //Pasabmos la pablabra a vector para poder recorrerlo mas adelante
        String palabra [] = busqueda.split("");

        //Con este bucle imprimimos la matriz por pantalla
        for (String[] x : matriz){

            for (String y : x){
                System.out.print(y + " ");
            }
            System.out.println("\n");
        }

        //Comenzamos a buscar.

        //Con los dos bucles recorremos cada posicion de la matriz de derecha a izquierda comenzando en (0,0)
        for (int i = 0; i < matriz.length; i++) {
            //Controlamos que no se salga del limite de la matriz con la condicion de este.
            for (int j = 0; j <= matriz[i].length - palabra.length; j++) {

                //Si encuentra la primera letra de la palabra indicaca comienza a buscar.
                if (matriz[i][j].equalsIgnoreCase(palabra[0])) {

                    //HORIZONTAL DE DERECHA A IZQUIERDA
                    //Solo busca si la palabra cabe hacia la derecha.
                    if (j + palabra.length <= matriz[i].length) {

                        boolean encontrada = true;

                        //En caso de que quepa, comparamos con la palabra originar gracias al bucle de abajo.
                        for (int k = 0; k < palabra.length; k++) {

                            //En caso de que alguna letra no coincida controlamos con un booleano y salimos del bucle.
                            if (!matriz[i][j + k].equalsIgnoreCase(palabra[k])) {
                                encontrada = false;
                                break;
                            }

                        }

                        //En caso de coincidir el booleano se mantiene con su valor inicial y muestra donde comienza la palabra.
                        if (encontrada) {

                            System.out.println("Palabra encontrada hacia la derecha! Inicio: (" + i + ", " + j + ")");

                        }
                    }

                    //BUSQUEDA HACIA ABAJO.

                    //Comienza solo si la palabra cabe en esta dirrección.
                    if (i + palabra.length <= matriz.length) {

                        boolean encontrada = true;

                        //Una vez mas comparamos letra a letra la palabra indicada para ver si es correcta.
                        for (int k = 0; k < palabra.length; k++) {

                            if (!matriz[i + k][j].equalsIgnoreCase(palabra[k])) {

                                //Si no coindcide alguna letra sale del bucle y deja de comparar.
                                encontrada = false;
                                break;

                            }
                        }

                        //En caso de si encontrarla la variable se mantiene e indica donde inicia la palabra.
                        if (encontrada) {

                            System.out.println("Palabra encontrada hacia abajo! Inicio: (" + i + ", " + j + ")");

                        }
                    }
                }

                //EXTRA
                //Busqueda de la palabra en diaghonal abajo-derecha
                if (i + palabra.length <= matriz.length && j + palabra.length <= matriz[i].length) { //Busqueda de la palabra en diaghonal abajo-derecha
                    boolean coincide = true;

                    for (int k = 0; k < palabra.length; k++) {

                        if (!matriz[i + k][j + k].equalsIgnoreCase(palabra[k])) {

                            coincide = false;
                            break;

                        }
                    }

                    if (coincide) {

                        System.out.println("Palabra encontrada diagonal derecha-abajo! Inicio: (" + i + ", " + j + ")");

                    }
                }
            }
        }
    }
}