package es.unai;

/* ********************************************************************************************************************
* Author:         Unai
* Creation date: 30/09/22
* Last update:   30/09/22
* Description:   Given a character show the UpperCase character
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
    VISUALIZA “EL CARÁCTER EN MAYÚSCULA ES ” CHARACTER.TOUPPERCASE
}
 ******************************************************************************************************************* */

public class Ex1 {
    public static void main(String[] args) {
        System.out.println("Introduce el caracter a transformar");
        char character = LT.readChar();

        System.out.println("El carácter en mayúsculas es " + Character.toUpperCase(character));
    }
}
