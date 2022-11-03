package es.unai;

/* ********************************************************************************************************************
 * Author:        Unai
 * Creation date: 24/10/22
 * Last update:   24/10/22
 * Description:   Given a char sequence show words with odd number of vocals
 * Usage:         Write a char sequence end in '.'

 ******************************************************************************************************************* */
public class Ex1 {
    private static final char END_LINE = '.';
    private static final char SPACE = ' ';

    private static char character;

    public static void main(String[] args) {
        int odd = 0;

        System.out.print("Introduce la secuencia a analizar: ");
        character = LT.readChar();


        while (nextWord()) {
            if ((countWords() % 2) == 1) {
                odd++;
            }
        }

        System.out.printf("Hay %s palabra/s con el número de vocales impar", odd);
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

    private static int countWords() {
        int count = 0;
        while (character != SPACE && character != END_LINE) {
            if (character == 'a' || character == 'e' || character == 'i' || character == 'o' || character == 'u') {
                count++;
            }
            character = LT.readChar();
        }
        return count;
    }
}
