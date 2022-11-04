package es.unai;

/* ********************************************************************************************************************
 * Author:        Unai
 * Creation date: 04/11/2022
 * Last update:   04/11/2022
 * Description:   Given a char sequence show all the words that contain different consonants
 * Usage:         Write a char sequence end in '.'
 ******************************************************************************************************************* */

public class Ex1 {
    private final char END_LINE = '.';
    private final char SPACE = ' ';


    private char character;
    private int numberWords;

    public static void main(String[] args) {
        new Ex1().start();
    }

    private void start() {
        char[] word = new char[20];

        System.out.println("Introduce una secuencia a analizar.");
        character = LT.readChar();

        while (nextWord()) {
            readWord(word);

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

        numberWords = index;
    }

    private boolean isValid(char[] word) {
        final char[] LETTERS = {'b','c','d','f','g','h','j','k','l','m','n',
                                'ñ', 'p','q','r','s','t','v','w','x','y','z'};
        boolean[] valid = new boolean[LETTERS.length];

        for (int i = 0; i < word.length; i++) {
            int index = findIndex(LETTERS, word[i]);

            //We have an index in the array
            if (index != -1) {
                if (valid[index]) {
                    return false;
                }else {
                    valid[index] = true;
                }
            }
        }
        return true;
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
