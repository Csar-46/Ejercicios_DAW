package org.example;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {

        Random aleatorio = new Random();
        Scanner entrada = new Scanner(System.in);

        System.out.println("¿Cara o Cruz?");
        String opcion = entrada.next();

        String resultado = sorteo(); //Llamamos a la funcion sorteo.

        compararResultado(opcion, resultado); //Llamamos al resultado

    }

    public static void compararResultado (String opcion, String resultado){

        if (resultado.equalsIgnoreCase(opcion)){
            System.out.println("HAS GANADO!!");
        }else
            System.err.println("HAS PERDIDO!!");

    }
    
    public static String sorteo (){

        Random aleatorio = new Random();
        String []  opciones = {"Cara", "Cruz"};

        String resultado = opciones[aleatorio.nextInt(2)];
        System.out.println(" > HA SAILDO " + resultado.toUpperCase() + " <");



        return resultado;
        //return opciones[aleatorio.nextInt(2)]; PODRIA SER ASI TAMBIEN, SIN CREAR VARIABLE DIRECTAMENTE.
    }

}