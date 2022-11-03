package es.unai;

/* ********************************************************************************************************************
 * Author:         Unai
 * Creation date: 06/10/22
 * Last update:   06/10/22
 * Description:   Calculate the factorial of a given number
 * Usage:         Insert a number
 * Pseudocode:
{
    INICIALIZACION
    TRATAMIENTO
}
INICIALIZACION {
    VISUALIZA “INTRODUCE EL LÍMITE DE LA SUCESIÓN”;
    LERR CANTIDAD;
    RESULT = CANTIDAD
}

TRATAMIENTO {
    DESDE INDICE = INDICE -1 HASTA INDICE = 0 {
        RESULT *= INDICE;
    }
    VISUALIZAR "EL FACOTRIAL ES" RESULTADO;
}

 ******************************************************************************************************************* */

public class Ex3 {
    public static void main(String[] args) {
        System.out.println("Introduce el nombre del cual quieres obtener el factorial");
        int number = LT.readInt();
        int result = number;

        for (int i = number - 1; i > 0; i--) {
            result *= i;
        }

        System.out.println("El factorial de " + number + " es " + result);
    }
}
