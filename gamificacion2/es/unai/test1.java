package es.unai;

public class test1 {
    private static final char END_LINE = '.';
    private static final char COUNT_CHARACTER = 'a';

    public static void main(String[] args) {
        /* Dada una secuencia de carácteres introducida por teclado y acabada por '.'. Visualiza el numero de carácteres
        vocales introducidos por teclado. Siempre habrña carácteres minúsculas, carácteres espacio y carácteres . */
        char character = LT.readChar();
        int count = 0;

        while (character != END_LINE) {
            if (character == COUNT_CHARACTER) {
                count++;
            }
            character = LT.readChar();
        }
        System.out.println("Nº de " + COUNT_CHARACTER + " es " + count);
    }

    public int factorial(int n) {
        if (n == 1) return 1;

        return factorial(n - 1) * n;
    }
}
