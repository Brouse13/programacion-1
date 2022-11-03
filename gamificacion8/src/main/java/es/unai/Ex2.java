package es.unai;

/* ********************************************************************************************************************
 * Author:        Unai
 * Creation date: 26/10/22
 * Last update:   26/10/22
 * Description:   Calculate the average of the 10 numbers on an array
 * Usage:         Run program
 ******************************************************************************************************************* */
public class Ex2 {
    public static void main(String[] args) {
        final int[] numbers = new int[]{1, 1, 1, 1, 1, 1, 1};
        System.out.printf("La media arítmetica es %1$.2f", average(numbers));
    }

    private static double average(int[] numbers) {
        double sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        return sum / numbers.length;
    }
}
