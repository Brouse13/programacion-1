package es.unai;

/* ********************************************************************************************************************
 * Author:        Unai
 * Creation date: 11/12/2022
 * Last update:   11/12/2022
 * Description:   Given a file 'problema2.txt' display the times each words appears
 * Usage:         Run the program
 ******************************************************************************************************************* */
public class Ex3 {
    public static void main(String[] args) throws Exception {
        new Ex3().start();
    }

    private void start() throws Exception {
        PalabraFileReader reader = new PalabraFileReader("problema2.txt");

        Palabra palabra;
        int numPalabras = 0;
        Palabra[] words = new Palabra[500];
        int[] times = new int[500];

        //Start reading each word from file
        while (reader.next()) {
            boolean duplicate = false;
            //Read the current word
            palabra = reader.read();

            //For each read we ensure is not a duplicate word
            for (int i = 0; i < numPalabras; i++) {
                //If we found duplicate word increase its index and stop loop
                if (words[i].equals(palabra)) {
                    times[i]++;
                    duplicate = true;
                    break;
                }
            }

            if (!duplicate) {
                words[numPalabras] = palabra;
                times[numPalabras] = 1;
                numPalabras++;
            }
        }

        //When we have process all the words we display the times
        System.out.println("Frecuencia de palabras");
        for (int i = 0; i < numPalabras; i++) {
            System.out.println(words[i] + ": " + times[i]);
        }

        reader.close();
    }
}
