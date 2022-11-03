package es.unai;

/* ********************************************************************************************************************
 * Author:        Unai
 * Creation date: 20/10/22
 * Last update:   20/10/22
 * Description:   Display the grater number
 * Usage:         Write two numbers

 ******************************************************************************************************************* */

public class Ex2 {
    public static void main(String[] args) {
        int n1 = LT.readInt();
        int n2 = LT.readInt();

        System.out.println("El número más grande es " + grater(n1, n2));
    }

    private static int grater(int n1, int n2) {
        return n1 > n2 ? n1 : n2;
    }
}
