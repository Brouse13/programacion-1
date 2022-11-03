package es.unai;

/* ********************************************************************************************************************
* Author:         Unai
* Creation date: 30/09/22
* Last update:   30/09/22
* Description:   Given a character check if is a number, alphabet lower or alphabet upper
* Usage:         Insert a character
* Pseudocode:
{
    INICIALIZACION;
    VISULAIZACIÓN;
}

INICIALIZACION {
    VISUALIZACION “INTRODUCE UN CARÁCTER”;
    LECTURA CHARACTER;
}


VISUALIZACION {
    CARÁCTER {
        CASO 0 -> VISUALIZA “ZERO”;
        CASO 1 -> VISUALIZA “UNO”;
        CASO 2 -> VISUALIZA “DOS”;
        CASO 3 -> VISUALIZA “TRES”;
        CASO 4 -> VISUALIZA “CUATRO”;
        CASO 5 -> VISUALIZA “CINCO”;
        CASO 6 -> VISUALIZA “SEIS”;
        CASO 7 -> VISUALIZA “SIETE”;
        CASO 8 -> VISUALIZA “OCHO”;
        CASO 9 -> VISUALIZA “NUEVE”;
    }
}


 ******************************************************************************************************************* */

public class Ex3 {
    public static void main(String[] args) {
        System.out.println("Introduce un carácter numérico");
        char readChar = LT.readChar();

        switch (readChar) {
            case '0' -> System.out.println("ZERO");
            case '1' -> System.out.println("UNO");
            case '2' -> System.out.println("DOS");
            case '3' -> System.out.println("TRES");
            case '4' -> System.out.println("CUATRO");
            case '5' -> System.out.println("CINCO");
            case '6' -> System.out.println("SEIS");
            case '7' -> System.out.println("SIETE");
            case '8' -> System.out.println("OCHO");
            case '9' -> System.out.println("NUEVE");
        }
    }
}
