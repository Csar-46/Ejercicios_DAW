package org.example;

import java.time.LocalDateTime;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Excepciones {

    public void excepciones() {

        int dividendo = 0;
        int divisor_entero = 0;
        int resultado = 0;

        Scanner entrada = new Scanner(System.in);

        System.out.println("Dividendo: ");

        if (entrada.hasNextInt()) {

            dividendo = entrada.nextInt();

        } else {

            System.out.println("Has introducido un formato incorrecto. No es un numero.");

        }

        System.out.println("Divisor; ");
        String divisor = entrada.next();

        try {

            divisor_entero = Integer.parseInt(divisor);

        } catch (NumberFormatException e1) {

            System.out.println("ERROR. El divisor introducido no es un numero." + e1.getMessage());

        }

        try {

            resultado = dividendo / divisor_entero;

        } catch (ArithmeticException e2) {

            System.out.println("ERROR. No se puede dividir entre 0." + e2.getMessage());

        }

        System.out.println("Resultado " + resultado);

    }

    public void ejercicio0() { //Ejercicio con switch-case.

        System.out.println("BIENVENIDO A LA CLASIFICACIÓN DE GENERACIONES");
        System.out.println("Elige un modo: ");
        System.out.println("1. Año nacimiento");
        System.out.println("2. Edad");

        Scanner teclado = new Scanner(System.in);

        String modo = teclado.next();

        LocalDateTime hoy = LocalDateTime.now();
        int anyo_actual = hoy.getYear();

        int anyo_nacimiento = 1800;

        boolean error = false;

        switch (modo) {

            case "1":

                System.out.println("Introduce tu año de nacimiento: ");
                String anyo = teclado.next();

                try {
                    anyo_nacimiento = Integer.parseInt(anyo);
                } catch (NumberFormatException e1) {
                    System.out.println("El formato del año no es correcto. " + e1.getMessage());
                }

                if (anyo_nacimiento < 1900 || anyo_nacimiento > anyo_actual) {
                    System.out.println("El año introducido no es correcto.");
                    error = true;
                }
                break;

            case "2":
                System.out.println("Introduce tu edad: ");
                int edad = 0;

                if (teclado.hasNextInt()) {
                    edad = teclado.nextInt();
                } else {
                    System.out.println("El formato de la edad es incorrecto.");
                    error = true;
                }

                if (edad < 0) {
                    System.out.println("La edad introducida no es correcta.");
                    error = true;
                } else {
                    anyo_nacimiento = anyo_actual - edad;
                }
                break;

            default:
                System.out.println("El modo no exixte.");
                error=true;
        }

        if (!error) {
            if (anyo_nacimiento >= 1900 && anyo_nacimiento <= 1927) {
                System.out.println("Eres de la generación sin bautizar.");
            } else if (anyo_nacimiento >= 1928 && anyo_nacimiento <= 1944) {
                System.out.println("Eres de la generación Silent.");
            } else if (anyo_nacimiento >= 1945 && anyo_nacimiento <= 1964) {
                System.out.println("Eres de la genración Baby Boomers");
            } else if (anyo_nacimiento >= 1965 && anyo_nacimiento <= 1981) {
                System.out.println("Eres de la generación X");
            } else if (anyo_nacimiento >= 1982 && anyo_nacimiento <= 1994) {
                System.out.println("Eres de la mejor generación, MILLENIAL!! :)");
            } else if (anyo_nacimiento >= 1995 && anyo_nacimiento <= anyo_actual) {
                System.out.println("Eres de la generación Centenial");
            } else {
                System.out.println("No tienes generación.");
            }
        }
    }

    public void ejercicio1 () {

        Scanner entrada = new Scanner (System.in);
        System.out.println("Introduce tu altura en centimetros:");
        int altura = entrada.nextInt();

        if (altura<=150){

            System.out.println("Persona de baja altura.");

        }else if (altura>150 && altura<=175){

            System.out.println("Persona de altura media.");

        }else
            System.out.println("Persona alta.");

    }

    public void ejercicio2 () {

        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduce un número entre 1 y 7:");
        int num = entrada.nextInt();

        switch (num){

            case 1:
                System.out.println("El número equivale al Lunes.");
                break;
            case 2:
                System.out.println("El número equivale al Martes.");
                break;
            case 3:
                System.out.println("El número equivale al Miercoles.");
                break;
            case 4:
                System.out.println("El número equivale al Jueves.");
                break;
            case 5:
                System.out.println("El número equivale al Viernes.");
                break;
            case 6:
                System.out.println("El número equivale al Sábado.");
                break;
            case 7:
                System.out.println("El número equivale al Domingo.");
                break;
            default:
                System.out.println("El número no equivale con ningún dia de la semana");
                break;

        }
    }

    public void practica1() {

        boolean error = true;  //Declaro todas las variables.

        String fecha = "";
        String diatxt;
        String mestxt;
        String anyotxt;

        int dia = 0;
        int mes = 0;
        int anyo = 0;

        String digito1txt;
        String digito2txt;
        String digito3txt;
        String digito4txt;

        int digito1;
        int digito2;
        int digito3;
        int digito4;

        int resultado;
        int numsuerte;


        Scanner entrada = new Scanner(System.in);

        while (error == true) { //Pedimos la fecha antes del bucle para que solo la pida una vez.
            try {

                while (dia <= 0 || dia > 31 || mes <= 0 || mes > 12 || anyo <= 0 || anyo > 2025 ||  fecha.charAt(2) != '/' || fecha.charAt(2) != '/' || fecha.charAt(5) != '/' ) { //Usamos la condicion del bucle para que se repita hasta que los datos introducidos sean correctos.
                    /* El codigo en el que se piden variables esta dentro de la estructura try catch para que se controlen los errores de entrada de datos*/

                    System.out.println("Intoduce tu fecha de nacimiento (dd/mm/aaaa):");
                    fecha = entrada.nextLine();

                    diatxt = fecha.substring(0,2);
                    mestxt = fecha.substring(3,5);
                    anyotxt = fecha.substring(6,10);
                    //Guardamos los numeros buscados en el String y les asignamos una variable tipo numero.
                    dia = Integer.parseInt(diatxt);
                    mes = Integer.parseInt(mestxt);
                    anyo = Integer.parseInt(anyotxt);

                    if (fecha.charAt(2) != '/' || fecha.charAt(5) != '/'){
                        System.out.println("ERROR. Formato incorrecto.");

                    }

                    if (dia <= 0 || dia > 31 || mes <= 0 || mes > 12 || anyo <= 0 || anyo > 2025) { //Controlamos que ninguno de los numeros sea negativo, cero o mayor de lo que deberia.

                        System.out.println("ERROR. Introduce una fecha positiva y mayor que 0.");
                    }
                }
                error = false;

            } catch (StringIndexOutOfBoundsException | NumberFormatException e){

                System.out.println("ERROR. Introduce una fecha válida:");

            }
        }
        resultado = dia + mes + anyo;

        String resultado1txt = Integer.toString(resultado); //Pasamos resultado a String y lo recorremos para sumar sus cifras.

        digito1txt = resultado1txt.substring(0,1);
        digito2txt = resultado1txt.substring(1,2);
        digito3txt = resultado1txt.substring(2,3);
        digito4txt = resultado1txt.substring(3,4);

        digito1 = Integer.parseInt(digito1txt);
        digito2 = Integer.parseInt(digito2txt);
        digito3 = Integer.parseInt(digito3txt);
        digito4 = Integer.parseInt(digito4txt);

        numsuerte = digito1 + digito2 + digito3 + digito4; //Com la suma se muestra el resultado y la operacion por pantalla.

        System.out.println(dia +" + " + mes + " + " + anyo + " = " + resultado);
        System.out.println(digito1 + " + " + digito2 + " + " + digito3 + " + " + digito4 + " = " + numsuerte);
        System.out.println("Tu numero de la suerte es: " + numsuerte);

    }

    public void practica2 () {

        int operando1 = 0;
        int operando2 = 0;
        double resultado = 0;
        String operacion;
        boolean error = true;
        boolean error2 = true;

        Scanner entrada = new Scanner (System.in);

        System.out.println("¡Hola, bienbenido a la CALCULADORA DE CESAR!");

        while (error == true){

            try {

                System.out.println("Por favor, introduce el primer operador con el que quieres calcular:");
                operando1= entrada.nextInt();
                error = false;

            } catch (InputMismatchException e1){

                System.out.println("ERROR. El operador debe ser numérico." + e1);
                entrada.nextLine();

            }

        }

        System.out.println("A continuación introduce la operación que quieres realizar ( + , - , / , x , R (raíz cuadrada)):");
        operacion= entrada.next();
        String operacionM = operacion.toUpperCase();

        while (error2 == true){
            try {

            if (operacionM.equals("R")){
                while (operando1 < 0){
                    System.out.println("ERROR. El valor de la raíz cuadrada no puede ser negativo.");
                    System.out.println("Introduce un número positivo:");
                    operando1 = entrada.nextInt();
                }

                resultado = Math.sqrt(operando1);
                System.out.println("El resultado de la raíz cuadrada del número es: " + resultado);
                error2 = false;

                }else{

                    System.out.println("Por favor, introduce el segundo operador con el que quieres calcular.");
                    operando2=entrada.nextInt();

                    switch (operacionM){

                        case "+":
                            resultado = operando1 + operando2;
                            System.out.println("El resultado de la suma de los dos numeros es: " + resultado);
                            error2 = false;
                            break;
                        case "-":
                            resultado = operando1 - operando2;
                            System.out.println("El resultado de la resta de los dos numeros es: " + resultado);
                            error2 = false;
                            break;
                        case "/":
                            while (operando2 == 0){
                                System.out.println("ERROR. No se puede dividir entre 0 .");
                                System.out.println("Introduce un número mayor o menor que 0:");
                                operando2 = entrada.nextInt();
                            }
                            resultado = operando1 / operando2;
                            System.out.println("El resultado de la división de los dos numeros es: " + resultado);
                            error2 = false;
                            break;
                        case "X":
                            resultado = operando1 * operando2;
                            System.out.println("El resultado de la multiplicación de los dos numeros es: " + resultado);
                            error2 = false;
                            break;
                        default:
                            System.out.println("ERROR. El operador no se reconoce.");
                            error2 = false;
                    }
                }

            }catch (InputMismatchException e2){

                System.out.println("ERROR. El segundo valor debe ser numérico. (" + e2 + ")");
                entrada.nextLine();
            }
        }
    }
}





