package es.unai;
/* ********************************************************************************************************************
 * Author:        Unai
 * Creation date: 26/10/22
 * Last update:   26/10/22
 * Description:   Sum the first 100 numbers and make the average
 * Usage:         Run the program
 ******************************************************************************************************************* */
public class Ex3 {
    public static void main(String[] args) {
        int[] numbers = new int[1000];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i + 1;
        }

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
