package es.unai;

/* ********************************************************************************************************************
 * Author:        Unai
 * Creation date: 20/10/22
 * Last update:   20/10/22
 * Description:   Display if the number is a prime number
 * Usage:         Write a number

 ******************************************************************************************************************* */

public class Ex4 {
    public static void main(String[] args) {
        int n1 = LT.readInt();

        if (isPrime(n1)) {
            System.out.println("El número es primo");
        }else {
            System.out.println("El número no es primo");
        }
    }

    public static boolean isPrime(int n1) {
        int divisor = 2;
        boolean primo = true;

        while (divisor != n1) {
            if (n1 % divisor == 0)
                return false;
            divisor++;
        }
        return primo;
    }
}

