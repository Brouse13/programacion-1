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
    NUMEROS = “0…9”;
    MAYÚSULAS = “A..Z”;
    MINÚSCULAS = “a…z”;

    VISUALIZACION “INTRODUCE UN CARÁCTER”;
    LECTURA CHARACTER;
}


VISUALIZACION {
    SI NUMEROS CONTINE CARACTER{
        VISUALIZA “EL CARÁCTER LEÍDO ES UN CARÁCTER NUMÉRICO”;
    }SINO SI MAYÚSCULAS CONTIENE CARACTER{
        VISUALIZA “EL CARÁCTER LEÍDO ES UN CARÁCTER ALFABÉTICO MINÚSCULA”;
    } SINO SI MINUSCULAS CONTIENE CARÁCTER {
        VISUALIZA “EL CARÁCTER LEÍDO ES UN CARÁCTER ALFABÉTICO MAYÚSCULA”;
    } SINO {
        VISUALIZAR “EL CARÁCTER LEÍDO NO ES NUMÉRICO NI ALFABÉTICO”;
    }
}
 ******************************************************************************************************************* */

public class Ex2 {
    private static final String NUMBERS = "0123456789";
    private static final String LOWER_VOCAL = "abcdefghijklmnopqrstuvwxyz";
    private static final String UPPER_VOCAL = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

    public static void main(String[] args) {
        System.out.println("Introduce un carácter");
        char character = LT.readChar();

        if (NUMBERS.contains(String.valueOf(character))) {
            System.out.println("El carácter leído es un carácter numérico");
        } else if (LOWER_VOCAL.contains(String.valueOf(character))) {
            System.out.println("El carácter leído es un carácter alfabético minúscula");
        }else if (UPPER_VOCAL.contains(String.valueOf(character))) {
            System.out.println("El carácter leído es un carácter alfabético mayúscula");
        }else {
            System.out.println("El carácter leído no es numérico ni alfabético");
        }
    }
}
