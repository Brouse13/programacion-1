package es.unai;

/* ********************************************************************************************************************
 * Author:        Unai
 * Creation date: 21/11/2022
 * Last update:   21/11/2022
 * Description:   Given a char sequence, display the words that contain 'tele'
 * Usage:         Write a char sequence end in '.'
 ******************************************************************************************************************* */
public class Ex7 {
    private final Palabra palabra = new Palabra();
    private final char[] sequence = {'t', 'e', 'l', 'e'};

    public static void main(String[] args) {
        new Ex7().start();
    }

    private void start() {
        while (Palabra.existWords()) {
            palabra.read();

            if (palabra.contains(sequence)) {
                System.out.println(palabra);
            }
        }
    }
}
