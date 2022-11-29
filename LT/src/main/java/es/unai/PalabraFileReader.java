package es.unai;

import java.io.BufferedReader;
import java.io.FileReader;

public class PalabraFileReader {
    private static final int END_FILE = -1;
    private static final int SPACE = ' ';
    private int readCode = SPACE;
    private final BufferedReader bufferedReader;

    public PalabraFileReader(String nombreFichero) throws Exception {
        bufferedReader = new BufferedReader(new FileReader(nombreFichero));
    }

    /**
     * Get if the given {@link #bufferedReader} has a next word to read
     * @return the read word
     * @throws Exception if the file is not found
     */
    public boolean next() throws Exception {
        buscarPalabra();
        return (readCode != END_FILE);
    }

    /**
     * Move the index of the {@link #bufferedReader} until it finds a
     * new alphabetic character.
     * @throws Exception if the file is not found
     */
    private void buscarPalabra() throws Exception {
        //Read from the BufferReader until we find a vocal/consonant character
        while (!isCharacter() && readCode != END_FILE) {
            readCode = bufferedReader.read();
        }
    }

    /**
     * Read from the {@link #bufferedReader} the next word found.
     * It will be stored in a {@link Palabra}
     * @return the read word
     * @throws Exception if the file doesn't exist
     */
    public Palabra read() throws Exception {
        Palabra palabra = new Palabra();

        //Check if the character is in range of [a, z] && [A, Z]
        while (isCharacter()) {
            //Add the character to the word and read next character
            palabra.addCharacter((char) readCode);
            readCode = bufferedReader.read();
        }
        return palabra;
    }

    /**
     * Close the {@link #bufferedReader}
     * @throws Exception if the file doesn't exist
     */
    public void close() throws Exception {
        bufferedReader.close();
    }

    /**
     * Check if the readCharacter is a
     * @return if the {@link #readCode} is a vocal / consonant character
     */
    private boolean isCharacter() {
        return (readCode >= 'a' && readCode <= 'z') || (readCode >= 'A' && readCode <= 'Z');
    }
}
