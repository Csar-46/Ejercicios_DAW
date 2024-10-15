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

    public void ejercicio1 (){
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

    public void ejercicio2 (){
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

    public void ejercicio3 (){
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

    public void ejercicio4 (){

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

    public void practica5 () {

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
}
