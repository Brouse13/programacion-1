package es.unai;

/* ********************************************************************************************************************
 * Author:        Unai
 * Creation date: 03/11/2022
 * Last update:   03/11/2022
 * Description:   Given the size of the array the user has to fill it, and then it will be displayed
 * Usage:         Write the amount of elements and the n numbers
 ******************************************************************************************************************* */

public class Ex5 {
    public static void main(String[] args) {
        new Ex5().start();
    }

    private void start() {
        System.out.println("Introduce la cantidad de elementos: ");
        int[] elements = new int[LT.readInt()];
        fill(elements);
        display(elements);
    }

    private void fill(int[] elements) {
        for (int i = 0; i < elements.length; i++) {
            System.out.println("Introduce un número: ");
            elements[i] = LT.readInt();
        }
    }

    private void display(int[] elements) {
        for (int i = 0; i < elements.length; i++) {
            System.out.printf("Elemento %d: %d\n", i + 1, elements[i]);
        }
    }
}
