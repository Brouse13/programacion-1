package es.unai;

public class Ex3 {
    private Palabra palabra;
    public static void main(String[] args) throws Exception {
        new Ex3().start();
    }

    private void start() throws Exception {
        PalabraFileReader reader = new PalabraFileReader("problema3.txt");
        PalabraFileWriter writer = new PalabraFileWriter("palabrasMenosCinco.txt");

        while (reader.next()) {
            palabra = reader.read();

            if (palabra.getWordSize() < 5) {
                writer.write(palabra);
                writer.writeSpace();
            }
        }
        reader.close();
        writer.close();
    }
}
