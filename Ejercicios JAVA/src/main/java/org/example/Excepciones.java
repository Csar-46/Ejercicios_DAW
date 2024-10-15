package org.example;

import java.util.Scanner;

public class Excepciones {

    public void excepciones () {

        int dividendo = 0;
        int divisor_entero = 0;
        int resultado = 0;

        Scanner entrada = new Scanner(System.in);

        System.out.println("Dividendo: ");

        if (entrada.hasNextInt()){

            dividendo = entrada.nextInt();

        }else{

            System.out.println("Has introducido un formato incorrecto. No es un numero.");

        }

        System.out.println("Divisor; ");
        String divisor = entrada.next();

        try{

            divisor_entero = Integer.parseInt(divisor);

        }catch (NumberFormatException e1){

            System.out.println("ERROR. El divisor introducido no es un numero." + e1.getMessage());

        }

        try {

            resultado = dividendo / divisor_entero;

        }catch (ArithmeticException e2){

            System.out.println("ERROR. No se puede dividir entre 0." + e2.getMessage());

        }

        System.out.println("Resultado " + resultado);

    }
}
