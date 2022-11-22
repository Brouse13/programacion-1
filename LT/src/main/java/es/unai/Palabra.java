package es.unai;

import java.util.Arrays;

/**
 * Palabras class is used to simplify the use of Strings in Programacion1 classes
 */
public class Palabra {
    //MAX CHARACTERS LENGTH PER WORD
    private static final int MAX_CHARS = 20;
    //END OF SEQUENCE CHARACTER
    private static final char END_LINE = '.';
    //SPACE CHARACTER
    private static final char SPACE = ' ';
    //CURRENTLY CHARACTER READ
    private static char character = SPACE;

    //STORAGE OF THE WORD
    private final char[] word = new char[MAX_CHARS];
    //NUMBER OF CHARACTERS ON THE WORD
    private int wordSize;

    public Palabra() {
        wordSize = 0;
    }

    public static boolean existWords() {
        searchWord();
        return (character != END_LINE);
    }

    //declaración método privado buscarPalabra que lleva cabo la búsqueda
    //de una palabra en la secuencia de caracteres introducida por teclado
    private static void searchWord() {
        while ((!(((character>='a') && (character<='z')) || ((character >= 'A') && (character <= 'Z'))))
                && (character != END_LINE)){
            character = LT.readChar();
        }
    }

    /**
     * Read the word from the default {@link System#in} and store
     * it in {@link Palabra#word}
     */
    public void read() {
        wordSize = 0;

        //Loop to read the word
        while ((character != END_LINE) && (character != SPACE)) {
            word[wordSize] = character;
            character = LT.readChar();
            wordSize++;
        }
    }

    /**
     * Get the number of characters that has the currently {@link Palabra}
     * @return the word number of characters
     */
    public int getWordSize() {
        return wordSize;
    }

    /**
     * Get if the currently stored word contains all the 5 vocals
     * @return is the word contains all the vocals
     */
    public boolean hasFiveVocals() {
        //ARRAY TO CHECK THE VOCALS
        boolean[] apariciones = {false, false, false, false, false};

        //LOOP THROW ALL THE CHARACTERS ON THE WORD
        for (int indice = 0; indice < wordSize; indice++) {
            switch (word[indice]) {
                case 'a' -> apariciones[0] = true;
                case 'e' -> apariciones[1] = true;
                case 'i' -> apariciones[2] = true;
                case 'o' -> apariciones[3] = true;
                case 'u' -> apariciones[4] = true;
            }
        }

        //RETURN IF THE ARRAY GOT ALL INDEXES TRUE
        return check(apariciones);
    }

    /**
     * Get the number of vocals on the current word
     * @return the numbers of vocals on the word
     */
    public int getNumberOfVocals() {
        int numeroVocales = 0;

        //LOOP THROW ALL THE WORDS
        for (int indice = 0; indice < wordSize; indice++) {
            if (isVocal(word[indice])) {
                numeroVocales++;
            }
        }
        //DEVOLUCIÓN CONTADOR
        return numeroVocales;
    }

    /**
     * Flip the position of all the words
     */
    public void flip() {
        final char[] tempWord = copyArray(word);

        for (int i = 0; i < wordSize; i++) {
            word[i] = tempWord[wordSize - i - 1];
        }
    }

    /**
     * Convert the stored word in UpperCase
     */
    public void toUpperCase() {
        for (int i = 0; i < wordSize; i++) {
            if (word[i] >= 97 && word[i] <=122) {
                word[i] = ((char) (word[i] - 32));
            }
        }
    }

    /**
     * Get if the given word ends in a given {@param character}
     * @param character character to end with
     * @return if the word ends with a character
     */
    public boolean endsWith(char character) {
        return (word[wordSize - 1] == character);
    }

    /**
     * Get if the given word starts with a given {@param character}
     * @param character character to starts with
     * @return if the word starts with a character
     */
    public boolean startsWith(char character) {
        return (word[0] == character);
    }

    public boolean contains(char[] arr) {
        int index = 0;

        for (int i = 0; i < wordSize; i++) {
            if (word[i] == arr[index]) {
                //We have found all the chars on the row
                if (index == arr.length - 1) {
                    return true;
                }
                index++;
            }else {
                //The sequence doesn't mach, reset
                index = 0;
            }
        }
        return false;
    }
    /**
     * Get if the given word contains all the index set to true .
     * Used in {@link Palabra#hasFiveVocals()}.
     * @param datos boolean array to check
     * @return if the array is all true
     */
    private boolean check(boolean [] datos) {
        //LOOP THROW ALL THE COMPONENTS
        for (int indice = 0; indice < datos.length; indice++) {
            if (!datos[indice]) {
                return false;
            }
        }
        return true;
    }

    /**
     * Get if the given character is a vocal.
     * @param character character to check
     * @return if the character is a vocal
     */
    private boolean isVocal(char character) {
        return ((character=='a') || (character=='e') || (character=='i') || (character=='o') || (character=='u'));
    }

    /**
     * Create a new copy of the given array
     * @param arr arr to copy
     * @return the new array
     */
    private char[] copyArray(char[] arr) {
        char[] copy = new char[MAX_CHARS];

        for (int i = 0; i < arr.length; i++) {
            copy[i] = arr[i];
        }
        return copy;
    }

    @Override
    public String toString() {
        String resultado = "";

        //LOOP THROW ALL THE WORDS
        for (int indice = 0; indice < wordSize; indice++) {
            resultado += word[indice];
        }

        return resultado;
    }
}