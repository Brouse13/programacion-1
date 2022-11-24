package es.unai;

import java.io.FileReader;

public class Ex3 {
    private final int END_READER = -1;

    public static void main(String[] args) throws Exception {
        new Ex3().start();
    }

    private void start() throws Exception {
        FileReader reader = new FileReader("problema3.txt");
        int count = 0;
        int read;
        boolean found = false;

        do {
            read = reader.read();
            if (found) {
                if (read == 'a') {
                    count++;
                }
                found = false;
            }
            if (read == 'l') {
                found = true;
            }
        }while (read != END_READER);
        System.out.println("Hay " + count + " parejas de 'la'");
        reader.close();
    }

    public boolean isVocal(int charValue) {
        char character = (char) charValue;
        return character == 'a' || character == 'e' || character == 'i'
                || character == 'o' || character == 'u';
    }
}
