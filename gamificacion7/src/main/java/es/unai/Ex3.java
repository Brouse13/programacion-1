package es.unai;

/* ********************************************************************************************************************
 * Author:        Unai
 * Creation date: 24/10/22
 * Last update:   24/10/22
 * Description:   Given a char sequence show the amount of words ends in vocal
 * Usage:         Write a char sequence end in '.'

 ******************************************************************************************************************* */
public class Ex3 {
    private static final char END_LINE = '.';
    private static final char SPACE = ' ';

    private static char character;

    public static void main(String[] args) {
        int endVocal = 0;

        System.out.print("Introduce la secuencia a analizar: ");
        character = LT.readChar();


        while (nextWord()) {
            if (endsVocal()) {
                endVocal++;
            }
        }

        System.out.printf("Hay %s palabra/s que terminan en vocal", endVocal);
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

    private static boolean endsVocal() {
        boolean vocal = false;

        while (character != SPACE && character != END_LINE) {
            if (character == 'a' || character == 'e' || character == 'i' || character == 'o' || character == 'u') {
                vocal = true;
            }else {
                vocal = false;
            }
            character = LT.readChar();
        }
        return vocal;
    }
}
