package org.example;

import java.util.Scanner;

public class N_Bucleless {

    public static void numeros(int n, int cont){

        if (cont <= n) {

            System.out.print(cont + " ");
            numeros(n, cont+1);

        }
    }

    public static void main(String[] args){

        Scanner entrada = new Scanner(System.in);

        System.out.println("Introduce el numero hasta el que quieras contar:");

        int n = entrada.nextInt();
        int cont = 1;

        numeros(n, cont);
    }

}
