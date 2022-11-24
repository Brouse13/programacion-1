package es.unai;

import java.io.FileReader;
import java.io.FileWriter;

public class Ex5 {
    private final int END_READER = -1;

    public static void main(String[] args) throws Exception {
        new Ex5().start();
    }

    private void start() throws Exception {
        FileReader reader = new FileReader("problema5.txt");
        FileWriter writer = new FileWriter("problema5Salida.txt");

        int read = reader.read();

        while (read != END_READER) {
            if (read >= 97 && read <= 122) {
                writer.write(((char) (read - 32)));
            }else {
                writer.write(read);
            }
            read = reader.read();
        }

        writer.close();
        reader.close();
    }
}
