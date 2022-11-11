package es.unai;

/* ********************************************************************************************************************
 * Author:        Unai
 * Creation date: 11/11/2022
 * Last update:   11/11/2022
 * Description:   Given a sequence of numbers calculate the average. If '0' is introduces end sequence. Then it will
 *                display all multiples of '4'
 * Usage:         Write numbers until '0' to end sequence
 ******************************************************************************************************************* */
public class NumberReader {
    private final int END_PROGRAM = 0;
    private final int MULTIPLE = 4;

    private int readNumber;
    private int lastIndex = 0;

    public static void main(String[] args) {
        new NumberReader().start();
    }

    private void start() {
        int[] numbers = new int[20];
        boolean end = false;

        System.out.println("Introduce los números a leer: ");

        do {
            try {
                //Read next number
                readNumber = LT.readInt();

                if (readNumber == END_PROGRAM) {
                    end = true;
                } else if (readNumber < 0) {
                    System.out.println("El número no es natural");
                } else {
                    numbers[lastIndex] = readNumber;
                    lastIndex++;
                }
            }catch (NumberFormatException exception) {
                System.out.println("El número no es un número natural");
            }catch (ArrayIndexOutOfBoundsException exception) {
                //If the arr length isn't enough add 1 to the length and add the number to the index
                numbers = increaseSize(numbers);
                numbers[lastIndex] = readNumber;
                lastIndex++;
            }
        }while (!end);

        //Display all the multiples
        displayMultiples(numbers);
    }

    private int[] increaseSize(int[] arr) {
        int[] copyArr = new int[arr.length + 1];

        for (int i = 0; i < arr.length; i++) {
            copyArr[i] = arr[i];
        }

    return copyArr;
    }

    private void displayMultiples(int[] arr) {
        boolean noMultiples = true;

        for (int i = 0; i < arr.length; i++) {
            if ((arr[i] % MULTIPLE) == 0 && arr[i] != 0) {
                if (noMultiples) {
                    System.out.println("Los múltiplos de " + MULTIPLE + " son: ");
                    noMultiples = false;
                }
                System.out.print(arr[i] + " ");
            }
        }

        if (noMultiples) {
            System.out.println("No hay múltiplos de " + MULTIPLE);
        }
    }
}
