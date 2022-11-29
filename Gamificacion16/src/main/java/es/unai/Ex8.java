package es.unai;

public class Ex8 {
    private final Palabra readWord = new Palabra();
    private Palabra palabra;

    public static void main(String[] args) throws Exception {
        new Ex8().start();
    }

    private void start() throws Exception {
        PalabraFileReader reader = new PalabraFileReader("problema8.txt");
        boolean onlyOne = false;
        boolean found = false;

        System.out.println("Introduce la palabra a leer: ");
        while (Palabra.existWords() && !onlyOne) {
            readWord.read();
            onlyOne = true;
        }

        while (reader.next() && !found) {
            palabra = reader.read();

            if (palabra.equals(readWord)) {
                found = true;
            }
        }

        if (found) {
            System.out.println("El archivo contiene la palabra " + readWord);
        }else {
            System.out.println("El archivo no contiene la palabra " + readWord);
        }
    }
}
