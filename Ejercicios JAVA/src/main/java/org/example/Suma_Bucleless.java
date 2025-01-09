package org.example;

public class Suma_Bucleless {

    public static void numeros(int suma, int resultado){

        if (suma <= 10) {

            resultado += suma;
            numeros(++suma, resultado);

        } else {

            System.out.println(resultado);

        }
    }

    public static void main(String[] args){

        numeros(1, 0);

    }

}
