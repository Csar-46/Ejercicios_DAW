package org.example;

import java.util.Scanner;

public class Bucles {

    public void ejercicio1 () {

        String psw = "CrazyFrog";
        String psw_usuario;

        Scanner entrada = new Scanner(System.in);

        do {

            System.out.println("Introduce tu contraseña:");
            psw_usuario = entrada.next();

            if (psw_usuario.equals(psw)) break;

            System.out.println("ERROR! Contraseña incorrecta.");

        }while (!psw_usuario.equals(psw));

        System.out.println("¡BIENVENIDO!");

    }

    public void ejercicio2() {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Introduce un número cualquiera: ");
        int num = entrada.nextInt();

        while (num >= 1){

            System.out.println(num);
            num--;

        }
    }

    public void ejercicio3 () {

        for ( int i = 1 ; i<=50 ; i++ ){

            int resultado = i%3;

            if (resultado == 0) {

                System.out.println(i);

            }
        }
    }

    public void ejercicio4 () {

        String palabra;
        char letra;

        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduce una palabra: ");
        palabra = entrada.next();
        int inicio = 0;

        for (int i = palabra.length() ; i > 0 ; i--){

            letra = palabra.charAt(inicio);
            inicio ++;

            System.out.println(letra);

        }
    }

    public void practica2 () {

        Scanner entrada = new Scanner(System.in); //Declaración de variables.

        System.out.println("Introduzca un ISBN: ");
        String ISBN = entrada.next();
        int inicio = 0;
        char digito;
        int suma = 0;
        int num;
        int incognita = -1;

        while (ISBN.length() != 10 || ISBN.equals("0000000000")) { //Comprobamos que el formato de entrada sea el correcto.

            if (ISBN.length() != 10) {
                System.out.println("Formato erróneo. Es necesario un ISBN de 10 dígitos.");
            } else {
                System.out.println("El ISBN '0000000000' no es válido.");
            }
            ISBN = entrada.next();
        }

        try { //Usamos aqui la estructura try-catch para que si el ISBN intrudocudo son letras salte el error.

            for (int i = 10; i > 0; i--) { //Primer bucle para recorrer el ISBN, encontrar la X y la ? (en caso de que las haya).

                digito = ISBN.charAt(inicio);

                if (digito == 'X') {

                    suma += 10 * i;

                } else if (digito == '?') {

                    incognita = i;

                } else {

                    num = Integer.parseInt(String.valueOf(digito));
                    suma += num * i;

                }
                inicio++;
            }

            if (incognita != -1) { //Cuando se detecta una ? entramos en esta condicion.

                for (int interrogacion = 0; interrogacion <= 10; interrogacion++) { //Este bucle es para recorrer el valor


                    if (interrogacion == 10 && incognita != 1) { // Si la incognita no esta en la ultima posicion no puede tener valor 10.
                        continue;
                    }

                    int suma2 = suma + (interrogacion * incognita);

                    if (suma2 % 11 == 0) { //Comprobamos que ? es un numero valido e imprimimos X si el valor es 10.

                        if (interrogacion == 10) {
                            System.out.println("El número restante es: X");
                        } else {
                            System.out.println("El número restante es: " + interrogacion);
                        }

                        suma += interrogacion * incognita;
                        break;
                    }
                }
            }

            if (suma % 11 == 0) { // Comprobamos que sea un ISBN real.

                System.out.println("El ISBN es válido.");

            } else {
                System.out.println("El ISBN no es válido.");
            }

        } catch (NumberFormatException e) {

            System.out.println("ERROR. El formato del ISBN es incorrecto.");
        }
    }
}