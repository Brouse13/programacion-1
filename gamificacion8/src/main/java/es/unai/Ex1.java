package es.unai;

/* ********************************************************************************************************************
 * Author:        Unai
 * Creation date: 26/10/22
 * Last update:   26/10/22
 * Description:   Display the last 5 numbers inserted by keyboard
 * Usage:         Insert 5 numbers
 ******************************************************************************************************************* */
public class Ex1 {
    public static void main(String[] args) {
        int[] numbers = new int[5];

        System.out.println("Introduce 5 números:");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = LT.readInt();
        }

        System.out.println("Los números introducidos son: ");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
    }
}
