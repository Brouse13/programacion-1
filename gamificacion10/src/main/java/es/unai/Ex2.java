package es.unai;

/* ********************************************************************************************************************
 * Author:        Unai
 * Creation date: 03/11/2022
 * Last update:   03/11/2022
 * Description:   Store 10 different numbers in memory to then display them
 * Usage:         Write 10 different numbers
 ******************************************************************************************************************* */

import java.util.Arrays;

public class Ex2 {
    public static void main(String[] args) {
        new Ex2().start();
    }

    private void start() {
        int[] numbers = new int[10];

        //Loop to fill all the initial array
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Introduce un número:");
            int read = LT.readInt();

            //While to check the number is not repeated
            while (containsNumber(numbers, read, i)) {
                System.out.printf("El número %d está duplicado, introduce otro.\n", read);
                read = LT.readInt();
            }

            numbers[i] = read;
        }

        display(numbers);
    }

    private boolean containsNumber(int[] numbers, int read, int index) {
        //Loop throw 0 to index - 1 to loop all previous elements
        for (int i = 0; i < index; i++) {
            //Return if any element is repeated
            if (numbers[i] == read) {
                return true;
            }
        }
        return false;
    }

    private void display(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();
    }


}
