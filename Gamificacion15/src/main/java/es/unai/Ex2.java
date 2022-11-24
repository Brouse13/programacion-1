package es.unai;

import java.io.FileReader;

public class Ex2 {
    private final int END_READER = -1;

    public static void main(String[] args) throws Exception {
        new Ex2().start();
    }

    private void start() throws Exception {
        FileReader reader = new FileReader("problema2.txt");
        int read;
        boolean found = false;

        do {
            read = reader.read();
            if (isVocal(read)) {
                found = true;
            }
        }while (read != END_READER && !found);

        if (found) {
            System.out.println("El primer carácter vocal encontrado es: " + ((char) read));
        }else {
            System.out.println("No se ha encontrado ningún carácter vocal");
        }
        reader.close();
    }

    public boolean isVocal(int charValue) {
        char character = (char) charValue;
        return character == 'a' || character == 'e' || character == 'i'
                || character == 'o' || character == 'u';
    }
}
