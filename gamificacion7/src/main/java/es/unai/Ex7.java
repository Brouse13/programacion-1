package es.unai;

/* ********************************************************************************************************************
 * Author:        Unai
 * Creation date: 24/10/22
 * Last update:   24/10/22
 * Description:   Given a char sequence show words that have odd characters and at least 2 vocals.
 * Usage:         Write a char sequence end in '.'

 ******************************************************************************************************************* */
public class Ex7 {
    private static final char END_LINE = '.';
    private static final char SPACE = ' ';

    private static char character;

    public static void main(String[] args) {
        int valid = 0;
        System.out.print("Introduce la secuencia a analizar: ");
        character = LT.readChar();


        while (nextWord()) {
            if (isValid()) {
                valid++;
            }
        }

        System.out.printf("Hay %s palabra/s que tiene un número par de carácteres y almenos 2 vocales", valid);
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

    private static boolean isValid() {
        int vocals = 0;
        int characters = 0;

        while (character != SPACE && character != END_LINE) {
            if (character == 'a' || character == 'e' || character == 'i' || character == 'o' || character == 'u') {
                vocals++;
            }
            characters++;
            character = LT.readChar();
        }

        return (characters % 2) == 0 && vocals >= 2;
    }
}
