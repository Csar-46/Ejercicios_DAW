package org.example;

import java.util.Scanner;

public class N_Bucleless {

    static int n;

    public static void numeros(int cont){

        if (cont <= n) {

            System.out.print(cont + " ");
            numeros(cont+1);

        }
    }

    public static void main(String[] args){

        Scanner entrada = new Scanner(System.in);

        System.out.println("Introduce el numero hasta el que quieras contar:");

        n = entrada.nextInt();

        numeros(1);
    }

}
