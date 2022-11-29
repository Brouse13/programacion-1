package es.unai;

/* ********************************************************************************************************************
 * Author:        Unai
 * Creation date: 29/11/2022
 * Last update:   29/11/2022
 * Description:   Given a file 'problema6.txt' ask for a word and display the times is contained inside the file.
 * Usage:         Write the words to find end in '.'
 ******************************************************************************************************************* */
public class Ex6 {
    private final Palabra readWord = new Palabra();
    private Palabra palabra;

    public static void main(String[] args) throws Exception {
        new Ex6().start();
    }

    private void start() throws Exception {
        boolean onlyOne = false;
        int count = 0;

        //Read only the first word
        System.out.println("Introduce la palabra a buscar");
        while (Palabra.existWords() && !onlyOne) {
            readWord.read();
            onlyOne = true;
        }

        PalabraFileReader reader = new PalabraFileReader("problema6.txt");

        while (reader.next()) {
            palabra = reader.read();

            if (palabra.equals(readWord)) {
                count++;
            }
        }

        System.out.println("La palabra " + readWord + " aparece " + count + " veces.");

        reader.close();
    }
}
