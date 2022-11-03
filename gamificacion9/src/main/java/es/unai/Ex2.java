package es.unai;

/* ********************************************************************************************************************
 * Author:        Unai
 * Creation date: 31/10/2022
 * Last update:   31/10/2022
 * Description:   Given a sequence of 10 numbers display the sequence, max and min
 * Usage:         Introduce 10 numbers
 ******************************************************************************************************************* */

public class Ex2 {
    public static void main(String[] args) {
        new Ex2().start();
    }

    private void start() {
        int[] numbers = new int[10];
        System.out.println("Introduce 10 números");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = LT.readInt();
        }

        displaySequence(numbers);
        System.out.printf("Max: %1$.2f\n", max(numbers));
        System.out.printf("Min: %1$.2f\n", min(numbers));
        System.out.printf("Media: %1$.2f\n", average(numbers));
    }

    private void displaySequence(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();
    }

    private double max(int[] numbers) {
        int max = 0;

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > numbers[max]) {
                max = i;
            }
        }
        return numbers[max];
    }

    private double min(int[] numbers) {
        int min = 0;

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] < numbers[min]) {
                min = i;
            }
        }
        return numbers[min];
    }

    private double average(int[] numbers) {
        double total = numbers[0];

        for (int i = 1; i < numbers.length; i++) {
            total += numbers[i];
        }
        return total / numbers.length;
    }
}
