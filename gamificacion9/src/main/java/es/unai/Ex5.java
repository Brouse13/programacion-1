package es.unai;

/* ********************************************************************************************************************
 * Author:        Unai
 * Creation date: 31/10/2022
 * Last update:   31/10/2022
 * Description:   Display char '*' the amount of times in an array
 * Usage:         Run the program
 ******************************************************************************************************************* */

public class Ex5 {
    public static void main(String[] args) {
        new Ex5().start();
    }

    private void start() {
        final int[] display = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
        display(display, '*');
    }

    private void display(int[] display, char c) {
        for (int i = 0; i < display.length; i++) {
            for (int j = 0; j < display[i]; j++) {
                System.out.print(c);
            }
            System.out.println();
        }
    }


}
