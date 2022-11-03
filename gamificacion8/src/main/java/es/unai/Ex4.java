package es.unai;

/* ********************************************************************************************************************
 * Author:        Unai
 * Creation date: 26/10/2022
 * Last update:   26/10/2022
 * Description:   Show the sum of the array[1, 2, 3, 4, 5, 6, 7, 8, 9] and the one inserted on keyboard
 * Usage:         Insert 10 numbers
 ******************************************************************************************************************* */
public class Ex4 {
    public static void main(String[] args) {
        final int[] numbers = new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9};

        System.out.println("Introduce 10 números");
        int[] keyboard = fill();
        int[] result = sum(numbers, keyboard);

        display(result);
    }

    private static int[] fill() {
        int[] fill = new int[10];
        for (int i = 0; i < fill.length; i++) {
            fill[i] = LT.readInt();
        }
        return fill;
    }

    private static int[] sum(int[] a1, int[] a2) {
        int[] result = new int[a1.length];

        for (int i = 0; i < a1.length; i++) {
            result[i] = a1[i] + a2[i];
        }
        return result;
    }

    private static void display(int[] display) {
        for (int i = 0; i < display.length; i++) {
            System.out.printf("Componente %d: %d.\n", i + 1, display[i]);
        }
    }
}
