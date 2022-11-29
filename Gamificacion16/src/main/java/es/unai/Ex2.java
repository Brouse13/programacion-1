package es.unai;

/* ********************************************************************************************************************
 * Author:        Unai
 * Creation date: 28/11/2022
 * Last update:   28/11/2022
 * Description:   Given a file 'problema2.txt' display the first word with less than five characters.
 * Usage:
 ******************************************************************************************************************* */
public class Ex2 {
    private Palabra palabra;

    public static void main(String[] args) throws Exception {
        new Ex2().start();
    }

    private void start() throws Exception {
        PalabraFileReader reader = new PalabraFileReader("problema2.txt");
        boolean found = false;

        while (reader.next() && !found) {
            palabra = reader.read();

            if (palabra.getWordSize() < 5) {
                found = true;
            }
        }

        if (found) {
            System.out.println("La primera palabra con menos de 5 carácreres es: " + palabra);
        }else {
            System.out.println("No hay palabras con menos de 5 carácteres");
        }
        reader.close();
    }
}
