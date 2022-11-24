package es.unai;

import java.io.FileReader;

public class Ex4 {
    private final int END_READER = -1;

    public static void main(String[] args) throws Exception {
        new Ex4().start();
    }

    private void start() throws Exception {
        FileReader reader = new FileReader("problema4.txt");
        int read = reader.read();
        int vocals = 0;
        int consonants = 0;
        int spaces = 0;

        while (read != END_READER) {
            if (read == ' ') {
                spaces++;
            }else if (isVocal(read)) {
                vocals++;
            }else {
                consonants++;
            }
            read = reader.read();
        }
        System.out.println("Vocales: " + vocals);
        System.out.println("Consonantes: " + consonants);
        System.out.println("Espacios: " + spaces);
        reader.close();
    }

    public boolean isVocal(int charValue) {
        char character = (char) charValue;
        return character == 'a' || character == 'e' || character == 'i'
                || character == 'o' || character == 'u';
    }
}
