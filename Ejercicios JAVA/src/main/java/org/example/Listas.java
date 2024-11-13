package org.example;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Listas {

    public void ejercicio0 () {

        String colores [] = {"Amarillo", "Azul", "Rojo", " Naranja"};
        String color = "Negro";

        boolean existe = Arrays.asList(colores).contains(color);

        if (existe){
            System.out.println("El color " + color + " existe en el vextor");
        }else{
            System.out.println("El color " + color + " no existe en el vextor");
        }

    }

    public void ruleta () {

        Scanner entrada = new Scanner(System.in);
        Random aleatorio = new Random();

        String colores [] = {"Rojo", "Negro"};

        Integer num [] = new Integer [37];

        for (int i = 0; i < num.length; i++) {

            num[i] = i;

        }

        String pares [] = {"Par", "Impar"};

        System.out.println("Introduce un numero entre [0-36]...");
        int numero = entrada.nextInt();

        boolean numero_existe = Arrays.asList(num).contains(numero);

        if (!numero_existe){

            System.out.println("ERROR. El número no es válido..");
            return;

        }else {

            if(numero!=0){
                System.out.println("Introduce un color [Rojo o Negro]...");
                String color = entrada.next();

                boolean color_existe = Arrays.asList(colores).contains(color);

                if (!color_existe){

                    System.out.println("ERROR. El color no es valido");
                    return;

                }else {

                    System.out.println("Introduce la opción: [Par o Impar...]");
                    String par = entrada.next();
                    boolean par_existe = Arrays.asList(pares).contains(par);

                    if (!par_existe){

                        System.out.println("ERROR. La opción par/impar no es valida");
                        return;

                    }
                }
            }
        }

        int num_random = num[aleatorio.nextInt(37)];
        String color_sorteo = colores[aleatorio.nextInt(2)];
        String par_sorteo;

        if (num_random%2 == 0){
            par_sorteo = "Par";
        }else{
            par_sorteo = "Impar";
        }

        System.out.println("El ganador es el: " + num_random + " " + color_sorteo + " " + par_sorteo);

        if ((numero != 0) && (num_random == numero) && color_sorteo.equals(colores) && par_sorteo.equals(pares)) {
            System.out.println("¡HAS GANADO!");
        } else if (numero != 0 && color_sorteo.equals(colores)) {
            System.out.println("Has acertado el color.");
        } else if (numero != 0 && par_sorteo.equals(pares)) {
            System.out.println("Has acertado si es par / impar.");
        } else if (numero == num_random && numero != 0) {
            System.out.println("Has acertado el número.");
        } else if (numero == 0 && num_random == 0) {
            System.out.println("¡HAS GANADO TODO Y LOS DEMÁS PARA CASITA PELAOS!");
        } else {
            System.out.println("Has perdido.");
        }
    }
}
