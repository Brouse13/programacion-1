package es.unai;

/* ********************************************************************************************************************
 * Author:        Unai
 * Creation date: 31/10/2022
 * Last update:   31/10/2022
 * Description:   Given a char sequence, show it inverted
 * Usage:         Write a char sequence end in. (Max 100 chars)
 ******************************************************************************************************************* */

public class Ex1 {
    private final char[] chars = new char[100];

    public static void main(String[] args) {
        new Ex1().start();
    }

    private void start() {
        System.out.println("Introduce la secuencia a leer: ");
        int i = saveSentence();
        showSentence(i);
    }

    private int saveSentence() {
        final char END_LINE = '.';

        char character = LT.readChar();
        int index = 0;

        while (character != END_LINE)  {
            chars[index] = character;

            character = LT.readChar();
            index++;
        }
        return index - 1;
    }

    private void showSentence(int index) {
        for (int i = index; i >= 0; i--) {
            System.out.print(chars[i]);
        }
    }
}
