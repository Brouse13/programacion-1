package es.unai;

/* ********************************************************************************************************************
 * Author:        Unai
 * Creation date: 09/12/2022
 * Last update:   09/12/2022
 * Description:   Given a file 'problema3.txt' show the times each character ahs appeared ate least one's.
 * Usage:         Run the program
 ******************************************************************************************************************* */
public class Ex2 {
    public static void main(String[] args) throws Exception {
        new Ex2().start();
    }

    private void start() throws Exception {
        final int[] times = new int[26];
        PalabraFileReader reader = new PalabraFileReader("problema3.txt");

        while (reader.next()) {
            Palabra palabra = reader.read();
            char[] characters = palabra.getCharacters();

            for (int i = 0; i < palabra.getWordSize(); i++) {
                if (characters[i] >= 'a' && characters[i] <= 'z') {
                    //LowerCase
                    times[characters[i] - 'a']++;
                }else {
                    //UpperCase
                    times[characters[i] - 'A']++;
                }
            }
        }

        System.out.println("Repeticiones de cada carácter: ");
        for (int i = 0; i < times.length; i++) {
            if (times[i] >= 1) {
                System.out.println(((char) (i + 'a')) + ": " + times[i]);
            }
        }

        reader.close();
    }
}
