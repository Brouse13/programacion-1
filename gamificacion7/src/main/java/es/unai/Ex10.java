package es.unai;

/* ********************************************************************************************************************
 * Author:        Unai
 * Creation date: 24/10/22
 * Last update:   24/10/22
 * Description:   Given a number and an exponent display the result
 * Usage:         Write a number and an exponent

 ******************************************************************************************************************* */
public class Ex10 {
    public static void main(String[] args) {
        System.out.println("Elige la base");
        int base = LT.readInt();

        System.out.println("Elige el exponente");
        int exponent = LT.readInt();


        System.out.printf("%d^%d es %d", base, exponent, pow(base, exponent));
    }

    private static int pow(int base, int exponent) {
        return base ^ exponent;
    }
}
