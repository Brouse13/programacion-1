package org.example;

import es.unai.LT;

/* ********************************************************************************************************************
 * Author:        Unai
 * Creation date: 20/10/22
 * Last update:   20/10/22
 * Description:   Get all the odd words in a char sequence
 * Usage:         Write a char sequence end in '.'

 ******************************************************************************************************************* */
public class OddWords {
    private static final char END_LINE = '.';
    private static final char SPACE = ' ';

    private static char character;

    public static void main(String[] args) {
        int odd = 0;

        System.out.print("Introduce la secuencia a analizar: ");
        character = LT.readChar();


        while (nextWord()) {
            if ((countWords() % 2) == 1) {
                odd++;
            }
        }

        System.out.printf("Hay %s palabras impares", odd);
    }

    private static boolean nextWord() {
        if (character == END_LINE)
            return false;

        //Move index to next word
        while (character == SPACE) {
            character = LT.readChar();
        }
        return true;
    }

    private static int countWords() {
        int count = 0;
        while (character != SPACE && character != END_LINE) {
            count++;
            character = LT.readChar();
        }
        return count;
    }
}