package org.example;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicios {

    public void ejercicio0 () {
        System.out.println("¿Cómo te llamas?");
        Scanner entrada = new Scanner(System.in);       //Este comando sirve para habilitar el teclado.


        String nombre = entrada.next();                 //Cada vez qu pongo "entrada" activa el teclado
        //para introducir variables del ipo declarado.

        System.out.println("¿A qué curso vas?");
        String curso = entrada.next();                  //El .next() sirve para indicar el tipo de variable introducida.

        System.out.println("Hola " + nombre + " bienvenido a " + curso);

        int num1 = 0;
        int num2 = 0;

        while (num1 == num2){

            System.out.println("Introduce un número:");
            num1 = entrada.nextInt();                   //En este caso .nextInt() se trata de un numero.

            System.out.println("Introduce otro número:");
            num2 = entrada.nextInt();

            if (num1 == num2){
                System.out.println("ERROR. Los numeros son iguales");
            }

        }
        int resultado = num1 + num2;
        System.out.println("El resultado es: " + resultado);
    }

    public void ejercicio1 () {
        System.out.println("Bienvenido! Introduzca un número porfavor: ");

        Scanner entrada = new Scanner(System.in);
        int num = entrada.nextInt();

        if(num > 0){
            System.out.println("El número es positivo.");
        } else if (num < 0) {
            System.out.println("El número es negativo.");
        }else
            System.out.println("El número es natural.");

    }

    public void ejercicio2 () {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Introduce un número:");
        int num1 = entrada.nextInt();

        System.out.println("Introduce otro número:");
        int num2 = entrada.nextInt();

        if (num1 == num2){
            System.out.println("ERROR. Los numeros son iguales");

        } else if (num1 < num2) {
            System.out.println( num2 + " es mayor que " + num1);
        }else
            System.out.println( num1 + " es mayor que " + num2);
    }

    public void ejercicio3 () {
        int resultado;
        Scanner entrada = new Scanner(System.in);

        System.out.println("Introduce un número:");
        int num1 = entrada.nextInt();

        System.out.println("Introduce el divisor:");
        int num2 = entrada.nextInt();

        if (num2 == 0) {
            System.out.println("ERROR: No se puede dividir entre 0");

        }else {
            resultado = num1 / num2;                                    //SIEMPRE TIENE QUE ESTAR EL RESULTADO
            System.out.println(" El resultado es: " + resultado);       //DE LA OPERACIÓN DELANTE

        }
    }

    public void ejercicio4 () {

        Scanner entrada = new Scanner(System.in);
        int b = 0;
        int h = 0;

        while (b == 0) {

            System.out.println("Introduce el valor de la base:");
            b = entrada.nextInt();

        }

        while (h == 0) {

            System.out.println("Introduce el valor de la altura:");
            h = entrada.nextInt();

        }

        int A = (b*h)/2;
        System.out.println("El área del triangulo es: " + A);

    }

    public void practica3 () {
        int edad = 0;
        final int edad_voto = 18;
        boolean  error = true;

        System.out.println("¿Cómo te llamas?");
        Scanner entrada = new Scanner(System.in);

        String nombre = entrada.next();
        System.out.println("Hola " + nombre + ". Introduce tu edad:");

        while (error == true){
            try {

                edad = entrada.nextInt();
                error = false;

            } catch (InputMismatchException er) {

                System.out.println("ERROR. Introduce un dato válido:");
                entrada.nextLine();

            }
        }

        while (edad<0){
            System.out.println("Introduce de nuevo tu edad:");
            edad = entrada.nextInt();
        }

        if (edad < edad_voto) {

            System.out.println("Lo siento " + nombre + ". No puedes votar.");
            System.out.println("Te faltan " + (edad_voto - edad) + " años para ser mayor de edad.");

        } else
            System.out.println("Enhorabuena " + nombre + ". Puedes votar.");
    }

    public void practica4 () {

        int multiplicando = 0;
        int multiplicador = 0;

        boolean error = true;
        boolean error2 = true;

        Scanner entrada = new Scanner(System.in);

        System.out.println("Introduce un multiplicando de 3 cifras:");

        while (error == true) { //Controlamos que el valor del multiplicador sea numerico
            try {

                multiplicando = entrada.nextInt();
                while (multiplicando <= 0) { //Controlamos que el multiplicando no sea ni negativo ni 0
                    System.out.println("ERROR. Introduce un multiplicando válido:");
                    multiplicando = entrada.nextInt();
                    while (multiplicando < 100  || multiplicando > 999 ) {
                        System.out.println("ERROR. Introduce un multiplicando de 3 dígitos:");
                        multiplicando = entrada.nextInt();
                    }

                }

                error = false;

            } catch (InputMismatchException er) {

                System.out.println("ERROR. Introduce un valor numérico:");
                entrada.nextLine();

            }
        }

        System.out.println("Introduce un multiplicador de 3 cifras:");

        while (error2 == true) { //Controlamos que el valor del multiplicando sea numerico
            try {

                multiplicador = entrada.nextInt();
                while (multiplicador <= 0) { //Controlamos que el multiplicador no sea ni negativo ni 0
                    System.out.println("ERROR. Introduce un multiplicador válido:");
                    multiplicador = entrada.nextInt();
                    while (multiplicador < 100  || multiplicador > 999 ) {
                        System.out.println("ERROR. Introduce un multiplicador de 3 dígitos:");
                        multiplicador = entrada.nextInt();
                    }

                }

                error2 = false;

            } catch (InputMismatchException er) {

                System.out.println("ERROR. Introduce un valor numérico:");
                entrada.nextLine();

            }
        }

        String multiplicadortxt = Integer.toString(multiplicador);
        String multiplicadortxt_1 = multiplicadortxt.substring(0,1);
        String multiplicadortxt_2 = multiplicadortxt.substring(1,2);
        String multiplicadortxt_3 = multiplicadortxt.substring(2,3);

        int multiplicador_1 = Integer.parseInt(multiplicadortxt_1);
        int multiplicador_2 = Integer.parseInt(multiplicadortxt_2);
        int multiplicador_3 = Integer.parseInt(multiplicadortxt_3);

        int resultado1 = multiplicando * multiplicador_1;
        int resultado2 = multiplicando * multiplicador_2;
        int resultado3 = multiplicando * multiplicador_3;
        int resultado = multiplicando * multiplicador;

        System.out.println("Mucchas gracias. A continuación se postrara la multiplicacion por pantalla:");

        System.out.println("    " + multiplicando);
        System.out.println("x   " + multiplicador);
        System.out.println("-----------");

        System.out.println("    " + resultado1);
        System.out.println("   " + resultado2 + "x ");
        System.out.println("  " + resultado3 + "xx");
        System.out.println("-----------");

        System.out.println("  " + resultado);
    }

    public void cadenas1 () {

        Scanner entrada = new Scanner(System.in);
        System.out.println("¿Que frase quieres analizar?");
        String frase = entrada.nextLine();

        int caracteres = frase.length();
        System.out.println("La frase tiene " + caracteres + " caracteres.");

        String reemplazo =frase.replace(" ", "");
        System.out.println("La frase sin espacios queda así: " + reemplazo);

        //caracteres/2 para dividir la frase?

        String mayusculas = frase.toUpperCase();
        System.out.println("la frase en mayusculas es: " + mayusculas);


    }

    public void preexamen1 () {

        Scanner entrada = new Scanner(System.in);

        System.out.println("¿Cuántos números quieres introducir?");
        int cantidad = entrada.nextInt();

        int num;
        int mayor = 0;
        int menor = 0;
        int igual = 0;

        for (int i = 0 ; i < cantidad ; i++){

            System.out.println("Introduce un número: ");
            num = entrada.nextInt();

            if (num > 0){
                mayor++;
            }else if (num < 0){
                menor++;
            }else
                igual++;
        }
        System.out.println("Hay " + mayor + " numeros mayores que cero, " + menor + " numeros menores que cero y " + igual + " numeros iguales que cero.");
    }

    public void preexamen2 () {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Introduce la base.");
        int base = entrada.nextInt();
        long resultado = 0;

        System.out.println("Introduce el exponente.");
        int exponente = entrada.nextInt();

        while (exponente < 0){
            System.out.println("ERROR. introduce un exponente positivo.");
            exponente = entrada.nextInt();
        }

        for (int i = 0 ; i < exponente ; i++) {

            resultado += base * base;

        }
        if (exponente == 0) {
            System.out.println("El resultado de la potencia es: 1");

        } else if (base < 0) {

            System.out.println("El resultado de la potencia es: " + (resultado * -1));

        } else if (base > 0)
            System.out.println("El resultado de la potencia es: " + resultado);

    }

    public void preexamen3 () {

        Scanner entrada = new Scanner(System.in);
        System.out.println("¿A cuántos meses quieres finaciar tu producto?");
        int meses = entrada.nextInt();
        long euros = 10;
        long total = 0;

        for (int i = 1 ; i <= meses ; i++) {

            total += euros;

            System.out.println("Mes " + i + " = " + euros + "€");

            euros = euros * 2;

        }

        System.out.println("Total a pagar: " + total + "€");

    }

    public void preexamen4 () {

        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduce la nota del alumno redondeada (0-10)");
        int nota = entrada.nextInt();

        if (nota == 0 ||nota == 1 || nota == 2 ||nota == 3 || nota == 4){
            nota = 1;
        }else if (nota == 5){
            nota = 2;
        } else if (nota == 6) {
            nota = 3;
        } else if (nota == 7 || nota == 8) {
            nota = 4;
        } else if (nota == 9 || nota == 10) {
            nota = 5;
        }


        switch (nota){

            case 1:
                System.out.println("INSUFICIENTE.");
                break;
            case 2:
                System.out.println("SUFICIENTE.");
                break;
            case 3:
                System.out.println("BIEN.");
                break;
            case 4:
                System.out.println("NOTABLE.");
                break;
            case 5:
                System.out.println("SOBRESALIENTE.");
                break;
            default:
                System.out.println("No válido");
                break;

                // Si el if-else funcionaria asi:
//        case 0:
//        case 1:
//        case 2:
//        case 3:
//        case 4:
//        System.out.println("INSUFICIENTE.");
//        break;
//        case 5:
//        System.out.println("SUFICIENTE.");
//        break;
//        case 6:
//        System.out.println("BIEN.");
//        break;
//        case 7:
//        case 8:
//        System.out.println("NOTABLE.");
//        break;
//        case 9:
//        case 10:
//        System.out.println("SOBRESALIENTE.");
//        break;
//        default:
//        System.out.println("No válido");
//        break;
        }
    }

    public void preexamen5 () {

        Scanner entrada = new Scanner(System.in);

        int sueldo;
        int mayor = 0;
        int maximo = 0;

        for (int i = 1; i <= 5 ; i++) {

            System.out.println("Introduce el " + i + "º salario de NTT Data:");
            sueldo = entrada.nextInt();

            if (sueldo >= 1000){
                mayor++;
            }
            if (sueldo > maximo) {
                maximo = sueldo;
            }
        }
        System.out.println("El sueldo máximo es de: " + maximo + "€");
        System.out.println("Hay " + mayor + " sueldos mayores de 1000€");
    }

    public void preexamen6 () {

        Scanner entrada = new Scanner(System.in);
        int cantidad;
        int mayor_edad = 0;
        int mayor_altura = 0;
        int edad_media = 0;
        int altura_media = 0;

        System.out.println("¿Qué cantidad de alumnos quieres comparar?");
        cantidad = entrada.nextInt();

        for (int i = 1; i <= cantidad; i++) {

            System.out.println("Introduce la edad del " + i + "º alumno.");
            int edad = entrada.nextInt();
            System.out.println("Introduce la alura en cm del " + i + "º alumno.");
            int altura = entrada.nextInt();

            if (edad >= 18){
                mayor_edad++;
            }
            if (altura >= 175){
                mayor_altura++;
            }

            edad_media += edad;
            altura_media += altura;

        }

        System.out.println("La edad media es: " + (edad_media/cantidad));
        System.out.println("La altura media en cm es: " + (altura_media/cantidad));
        System.out.println("Hay " + mayor_edad + " alumnos mayores de 18 años.");
        System.out.println("Hay " + mayor_altura + " alumnos por encima de los 175cm.");

    }

    public void preexamen7 () {

        Scanner entrada = new Scanner(System.in);

        System.out.println("¿Cuántos números quieres imprimir?");

        int num = entrada.nextInt();
        int resultado = 0;
        int num1 = 0;
        int num2 = 1;

        while (num <= 0){

            System.out.println("ERROR. introcude un número entero positivo.");
            num = entrada.nextInt();

        }

        System.out.print("Secuencia de Números:");

        for (int i = 0; i < num; i++) {

            System.out.print(" " + resultado);
            resultado = num1 + num2;
            num1 = num2;
            num2 = resultado;

        }
    }
}
