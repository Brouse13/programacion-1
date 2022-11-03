package es.unai;

/* ********************************************************************************************************************
 * Author:        Unai
 * Creation date: 24/10/22
 * Last update:   24/10/22
 * Description:   Given a char sequence show the amount of words with weight higher to 1000
 * Usage:         Write a char sequence end in '.'

 ******************************************************************************************************************* */
public class Ex9 {
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

        System.out.printf("Hay %s palabra/s con un peso superior a 1000", valid);
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
        int weight = 0;

        while (character != SPACE && character != END_LINE) {
            weight += character;
            character = LT.readChar();
        }

        return weight > 1000;
    }
}
