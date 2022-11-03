package es.unai;

/* ********************************************************************************************************************
 * Author:        Unai
 * Creation date: 24/10/22
 * Last update:   24/10/22
 * Description:   Given a char sequence show words with 2 vocals and 3 consonants
 * Usage:         Write a char sequence end in '.'

 ******************************************************************************************************************* */
public class Ex6 {
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

        System.out.printf("Hay %s palabra/s que tienen 2 vocales y 3 consonantes", valid);
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
        int consonants = 0;

        while (character != SPACE && character != END_LINE) {
            if (character == 'a' || character == 'e' || character == 'i' || character == 'o' || character == 'u') {
                vocals++;
            }else {
                consonants++;
            }
            character = LT.readChar();
        }

        return vocals == 2 && consonants == 3;
    }
}
