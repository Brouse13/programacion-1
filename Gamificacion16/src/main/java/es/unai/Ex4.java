package es.unai;

/* ********************************************************************************************************************
 * Author:        Unai
 * Creation date: 28/11/2022
 * Last update:   28/11/2022
 * Description:   Given a file 'problema4.txt' display in a file each word depending on the number of characters
 * Usage:         Run the program
 ******************************************************************************************************************* */
public class Ex4 {
    private Palabra palabra;

    public static void main(String[] args) throws Exception {
        new Ex4().start();
    }

    private void start() throws Exception {
        PalabraFileReader reader = new PalabraFileReader("problema4.txt");
        PalabraFileWriter[] writers = new PalabraFileWriter[20];

        //Open all the writers
        for (int i = 1; i <= writers.length; i++) {
            writers[i - 1] = new PalabraFileWriter("palabras" + i + ".txt");
        }

        while (reader.next()) {
            palabra = reader.read();
            //Get the witer (i -1) and append the content
            writers[palabra.getWordSize() - 1].write(palabra);
            writers[palabra.getWordSize() - 1].writeSpace();
        }

        //Close all the writers
        for (int i = 0; i < writers.length; i++) {
            writers[i].close();
        }
        reader.close();
    }
}
