package org.example;

import java.util.*;

//ESTRUCTURA PARA IMPRIMIR UN VECTOR BONITO:

// System.out.println("El vector original es: ");
// System.out.print("[");
// for (int i = 0; i < vector.length; i++) {
//
//      if (i == vector.length-1){
//
//          System.out.print(" " + vector[i] + " ");
//
//      }else {
//
//          System.out.print(" " + vector[i] + ", ");
//      }
//
//}
//System.out.println("]");

public class Vectores {

    public void ejercicio0() {

        int vector[]; //Crer el vector con el tipo de variable que vamos a usar

        vector = new int[7]; //hemo declarado qe el vector va a tener 7 espacios, del 0 al 6, para poder usarlo.

        vector[2] = 7;
        vector[5] = vector[2] + 4;

        System.out.println(vector[2] + " " + vector[5]);

        System.out.print("[");

        for (int i = 0; i < vector.length; i++) { //Siempre menor por que si no se sale del rango del vector
            System.out.print(" " + vector[i] + ", ");

        }

        System.out.println("]");

        String palabras[] = new String[3];
        palabras[0] = "Pepe";

        System.out.print("[");
        for (int i = 0; i < palabras.length; i++) {
            System.out.print(" " + palabras[i] + ", ");

        }

        System.out.println("]");

    }

    public void ejercicio1() {

        Random aleatorio = new Random();
        int suma = 0;

        int vector[] = new int[8];

        for (int i = 0; i < vector.length; i++) { //Bucle para rellenar el vector

            vector[i] = aleatorio.nextInt(501);
            suma += vector[i];

        }

        System.out.println("La suma de los elementos es: " + suma);

    }

    public void ejercicio2() {

        Scanner entrada = new Scanner(System.in);
        int vector[] = new int[5];
        int valor = 1;

        for (int i = 0; i < vector.length; i++) {

            System.out.println("Introduce el " + valor + "º número del vector.");
            vector[i] = entrada.nextInt();
            valor++;

        }

        System.out.println("El vector original es: ");
        System.out.print("[");
        for (int i = 0; i < vector.length; i++) {

            if (i == vector.length-1){

                System.out.print(" " + vector[i] + " ");

            }else {

                System.out.print(" " + vector[i] + ", ");
            }

        }
        System.out.println("]");

        int tam_mitad = vector.length / 2;
        int aux;

        for (int i = 0; i < tam_mitad; i++) {

            aux = vector[i];
            vector [i] = vector[vector.length -1 -i];
            vector [vector.length -1 -i] = aux;

        }


        System.out.println("El vector invertido es:");
        System.out.print("[");
        for (int i = 0; i < vector.length ; i++) {

            if (i == vector.length-1){

                System.out.print(" " + vector[i] + " ");

            }else {

                System.out.print(" " + vector[i] + ", ");

            }

        }
        System.out.println("]");
    }

    public void ejercicio3() {

        Random aleatorio = new Random();
        Scanner entrada = new Scanner(System.in);

        int num;
        int contador = 0;

        int vector[] = new int[100];

        System.out.println("Ingresa un numero para buscar [0,100]...");
        num = entrada.nextInt();

        for (int i = 0; i < vector.length; i++) { //Bucle para rellenar el vector

            vector[i] = aleatorio.nextInt(101);

        }

        for (int i = 0; i < vector.length; i++) {

            if (num == vector[i]) {
                contador++;
            }

        }

        System.out.println("El número " + num + " aparece " + contador + " veces en el array.");

    }

    public void ejercicio4() {

        Scanner entrada = new Scanner(System.in);
        int vector[] = {4,6,7,2,10};
        int vector2 [] = new int[vector.length - 1];
        int num;

        System.out.println("Ingresa el índice a eliminar: ");
        num = entrada.nextInt();

        for (int i = 0; i < vector.length - 1; i++) {

            if (i < num){

                vector2[i] = vector [i];

            }else{

                vector2[i] = vector [i + 1];

            }

        }


        System.out.println("El array resultante es: ");
        System.out.print("[");
        for (int i = 0; i < vector2.length; i++) {

            System.out.print(" " + vector2[i] + ", ");

        }
        System.out.println("]");

    }

    public void ejercicio5() {


        int vector[] = {3, 5, 2, 1, 4,};
        int aux = vector[0];


        System.out.println("El vector original es: ");
        System.out.print("[");
        for (int i = 0; i < vector.length; i++) {

            System.out.print(" " + vector[i] + ", ");

        }
        System.out.println("]");

        for (int i = 0; i < vector.length; i++) {

            if (i == 0) {

                vector[i] = aux;

            } else {
                vector[i] = vector[i++];

            }
        }

        System.out.println("El vector reordenado es:");
        System.out.print("[");
        for (int i = 0; i < vector.length; i++) {

            System.out.print(" " + vector[i] + ", ");

        }
        System.out.println("]");

    }

    public void vectores_evo () {

        String palabras [] = {"Paco", "Pepe", "Juan", "Maria"};

        for (String i : palabras){

            System.out.println(i);

        }

        String texto_vector = Arrays.toString(palabras);
        System.out.println(texto_vector);

    }

    public void practica1 () {

        Scanner entrada = new Scanner(System.in);
        Random aleatorio = new Random();
        int primero = aleatorio.nextInt(7);
        int valor;
        int suma;
        String potencia;
        String[] Vequipo1 = new String[7];
        String[] Vequipo2 = new String[7];
        int equipo1 = 0;
        int equipo2 = 0;
        int empate = 0;
        boolean error;  // Variable para detectar errores


        for (int equipo = 1; equipo <= 2; equipo++) { // Pedimos las potencias de ambos equipos en un mismo bucle
            suma = 0;                                 //Ademas la variable que declaramos en la condicion del buble nos servirá para entrar al switch case mas adelante.

            while (suma != 30) {
                System.out.print("Introduce la potencia de los 7 samuráis del equipo " + equipo + " separada por espacios: ");
                potencia = entrada.nextLine();
                String[] Vtemporal = potencia.split(" ");


                if (Vtemporal.length != 7) {  // Comprobamos que introducimos la cantidad exacta de numeros
                    System.out.println("ERROR. El equipo debe contar con 7 samuráis exactos.");
                    continue;
                }

                suma = 0;
                error = false;  // Utilizamos error como variable de control de errores.


                for (int i = 0; i < Vtemporal.length; i++) { //Hacemos la suma y creamos el primer vector.
                    try {                                    //Metemos esta parte en un try-catch para controlar los errores de formato ademas de acotar el valor de entrada.
                        valor = Integer.parseInt(Vtemporal[i]);
                        if (valor < 1 || valor > 24) {
                            System.out.println("ERROR. La potencia del samurái debe estar entre 1 y 24.");
                            error = true;
                            break;
                        }
                        suma += valor;
                    } catch (NumberFormatException e) {
                        System.out.println("ERROR. Entrada inválida. Solo se permiten números enteros.");
                        error = true;
                        break;
                    }
                }

                if (error || suma != 30) { //Se hace la suma y en caso de error entra a esta condicion y resetea la variable.
                    if (suma != 30 && !error) {
                        System.out.println("ERROR. La potencia total no suma 30.");
                    }
                    suma = 0;
                    continue;
                }


                switch (equipo) { // Copiamos los valores correctos al vector correspondiente.
                    case 1:
                        Vequipo1 = Arrays.copyOf(Vtemporal, Vtemporal.length);
                        System.out.println("Equipo 1 listo para el combate.");
                        break;
                    case 2:
                        Vequipo2 = Arrays.copyOf(Vtemporal, Vtemporal.length);
                        System.out.println("Equipo 2 listo para el combate.");
                        break;
                }
            }
        }

        System.out.println("El combate comienza con el Samurai número: " + (primero + 1));

        System.out.println("!QUE COMIENCE EL COMBATE¡");
        System.out.println("La batalla empieza con el Samurai " + (primero + 1) + ".");


        for (int i = 0; i < Vequipo1.length; i++) {
            if (equipo1 >= 4 || equipo2 >= 4) { //Ponemos esta condición para que si alguno gana 5 rondas salga del bucle.
                break;
            }

            if (primero == 7) { //Cuando el septimo samurai pelea se resetea la variable para que salga el primero.
                primero = 0;
            }

            int samurai1 = Integer.parseInt(Vequipo1[primero]); //Con las lineas de abajo mostramos por pantalla quien se pelea y se suma 1 al contador del ganador.
            int samurai2 = Integer.parseInt(Vequipo2[primero]);

            System.out.print("Samurai " + (primero + 1) + ".");
            if (samurai1 > samurai2) {
                System.out.println(" Gana el equipo 1. " + samurai1 + " vs " + samurai2);
                Vequipo2[primero] = String.valueOf(0);
                equipo1++;
            } else if (samurai1 < samurai2) {
                System.out.println(" Gana el equipo 2. " + samurai1 + " vs " + samurai2);
                Vequipo1[primero] = String.valueOf(0);
                equipo2++;
            } else {
                System.out.println(" Los samuráis se han matado entre sí. Empate. " + samurai1 + " vs " + samurai2);
                empate++;
            }
            primero++;
        }


        if (equipo1 > equipo2) { //Aqui comparamos los contadores que hemos acumulado antes para imprimir el resultado.
            System.out.println("!EQUIPO 1 GANA¡ Equipo 2 ha tenido " + equipo1 + " bajas.");
        } else if (equipo1 < equipo2) {
            System.out.println("!EQUIPO 2 GANA¡ Equipo 1 ha tenido " + equipo2 + " bajas.");
        } else {
            System.out.println("¡INÉDITO! ¡HEMOS TENIDO UN EMPATE! Parece que todos los samuráis eran igual de poderosos.");
        }
    }

    public void navidad () {

        Scanner entrada = new Scanner(System.in);

        final String palabra = "NAVIDAD";

        System.out.println("Introduce cuantas leras quieres añadir...");
        String cantidad = entrada.nextLine();

        String cantidades [] = cantidad.split(" ");
        String letras [] = palabra.split("");

        System.out.println(Arrays.toString(cantidades));
        System.out.println(Arrays.toString(letras));

        String resultado = "";

        for (int i = 0; i < letras.length; i++) {

            for (int j = 0 ; j < Integer.parseInt(cantidades[i]) ; j++) {

                resultado = resultado.concat(letras[i]);

            }
        }

        System.out.println(resultado);

    }

    public void ordenar () {

        int numeros[] = {3, 1, 54, 17, 8};
        System.out.println(Arrays.toString(numeros));

        Arrays.sort(numeros); //Ordena de menor a mayor
        System.out.println(Arrays.toString(numeros));

    }

    public void BuscarNum () {

        int numeros[] = {3, 1, 54, 17, 8};
        System.out.println("> Array sin ordenar: " + Arrays.toString(numeros));

        Arrays.sort(numeros);
        System.out.println("> Array ordenado: " + Arrays.toString(numeros));

        int num = 54;

        int posicion = Arrays.binarySearch(numeros,num); //Busca en que posicion del vector (numeros) esta el numero indicado (num)

        if (posicion < 0) {
            System.out.println("> El número " + num + " no está en el array");
        } else {
            System.out.println("> La posición del número " + num + " es: " + posicion);
        }
    }

    public void EliminarDuplicado () {

        //Metodo facil. El comando de debajo devuelve el vector que sea sin duplicados y ordenado.
        // int vector [] = {2, 2, 4, 4, 7, 9}
        // int vector2 [] = Arrays.stream(vector).distinct().toArray();


        int[] original = {2, 2, 4, 4, 7, 9};
        System.out.println("> Array original: " + Arrays.toString(original));

        int auxiliar[] = new int[original.length];

        int tamanyo = 0;

        for (int i = 0; i < original.length; i++) {
            // original[i] == original [i+1]
            if (i!= original.length - 1 && original[i] == original[i+1]){
                System.out.println("> Se ha encontrado un número duplicado: " + original[i]);
            } else {
                auxiliar [i] = original [i];
                tamanyo++;
            }
        }
        System.out.println("> Array auxiliar: " + Arrays.toString(auxiliar));

        int limpio[] = new int[tamanyo];
        int pos = 0;


        for (int i = 0; i < auxiliar.length; i++) {

            if (auxiliar[i]!= 0){
                if (auxiliar[i] != 0){
                    limpio[pos] = auxiliar[i];
                    pos++;
                }
            }
        }
        System.out.println("> Array limpio: " + Arrays.toString(limpio));
    } //Eliminar duplicados con vector auxiliar

    public void EliminarDuplicadoV2() {

        int[] original = {2, 2, 4, 4, 7, 9};
        System.out.println("> Array original: " + Arrays.toString(original));

        int tamanyo = 0;

        for (int i = 0; i < original.length; i++) {
            // original[i] == original [i+1]
            if (i!= original.length - 1 && original[i] == original[i+1]){
                System.out.println("> Se ha encontrado un número duplicado: " + original[i]);
                original [i] = 0;
            } else {
                tamanyo++;
            }
        }
        System.out.println("> Array auxiliar: " + Arrays.toString(original));

        int limpio[] = new int[tamanyo];
        int pos = 0;


        for (int i = 0; i < original.length; i++) {

            if (original[i]!= 0){

                limpio[pos] = original[i];
                pos++;

            }
        }
        System.out.println("> Array limpio: " + Arrays.toString(limpio));
    } //Eliminar duplicados sin vector auxiliar

    public void EliminarDuplicadoV3() {

        int[] original = {2, 2, 4, 4, 7, 9};
        System.out.println("> Array original: " + Arrays.toString(original));

        Random aleatorio = new Random();

        int tamanyo = 0;

        boolean repetir = true;

        while (repetir) {
            repetir = false;
            for (int i = 0; i < original.length; i++) {
                // original[i] == original [i+1]
                if (i != original.length - 1 && original[i] == original[i + 1]) {
                    System.out.println("> Se ha encontrado un número duplicado: " + original[i]);
                    original[i] = aleatorio.nextInt(49) + 1;
                    repetir = true;
                }
            }
            Arrays.sort(original);
        }
        System.out.println(Arrays.toString(original));
    } //Eliminar duplicados dando un valor aleatorio al valor reemplazado

    public void practica2 () {

        Scanner entrada = new Scanner(System.in);
        Random aleatorio = new Random ();

        boolean repetir = true;
        String[] combinacion;
        int[] sorteo = new int [6];
        int ReintegroUsuario;
        int reintegro = aleatorio.nextInt(10);

        System.out.println("> Introduce los datos de tu boleto:");
        String numeros = entrada.nextLine();

        boolean error = numeros.matches("\\d{1,2}-\\d{1,2}-\\d{1,2}-\\d{1,2}-\\d{1,2}-\\d{1,2}/\\d");

        if (!error) {
            System.out.println("EL FORMATO ES INCORRECTO.");
            return;
        }

        combinacion= numeros.split("[-/]");
        ReintegroUsuario = Integer.parseInt(combinacion[combinacion.length - 1]);

        int[] NumerosPrimitiva = new int[6];
        for (int i = 0; i < 6; i++) {
            NumerosPrimitiva[i] = Integer.parseInt(combinacion[i]);
        }

        for (int i = 0; i < sorteo.length; i++) {
            sorteo[i] = aleatorio.nextInt(49) + 1;
        }

        while (repetir) {
            repetir = false;
            for (int i = 0; i < sorteo.length - 1; i++) {
                for (int j = i + 1; j < sorteo.length; j++) {
                    if (sorteo[i] == sorteo[j]) {
                        sorteo[j] = aleatorio.nextInt(49) + 1;
                        repetir = true;
                    }
                }
            }
        }

        int complemento;
        boolean error2;

        do {
            complemento = aleatorio.nextInt(49) + 1;
            error2 = true;

            // Verificamos si complemento ya está en sorteo
            for (int i = 0; i < sorteo.length; i++) {
                if (sorteo[i] == complemento) {
                    error2 = false;
                    break;
                }
            }
        } while (!error2);

        System.out.println("HA SALIDO:");

        //System.out.println("Números: " + Arrays.toString(Arrays.copyOf(combinacion, combinacion.length - 1)));
        System.out.println(Arrays.toString(sorteo));
        System.out.println("Complementario: " + complemento);
        System.out.println("Reintegro: " + reintegro);
    }
}



