package es.unai;

/* ********************************************************************************************************************
 * Author:        Unai
 * Creation date: 04/11/2022
 * Last update:   04/11/2022
 * Description:   Given a char sequence show all the words that contain different consonants
 * Usage:         Write a char sequence end in '.'
 ******************************************************************************************************************* */

import java.lang.module.InvalidModuleDescriptorException;

public class Ex2 {
    private final char END_LINE = '.';
    private final char SPACE = ' ';


    private char character;
    private int numberWords;

    public static void main(String[] args) {
        new Ex2().start();
    }

    private void start() {
        char[] word = new char[20];
        boolean valid = false;

        System.out.println("Introduce una secuencia a analizar.");
        character = LT.readChar();

        while (nextWord() && !valid) {
            readWord(word);

            if (isValid(word)) {
                valid = true;
            }
        }

        if (valid) {
            display(word);
        }
    }

    private boolean nextWord() {
        while(character == SPACE) {
            character = LT.readChar();
        }

        return character != END_LINE;
    }

    private void readWord(char[] word) {
        int index = 0;

        while((character != SPACE) && (character != END_LINE)) {
            word[index] = character;
            character = LT.readChar();
            index++;
        }

        //We fill blank spaces to improve readability
        for (int i = index; i < word.length; i++) {
            word[i] = SPACE;
        }
        numberWords = index;
    }

    private boolean isValid(char[] word) {
        for (int i = 0; i < word.length; i++) {
            if (word[i] == SPACE) {
                return (i % 2) == 1;
            }
        }
        return (word.length % 2) == 1;
    }

    private void display(char[] word) {
        for (int i = 0; i < numberWords; i++) {
            System.out.print(word[i]);
        }
        System.out.println();
    }
}
