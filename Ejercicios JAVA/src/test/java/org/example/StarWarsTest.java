package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StarWarsTest {

    @Test
    void rellenarBordes() {

        String[][] pantalla = new String[5][5];
        StarWars.rellenarBordes(pantalla);

        for (int i = 0; i < pantalla.length; i++) {
            for (int j = 0; j < pantalla[i].length; j++) {

                if (i == 0 || i == 4 || j == 0 || j == 4) {

                    assertEquals("#", pantalla[i][j]);

                } else {

                    assertEquals(" ", pantalla[i][j]);

                }
            }
        }
    }

    @Test
    void rellenarPantalla() {

        String[][] pantalla = new String[5][10];
        StarWars.rellenarBordes(pantalla);

        String[] direcciones = {"I", "S", "I", "B"};
        StarWars.rellenarPantalla(pantalla, direcciones);
        
        assertEquals("_", pantalla[3][1]);
        assertEquals("/", pantalla[2][2]);
        assertEquals("_", pantalla[2][3]);
        assertEquals("\\", pantalla[3][4]);
    }
}