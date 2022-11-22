package es.unai;

/* ********************************************************************************************************************
 * Author:        Unai
 * Creation date: 18/11/2022
 * Last update:   18/11/2022
 * Description:   Given a char sequence check if the number of vocals equals the number of consonant
 * Usage:         Write a char sequence end in '.'
 ******************************************************************************************************************* */

public class Ex2 {
    private final Palabra palabra = new Palabra();

    public static void main(String[] args) {
        new Ex2().start();
    }

    private void start() {
        boolean found = false;

        while (Palabra.existWords() && !found) {
            palabra.read();

            if (palabra.getNumberOfVocals()  == palabra.getWordSize() - palabra.getNumberOfVocals()) {
                System.out.println("La primera palabra con el mismo número de vocales que de consonantes es: ");
                System.out.println(palabra);
                found = true;
            }
        }

        if (!found) {
            System.out.println("No hay ninguna palabra con el mismo número de vocales que de consonantes");
        }
    }
}
