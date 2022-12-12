package es.unai;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PalabraTest {
    @Test
    void encode() {
        assertAll(
                () -> assertEquals('d', encode('a'))
        );
    }

    @Test
    void cesarEncode() {
        Palabra palabra = new Palabra("pqrstuvwxyz".toCharArray());

        assertAll(
                () -> assertFalse(palabra.equals(palabra.cesarEncode(3))),
                () -> assertTrue(palabra.equals(palabra.cesarEncode(3 + 23)))
        );
    }


    /* Encode method used in Palabra#cesarEncode(int); */
    private char encode(char character) {
        //DECLARACIONES
        final char [] ALFABETO="abcdefghijklmnopqrstuvwxyz".toCharArray();

        //ACCIONES
        //búsqueda en ALFABETO el caracter dado
        int indice=0;
        while (character !=ALFABETO[indice]) {
            indice++;
        }
        //retornar caracter codificado correspondiente
        return ALFABETO[(indice+3)%ALFABETO.length];
    }
}