package es.unai;

/* ********************************************************************************************************************
 * Author:        Unai
 * Creation date: 24/10/22
 * Last update:   24/10/22
 * Description:   Given a number display a pyramid with n lines and n '*' in each line
 * Usage:         Write the pyramid size

 ******************************************************************************************************************* */
public class Ex12 {
    public static void main(String[] args) {
        System.out.println("Escribe el tamaño de la pirámide:");
        int size = LT.readInt();

        pyramid(size);
    }

    private static void pyramid(int size) {
        for (int i = 0; i < size; i++) {
            for (int j = 1; j <= i + 1; j++) {
                System.out.print('*');
            }
            System.out.println();
        }
    }
}
