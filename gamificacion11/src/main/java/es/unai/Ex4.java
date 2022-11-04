package es.unai;

/* ********************************************************************************************************************
 * Author:        Unai
 * Creation date: 04/11/2022
 * Last update:   04/11/2022
 * Description:   Given a char sequence show the first word with double consonants than vocals
 * Usage:         Write a char sequence end in '.'
 ******************************************************************************************************************* */

public class Ex4 {
    private final char END_LINE = '.';
    private final char SPACE = ' ';


    private char character;
    private int numberWords;

    public static void main(String[] args) {
        new Ex4().start();
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
        final char[] LETTERS = {'a', 'e', 'i', 'o', 'u', ' '};
        int count = 0;

        for (int i = 0; i < word.length; i++) {
            int index = findIndex(LETTERS, word[i]);

            //We have valid consonant
            if (index == -1) {
                count++;
            }
        }

        return 2 * (numberWords - count) ==  count;
    }

    private int findIndex(char[] letters, char character) {
        for (int i = 0; i < letters.length; i++) {
            if (character == letters[i]) {
                return i;
            }
        }
        return -1;
    }

    private void display(char[] word) {
        for (int i = 0; i < numberWords; i++) {
            System.out.print(word[i]);
        }
        System.out.println();
    }
}
