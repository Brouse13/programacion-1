package es.unai;

/* ********************************************************************************************************************
 * Author:        Unai
 * Creation date: 18/11/2022
 * Last update:   18/11/2022
 * Description:   Given a char sequence show the first word with even number of charactes
 * Usage:
 ******************************************************************************************************************* */

public class Ex3 {
    private final Palabra palabra = new Palabra();

    public static void main(String[] args) {
        new Ex3().start();
    }

    private void start() {
        boolean found = false;

        while (Palabra.existWords() && !found) {
            palabra.read();

            if ((palabra.getWordSize() % 2) == 0) {
                System.out.print("La primera palabra con un número de carácteres par es: ");
                System.out.println(palabra);
                found = true;
            }
        }

        if (!found) {
            System.out.println("No hay ninguna palabra con el número de vocales par.");
        }
    }
}
