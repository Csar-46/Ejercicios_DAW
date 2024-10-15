package org.example;

public class Caracteres {

    public void caracteres0 () {

        int tamanyo;

        String frase = "No me porto mal en clase y no lo reconozco.";
        tamanyo = frase.length(); //Muestra el tamanyo de la frase.

        System.out.println("La frase tiene " + tamanyo + " caracteres");

        char letra = frase.charAt(33); //Muestra la letra de la posición indicada.
        System.out.println("La letra en la posición 33 es: " + letra);

        String palabra = frase.substring(9,13); //Guarda en una variable nueva en texto en el intervalo indicado.
        System.out.println("La palabra de el intervalo indicado es: " + palabra);

        String palabra2 = "PARTE!";
        String concatenacion = frase.concat(palabra2); //Esta uncion fusiona dos strings.
        System.out.println("la concatenación de la frase con la palabra " + palabra2 + " es: " + concatenacion);

        int posicion = concatenacion.indexOf(palabra2); //Esta función busca la palabra indicada e imprime la posición en la que se encuentra.
        System.out.println("La palabra " + palabra2 + " Esá en la posición " + posicion );

        int posicion2 = concatenacion.indexOf("no",8); //Esta función busca una palabra a partir de una posicion epecifica.
        System.out.println("La palabra 'no' esta en la posición: " + posicion2);

        int posicion3 = concatenacion.lastIndexOf("no "); //Con esta encotramos la ultima aparición de la palabra indicada
        System.out.println("La ultima aparición de 'no' es: " + posicion3);

        String mayusculas = frase.toUpperCase(); //esta funcion pasa la frase a mayusculas
        String minusculas = frase.toLowerCase(); //y esta a minusculas
        System.out.println("La frase en mayusculas es: " + mayusculas);
        System.out.println("La frase en minusculas es: " + minusculas);

        String nombre = "César                     ";
        System.out.println("Tu nombre " + nombre + " con espacios.");
        nombre = nombre.trim(); //Esta funcion quita los espacios sobrantes en los string
        System.out.println("Tu nombre " + nombre + " sin espacios.");

        String reemplazar = frase.replace("mal","bien"); //Esta funcion remplaza la palabra indicada por la que quieras.
        System.out.println("La frase con la palabra 'bien' en lugar que 'mal' queda asi: " + reemplazar);

        String reemplazar_espacios =frase.replace(" ",""); //ejemplo para quitar espacios.
        System.out.println("La frase sin espacios queda así: " + reemplazar_espacios);

        String palabra3 = "hola";
        String palabra4 = "Hola";
        if (palabra3.equals(palabra4) == true){ //Con esta funion comparas dos strings (compara minusculas y mayusculas).
            System.out.println("Las palabras " + palabra3 + " y " + palabra4 + " son iguales");
        }else
            System.out.println("Las palabras " + palabra3 + " y " + palabra4 + " son distintas");


        if (palabra3.equalsIgnoreCase(palabra4) == true){ //Con esta funion comparas dos strings (no compara mayusculas ni minusculas).
            System.out.println("Las palabras " + palabra3 + " y " + palabra4 + " son iguales");
        }else
            System.out.println("Las palabras " + palabra3 + " y " + palabra4 + " son distintas");

        frase.contains("mal");

    }

}
