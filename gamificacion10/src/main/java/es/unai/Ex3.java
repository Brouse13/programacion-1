package es.unai;

/* ********************************************************************************************************************
 * Author:        Unai
 * Creation date: 03/11/2022
 * Last update:   03/11/2022
 * Description:   For a max amount of 10 numbers display whom of them are odd and even while the number is different
                  to 10
 * Usage:         Write up to 25 numbers, or '0' to stop  introducing numbers
 ******************************************************************************************************************* */
public class Ex3 {
    private final int END_SEQUENCE = 0;
    private final int LENGTH = 25;
    public static void main(String[] args) {
        new Ex3().start();
    }

    private void start() {
        int[] odd = new int[LENGTH];
        int[] even = new int[LENGTH];
        int index = 0;
        int number;

        do {
            System.out.println("Introduce un número: ");
            number = LT.readInt();

            if ((number % 2) == 0) {
                even[index] = number;
            }else {
                odd[index] = number;
            }

            index++;
        }while (number != END_SEQUENCE || index == LENGTH - 1);

        //Display even numbers introduced
        System.out.print("Los números pares introducidos por teclado fueron: ");
        display(even);

        //Display odd numbers introduced
        System.out.print("Los números impares introducidos por teclado fueron: ");
        display(odd);
    }

    private void display(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] != 0) {
                System.out.print(numbers[i] + " ");
            }
        }
        System.out.println();
    }
}
