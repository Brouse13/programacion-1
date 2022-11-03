package es.unai;

/* ********************************************************************************************************************
 * Author:        Unai
 * Creation date: 24/10/22
 * Last update:   24/10/22
 * Description:   Given a char sequence starts with 'ab'.
 * Usage:         Write a char sequence end in '.'

 ******************************************************************************************************************* */
public class Ex8 {
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
        boolean valid = false;
        char storage = character;
        int pointer = 0;

        while (character != SPACE && character != END_LINE) {
            //Use pointer only to find second word
            if (pointer == 1) {
                valid =  storage == 'a' && character == 'b';
            }
            character = LT.readChar();
            pointer++;
        }

        return valid;
    }
}
