package es.unai;

/* ********************************************************************************************************************
 * Author:        Unai
 * Creation date: 18/11/2022
 * Last update:   18/11/2022
 * Description:   Given a char sequence show if all the words contains one word more than the previous
 * Usage:         Write a char sequence ed in '.'
 ******************************************************************************************************************* */

public class Ex6 {
    public static void main(String[] args) {
        new Ex6().start();
    }

    private void start() {
        Palabra palabra = new Palabra();
        int length = 1;
        boolean invalid = false;

        while (Palabra.existWords() && !invalid) {
            palabra.read();

            if (palabra.getWordSize() != length) {
                invalid = true;
            }

            length++;
        }

        if (invalid) {
            System.out.println("No, la secuencia no cumple el criterio");
        }else {
            System.out.println("Si, la secuencia si cumple el criterio");
        }
    }
}
