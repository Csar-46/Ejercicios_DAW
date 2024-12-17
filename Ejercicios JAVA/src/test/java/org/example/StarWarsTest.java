package org.example;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;
class StarWarsTest {

    @Test
    void direcciones() {

        System.setIn(new ByteArrayInputStream("ISB".getBytes()));

        String[] result = StarWars.direcciones();
        assert result.length == 3;
        assert result[0].equals("I");
        assert result[1].equals("S");
        assert result[2].equals("B");

    }

    @Test
    void rellenarBordes() {

        String[][] pantalla = new String[5][5];
        StarWars.rellenarBordes(pantalla);

        for (int i = 0; i < pantalla.length; i++) {
            for (int j = 0; j < pantalla[i].length; j++) {
                if (i == 0 || i == pantalla.length - 1 || j == 0 || j == pantalla[i].length - 1) {
                    assert pantalla[i][j].equals("#");
                } else {
                    assert pantalla[i][j].equals(" ");
                }
            }
        }

    }
}