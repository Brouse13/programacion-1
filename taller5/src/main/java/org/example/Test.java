package org.example;

import es.unai.LT;

/* ********************************************************************************************************************
 * Author:        Unai
 * Creation date: 20/10/22
 * Last update:   20/10/22
 * Description:   Get all the odd words end in 'o'
 * Usage:         Write a char sequence end in '.'

 ******************************************************************************************************************* */
public class Test {
    private static final char END_LINE = '.';
    private static final char SPACE = ' ';

    private static char character;

    public static void main(String[] args) {
        int valid = 0;

        System.out.print("Introduce la secuencia a analizar: ");
        character = LT.readChar();


        while (nextWord()) {
            if (isWord()) {
                valid++;
            }
        }

        System.out.printf("Hay %s palabras acabadas en 'o'", valid);
    }

    private static boolean nextWord() {
        if (character == END_LINE)
            return false;

        //Move index to next word
        while (character != 'o') {
            character = LT.readChar();
        }
        return true;
    }

    private static boolean isWord() {
        character = LT.readChar();

        return character == SPACE || character == END_LINE;
    }
}
