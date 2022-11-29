package es.unai;

import java.io.BufferedWriter;
import java.io.FileWriter;

public class PalabraFileWriter {
    private static final int SPACE = ' ';
    private static final int RETURN = '\r';

    private static final int NEW_LIN = '\n';
    private final BufferedWriter bufferedWriter;

    public PalabraFileWriter(String nombreFichero) throws Exception {
        bufferedWriter = new BufferedWriter(new FileWriter(nombreFichero));
    }

    /**
     * Write the {@param palabra} into the {@link #bufferedWriter}
     * @param palabra word to write
     * @throws Exception if the file wasn't found
     */
    public void write(Palabra palabra) throws Exception {
        //Loop throw all the word characters and write it to the BufferedWriter
        for (int i = 0; i < palabra.getWordSize(); i++) {
            bufferedWriter.write(palabra.getCharacter(i));
        }
    }

    /**
     * Write and space to the {@link #bufferedWriter}
     * @throws Exception if the file wasn't found
     */
    public void writeSpace() throws Exception {
        bufferedWriter.write(SPACE);
    }

    /**
     * Write to the {@link #bufferedWriter} a new line.
     * @apiNote In linux or mac is only necessary the {@link #NEW_LIN}, in
     * windows is necessary {@link #NEW_LIN} and {@link #RETURN}.
     * @throws Exception it the file wasn't found
     */
    public void newLine() throws Exception {
        bufferedWriter.write(RETURN);
        bufferedWriter.write(NEW_LIN);
    }

    /**
     * Close the {@link #bufferedWriter}
     * @throws Exception if the file doesn't exist
     */
    public void close() throws Exception {
        bufferedWriter.close();
    }
}
