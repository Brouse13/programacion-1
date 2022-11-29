package es.unai;

/* ********************************************************************************************************************
 * Author:        Unai
 * Creation date: 28/11/2022
 * Last update:   28/11/2022
 * Description:   Given a file 'problema1.txt' show all the words with less than 5 characters
 * Usage:         Run the program
 ******************************************************************************************************************* */
public class Ex1 {
    private Palabra palabra;
    public static void main(String[] args) throws Exception {
        new Ex1().start();
    }

    private void start() throws Exception {
        PalabraFileReader reader = new PalabraFileReader("problema1.txt");

        while (reader.next()) {
            palabra = reader.read();
            if (palabra.getWordSize() < 5) {
                System.out.println(palabra);
            }
        }
        reader.close();
    }
}
