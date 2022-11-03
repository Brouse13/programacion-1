package es.unai;

/* ********************************************************************************************************************
 * Author:        Unai
 * Creation date: 31/10/2022
 * Last update:   31/10/2022
 * Description:   Display if two instanced arrays are equals
 * Usage:         Run the program
 ******************************************************************************************************************* */

import java.util.Arrays;

public class Ex3 {
    public static void main(String[] args) {
        new Ex3().start();
    }

    private void start() {
        final int[] a1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
        final int[] a2 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};

        if (areEquals(a1, a2)) {
            System.out.println("Los arreglos son iguales");
        }else {
            System.out.println("Los arreglos son distintos");
        }
    }

    private boolean areEquals(int[] a1, int[] a2) {
        if (a1.length != a2.length) {
            System.out.println("sd");
            return false;
        }

        for (int i = 0; i < a1.length; i++) {
            if (a1[i] != a2[i]) {
                return false;
            }
        }
        return true;
    }
}
