package es.unai;

/* ********************************************************************************************************************
 * Author:        Unai
 * Creation date: 24/10/22
 * Last update:   24/10/22
 * Description:   Given a char sequence show the amount of words that contains a vocal
 * Usage:         Write a char sequence end in '.'

 ******************************************************************************************************************* */
public class Ex5 {
    private static final char END_LINE = '.';
    private static final char SPACE = ' ';

    private static char character;

    public static void main(String[] args) {
        int hasVocal = 0;

        System.out.print("Introduce la secuencia a analizar: ");
        character = LT.readChar();
        long l = System.currentTimeMillis();

        while (nextWord()) {
            if (hasVocal()) {
                hasVocal++;
            }
        }

        System.out.printf("Hay %s palabra/s que tienen al menos 1 vocal", hasVocal);
        System.out.println("Execution " + (System.currentTimeMillis() - l));
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

    private static boolean hasVocal() {
        boolean vocal = false;

        while (character != SPACE && character != END_LINE) {
            //We negate the vocal because if we have found  a vocal is not necessary
            //to treat the character
            if (!vocal && character == 'a' || character == 'e' || character == 'i' || character == 'o' || character == 'u') {
                vocal = true;
            }
            character = LT.readChar();
        }
        return vocal;
    }
}
