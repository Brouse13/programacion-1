package es.unai;

import java.io.FileReader;

public class Ex1 {
    private final int END_READER = -1;

    public static void main(String[] args) throws Exception {
        new Ex1().start();
    }

    private void start() throws Exception {
        FileReader reader = new FileReader("problema1.txt");
        int read = reader.read();
        int count = 0;

        while (read != END_READER) {
            if (isVocal(read)) {
                count++;
            }
            read = reader.read();
        }
        System.out.println("Hay " + count + " carácteres vaocales");
        reader.close();
    }

    public boolean isVocal(int charValue) {
        char character = (char) charValue;
        return character == 'a' || character == 'e' || character == 'i'
                || character == 'o' || character == 'u';
    }
}
