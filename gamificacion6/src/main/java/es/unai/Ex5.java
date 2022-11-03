package es.unai;

/* ********************************************************************************************************************
 * Author:        Unai
 * Creation date: 20/10/22
 * Last update:   20/10/22
 * Description:   Display the factorial of the given number
 * Usage:         Write a number

 ******************************************************************************************************************* */

public class Ex5 {
    public static void main(String[] args) {
        int n1 = LT.readInt();

        System.out.println("El factorial de " + n1 + " es " + fact(n1));
    }

    public static int fact(int n1) {
        int fact = n1;

        for (int i = n1 - 1; i > 0; i--) {
            fact *= i;
        }
        return fact;
    }
}

