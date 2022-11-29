package es.unai;

/* ********************************************************************************************************************
 * Author:        Unai
 * Creation date: 29/11/2022
 * Last update:   29/11/2022
 * Description:   Given a char sequence show all the odd words in 'impares.txt' and the even in 'pares.txt'
 * Usage:         Write a char sequence end in '.'
 ******************************************************************************************************************* */
public class Ex7 {
    private final Palabra palabra = new Palabra();

    public static void main(String[] args) throws Exception {
        new Ex7().start();
    }

    private void start() throws Exception {
        PalabraFileWriter odd = new PalabraFileWriter("impares.txt");
        PalabraFileWriter even = new PalabraFileWriter("pares.txt");

        System.out.println("Introduce una secuencia a analizar: ");
        while (Palabra.existWords()) {
            palabra.read();

            if ((palabra.getWordSize() % 2) == 0) {
                even.write(palabra);
                even.writeSpace();
            }else {
                odd.write(palabra);
                odd.writeSpace();
            }
        }

        odd.close();
        even.close();
    }
}
