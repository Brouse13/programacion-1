package es.unai;

/* ********************************************************************************************************************
 * Author:        Unai
 * Creation date: 18/11/2022
 * Last update:   18/11/2022
 * Description:   Given a char sequence get if is a vocalisation
 * Usage:         Write a char sequence end in '.'
 ******************************************************************************************************************* */

public class Ex4 {
    private final char END_LINE = '.';
    private final char SPACE = ' ';

    private char character;
    private int wordLength = 0;

    public static void main(String[] args) {
        new Ex4().start();
    }

    private void start() {
        char uniqueVocal = SPACE;
        boolean invalid = false;
        char[] word = new char[20];

        while (hasNextWord() && !invalid) {
            readWord(word);

            //If the word contains a unique vocal continue
            if (isVocalUnique(word)) {
                char readVocal = getUniqueVocal(word);

                //If the readVocal is different to SPACE we have found a vocal on the word
                if (readVocal != SPACE) {
                    //Validate the vocal is unique
                    if (uniqueVocal != SPACE && uniqueVocal != readVocal) {
                        invalid = true;
                    }else {
                        uniqueVocal = readVocal;
                    }
                }
            }else {
                invalid = true;
            }
        }

        if (invalid) {
            System.out.println("Sí, es un monovocalismo.");
        }else {
            System.out.println("No, no es un monovocalismo.");
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

    private boolean isVocalUnique(char[] word) {
        char vocal = ' ';
        boolean foundVocal = false;

        for (int i = 0; i < wordLength; i++) {
            if (word[i] == 'a' || word[i] == 'e' || word[i] == 'i' || word[i] == 'o' || word[i] == 'u') {
                if (foundVocal) {
                    if (word[i] != vocal) {
                        return false;
                    }
                }else {
                    vocal = word[i];
                    foundVocal = true;
                }
            }
        }
        return true;
    }

    private char getUniqueVocal(char[] word) {
        for (int i = 0; i < wordLength; i++) {
            if (word[i] == 'a' || word[i] == 'e' || word[i] == 'i' || word[i] == 'o' || word[i] == 'u') {
                return word[i];
            }
        }
        return SPACE;
    }
}