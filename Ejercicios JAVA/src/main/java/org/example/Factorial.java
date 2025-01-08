package org.example;
import java.util.Scanner;

public class Factorial {

    static Scanner teclado = new Scanner(System.in);

    public static int factorial(int numero) {
        int factorial = 1;

        for (int i = numero; i >= 1; i--) {
            factorial *= i;
        }

        return factorial;
    }

    public static int factorial_recursivo(int numero){

        if (numero == 0 || numero == 1){
            return 1;
        }

        return numero * factorial_recursivo(numero - 1);
    }

    public static void main (String[] args){
        System.out.print("Introduce un número: ");
        int num = teclado.nextInt();
        int fact = factorial_recursivo(num);
        System.out.println(fact);
    }
}




