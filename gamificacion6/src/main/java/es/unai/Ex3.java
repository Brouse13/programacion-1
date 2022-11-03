package es.unai;

/* ********************************************************************************************************************
 * Author:        Unai
 * Creation date: 20/10/22
 * Last update:   20/10/22
 * Description:   Display if the given number is odd or even
 * Usage:         Write a number

 ******************************************************************************************************************* */

public class Ex3 {
    public static void main(String[] args) {
        int n1 = LT.readInt();

        if (odd(n1)) {
            System.out.println("El número es impar");
        }else {
            System.out.println("El número es par");
        }
    }

    private static boolean odd(int n1) {
        return n1 % 2 == 1;
    }
}
