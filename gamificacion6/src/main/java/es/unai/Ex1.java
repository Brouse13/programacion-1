package es.unai;

/* ********************************************************************************************************************
 * Author:        Unai
 * Creation date: 20/10/22
 * Last update:   20/10/22
 * Description:   Display messages on console with different methods
 * Usage:         Run the code

 ******************************************************************************************************************* */
public class Ex1 {
    private static final String MESSAGE = "PROGRAMACIÓN I - 2022";

    public static void main(String[] args) {
        display1();
        display2();
        display3("PROGRAMACIÓN I - 2022");
        String message = "PROGRAMACIÓN I - 2022";
        display3(message);
    }

    private static void display1() {
        System.out.println("PROGRAMACIÓN I - 2022");
    }

    private static void display2() {
        System.out.println(MESSAGE);
    }

    private static void display3(String message) {
        System.out.println(message);
    }
}
