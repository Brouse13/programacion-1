package es.unai;

/* ********************************************************************************************************************
 * Author:        Unai
 * Creation date: 28/11/2022
 * Last update:   28/11/2022
 * Description:   Given two files 'problema5_1.txt' and 'problema5_2.txt' show all the words that are palindrom.
 * Usage:         Run the program
 ******************************************************************************************************************* */
public class Ex5 {
    private Palabra palabra;
    public static void main(String[] args) throws Exception {
        new Ex5().start();
    }

    private void start() throws Exception {
        PalabraFileReader reader1 = new PalabraFileReader("problema5_1.txt");
        PalabraFileReader reader2 = new PalabraFileReader("problema5_2.txt");

        System.out.println("Las palabras palindromo son: ");
        isPalindromo(reader1);
        isPalindromo(reader2);

        reader1.close();
        reader2.close();
    }

    private void isPalindromo(PalabraFileReader reader) throws Exception {
        while (reader.next()) {
            palabra = reader.read();

            if (palabra.isPalindromo()) {
                System.out.println(palabra);
            }
        }
    }
}
