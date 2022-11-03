package es.unai;

/* ********************************************************************************************************************
 * Author:        Unai
 * Creation date: 24/10/22
 * Last update:   24/10/22
 * Description:   Given a character display if it's a vocal a number or other
 * Usage:         Write a character

 ******************************************************************************************************************* */
public class Ex11 {
    public static void main(String[] args) {
        System.out.print("Escribe un carácter: ");
        char character = LT.readChar();

        System.out.printf("El caracter '%c' es de tipo %s", character, type(character));
    }

    private static String type(char character) {
        if (character == 'a' || character == 'e' || character == 'i' || character == 'o' || character == 'u') {
            return "vocal";
        }else if (character >= 48 && character <= 57) {
            return "numérico";
        }
        return "otro";
    }
}
