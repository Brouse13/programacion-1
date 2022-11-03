package es.unai;

/* ********************************************************************************************************************
 * Author:        Unai
 * Creation date: 24/10/22
 * Last update:   24/10/22
 * Description:   Given a char sequence show words with odd number of vocals and even number of consonants
 * Usage:         Write a char sequence end in '.'

 ******************************************************************************************************************* */
public class Ex2 {
    private static final char END_LINE = '.';
    private static final char SPACE = ' ';

    private static int oddVocals = 0;
    private static int evenConsonants = 0;
    private static char character;

    public static void main(String[] args) {
        System.out.print("Introduce la secuencia a analizar: ");
        character = LT.readChar();


        while (nextWord()) {
            processWord();
        }

        System.out.printf("Hay %s palabra/s con el número de vocales impar y %d con un número par de consonantes",
                oddVocals, evenConsonants);
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

    private static void processWord() {
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

        if ((vocals % 2) == 1) {
            oddVocals++;
        }
        if ((consonants % 2) == 0) {
            evenConsonants++;
        }
    }
}
