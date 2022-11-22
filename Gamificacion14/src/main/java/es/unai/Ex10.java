package es.unai;

/* ********************************************************************************************************************
 * Author:        Unai
 * Creation date: 22/11/2022
 * Last update:   22/11/2022
 * Description:   Given a char sequence display the capicua words
 * Usage:         Write a char sequence end in '.'
 ******************************************************************************************************************* */
public class Ex10 {
    private final char END_LINE = '.';
    private final char SPACE = ' ';

    private char character;
    private int wordLength = 0;

    public static void main(String[] args) {
        new Ex10().start();
    }

    private void start() {
        wordLength = 2;
        char[] word = new char[20];
        boolean first = true;

        System.out.println("Introduce una secuencia a analizar: ");
        while (hasNextWord()) {
            readWord(word);

            if (isCapicua(word)) {
                if (first) {
                    System.out.println("Las palabras palíndromo son: ");
                    first = false;
                }
                display(word);
            }
        }

        if (first) {
            System.out.println("No hay palabras palíndromo");
        }
    }

    private boolean hasNextWord() {
        if (character == END_LINE) {
            return false;
        }

        while (character == SPACE) {
            character = LT.readChar();
        }
        return true;
    }

    private void readWord(char[] word) {
        wordLength = 0;

        while (character != SPACE && character != END_LINE) {
            character = LT.readChar();
            word[wordLength] = character;
            wordLength++;
        }
        wordLength--;
    }

    public boolean isCapicua(char[] word) {
        //If the word is even can't be capicua
        if ((wordLength % 2) == 1) {
            return false;
        }

        for (int i = 0; i < wordLength / 2; i++) {
            if (word[i] != word[wordLength - i - 1]) {
                return false;
            }
        }
        return true;
    }

    private void display(char[] word) {
        for (int i = 0; i < wordLength; i++) {
            System.out.print(word[i]);
        }
    }
}
