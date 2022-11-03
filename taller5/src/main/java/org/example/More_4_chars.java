package org.example;

import es.unai.LT;

/* ********************************************************************************************************************
 * Author:        Unai
 * Creation date: 20/10/22
 * Last update:   20/10/22
 * Description:   Find all the words with more than 4 characters
 * Usage:         Write a char sequence end in '.'

 ******************************************************************************************************************* */
public class More_4_chars {
    private static final char END_LINE = '.';
    private static final char SPACE = ' ';
    private static final int LIMIT = 4;

    private static char character;

    public static void main(String[] args) {
        int valid = 0;

        System.out.print("Introduce la secuencia a analizar: ");
        character = LT.readChar();

        //Check if there's another word
        while (nextWord()) {
            //Next character
            nextWord();

            if (countWords() >= LIMIT) {
                valid++;
            }
        }

        System.out.println("Hay " + valid + " palabra/s con más de " + LIMIT + " LETRAS");
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