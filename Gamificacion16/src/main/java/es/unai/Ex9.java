package es.unai;

/* ********************************************************************************************************************
 * Author:        Unai
 * Creation date: 29/11/2022
 * Last update:   29/11/2022
 * Description:   Given two words substitute the first word by the second one on the file 'problema9.txt' amd write
 *                it on the file 'problema9Salida.txt'
 * Usage:         Write two words end in '.'
 ******************************************************************************************************************* */
public class Ex9 {
    private final Palabra palabra1 = new Palabra();
    private final Palabra palabra2 = new Palabra();
    private Palabra readWord;

    public static void main(String[] args) throws Exception {
        new Ex9().start();
    }

    private void start() throws Exception {
        PalabraFileReader reader = new PalabraFileReader("problema9.txt");
        PalabraFileWriter writer = new PalabraFileWriter("problema9Salida.txt");

        System.out.println("Introduce la palabra a reemplazar");
        while (Palabra.existWords()) {
            palabra1.read();
        }

        System.out.println("Introduce la palabra para reemplazar");
        while (Palabra.existWords()) {
            palabra2.read();
        }

        while (reader.next()) {
            readWord = reader.read();

            if (readWord.equals(palabra1)) {
                writer.write(palabra2);
            }else {
                writer.write(readWord);
            }
            writer.writeSpace();
        }
    }
}
