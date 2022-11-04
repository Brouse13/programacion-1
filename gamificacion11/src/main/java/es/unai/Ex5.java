package es.unai;

/* ********************************************************************************************************************
 * Author:        Unai
 * Creation date: 04/11/2022
 * Last update:   04/11/2022
 * Description:   Given a char sequence show all the words that contain different consonants
 * Usage:         Write a char sequence end in '.'
 ******************************************************************************************************************* */

import java.util.Arrays;

public class Ex5 {
    private final char END_LINE = '.';
    private final char SPACE = ' ';


    private char character;
    private int numberWords;

    public static void main(String[] args) {
        new Ex5().start();
    }

    private void start() {
        char[] word = new char[20];

        System.out.println("Introduce una secuencia a analizar.");
        character = LT.readChar();

        while (nextWord()) {
            readWord(word);
            System.out.println(Arrays.toString(word));

            if (isValid(word)) {
                display(word);
            }
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
        final char[] LETTERS = {'m', 'e', 'n', 't', 'e'};

        for (int i = 0; i < word.length; i++) {
            if (word[i] == LETTERS[0] && validateSequence(word, LETTERS, i)) {
                return true;
            }
        }
        return false;
    }

    private boolean validateSequence(char[] word, char[] sequence, int index) {
        //If there is no enough length to read return false
        if ((index + sequence.length) > numberWords) {
            return false;
        }

        for (int i = 0; i < sequence.length; i++) {
            if (sequence[i] != word[index + i]) {
                return false;
            }
        }

        return true;
    }

    private void display(char[] word) {
        for (int i = 0; i < numberWords; i++) {
            System.out.print(word[i]);
        }
        System.out.println();
    }
}
