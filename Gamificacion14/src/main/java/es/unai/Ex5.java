package es.unai;

/* ********************************************************************************************************************
 * Author:        Unai
 * Creation date: 18/11/2022
 * Last update:   18/11/2022
 * Description:   Given a char sequence display in reverse odd words and on normal the even
 * Usage:         Write a char sequence end in '.'
 ******************************************************************************************************************* */

public class Ex5 {
    public static void main(String[] args) {
        new Ex5().start();
    }

    private void start() {
        Palabra palabra = new Palabra();

        while (Palabra.existWords()) {
            palabra.read();

            if ((palabra.getWordSize() % 2) == 0) {
                palabra.toUpperCase();
                System.out.print(palabra + " ");
            }else {
                palabra.flip();
                System.out.print(palabra + " ");
            }
        }
    }
}
