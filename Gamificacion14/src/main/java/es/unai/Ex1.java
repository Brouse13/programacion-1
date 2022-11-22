package es.unai;

/* ********************************************************************************************************************
 * Author:        Unai
 * Creation date: 18/11/2022
 * Last update:   18/11/2022
 * Description:   Given a char sequence display the first word with the five vocals
 * Usage:         Write a char sequence end in  '.'
 ******************************************************************************************************************* */

public class Ex1 {
    private final Palabra palabra = new Palabra();

    public static void main(String[] args) {
        new Ex1().start();
    }

    private void start() {
        boolean found = false;

        while (Palabra.existWords() && !found) {
            palabra.read();
            if (palabra.hasFiveVocals()) {
                found = true;
                System.out.print("La primera palabra con las cinco vocales es: ");
                System.out.println(palabra);
            }
        }
        if (!found) {
            System.out.println("No hay palabras que tengan las cinco vocales");
        }
    }
}
