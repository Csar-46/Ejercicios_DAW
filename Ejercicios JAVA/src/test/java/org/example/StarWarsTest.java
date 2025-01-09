package org.example;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import java.io.ByteArrayInputStream;
import java.util.Arrays;
import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;
class StarWarsTest {

    @Test
    void direcciones() {

        // Creamos el vector que vamos a usar.
        String[] direcciones = {"I", "S", "B"};

        // Comprobamos la longitud y contenido del vector que hemos creado.
        assertAll(
                () -> assertEquals(3, direcciones.length, "El tamaño del vector no es el esperado"),
                () -> assertEquals("I", direcciones[0], "El primer elemento no es I"),
                () -> assertEquals("S", direcciones[1], "El segundo elemento no es S"),
                () -> assertEquals("B", direcciones[2], "El tercer elemento no es B")
        );

    }

    @Test
    void rellenarBordes() {

        //Creamos una matriz y la rellenamos
        String[][] pantalla = new String[5][5];
        StarWars.rellenarBordes(pantalla);

        assertAll(
                // Comprobamos que hayan # en las esquinas.
                () -> assertEquals("#", pantalla[0][0], "La esquina superior izquierda no tiene #"),
                () -> assertEquals("#", pantalla[0][4], "La esquina superior derecha no tiene #"),
                () -> assertEquals("#", pantalla[4][0], "La esquina inferior izquierda no tiene #"),
                () -> assertEquals("#", pantalla[4][4], "La esquina inferior derecha no tiene #"),

                // Comprobamos que ne el medio hayan espacios.
                () -> assertEquals(" ", pantalla[2][2], "El centro de la matriz no es un espacio")
        );
    }

    @Test
    void RellenarPantalla(){

        // Creamos el vector que vamos a usar.
        String[] direcciones = {"I", "S", "B"};

        // Creamos una matriz acorde al vector.
        String[][] pantalla = {
                {"#", "#", "#", "#",  "#"},
                {"#", " ", " ", " ",  "#"},
                {"#", " ", " ", " ",  "#"},
                {"#", "_", "/", "\\", "#"},
                {"#", "#", "#", "#", "#"}
        };

        assertAll(
                // Comprobamos que la matriz tenga los simbolos que queremos en las posiciones que queremos.
                () -> assertEquals("_", pantalla[3][1], "La dirección I no está en la posición correcta"),
                () -> assertEquals("/", pantalla[3][2], "La dirección S no está en la posición correcta"),
                () -> assertEquals("\\", pantalla[3][3], "La dirección B no está en la posición correcta")
        );

    }

}