package es.unai;

public class Ex5 {
    public static void main(String[] args) throws Exception {
        new Ex5().start();
    }

    private void start() throws Exception {
        PalabraFileReader reader = new PalabraFileReader("problema4.txt");
        PalabraFileWriter writer = new PalabraFileWriter("problema4Decodificado.txt");

        while (reader.next()) {
            writer.write(reader.read().cesarEncode(26));
            writer.writeSpace();
        }

        reader.close();
        writer.close();
    }
}
