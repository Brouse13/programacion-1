package es.unai;

/* ********************************************************************************************************************
 * Author:         Unai
 * Creation date: 06/10/22
 * Last update:   06/10/22
 * Description:   Get the first n term of Fibonacci succession
 * Usage:         Insert a number
 * Pseudocode:
{
    INICIALIZACION
    TRATAMIENTO
}
INICIALIZACION {
    VISUALIZA “INTRODUCE EL LÍMITE DE LA SUCESIÓN”;
    LEER CANTIDAD;
    ULTIMO_TERM = 0;
    ACTUAL_TERM = 1;
}

TRATAMIENTO {
    DESDE INDICE = 0 HASTA INDICE = CANTIDAD {
        RESULTADO = ULTIMO_TERM + ACTUAL_TERM;
        VISUALIZAR RESULTADO;
        LAST_TERM = ACTUAL_TERM;
        ACTUAL_TERM = RESULTADO
    }
}

 ******************************************************************************************************************* */

public class Ex7 {
    public static void main(String[] args) {
        System.out.println("Introduce el límite de la sucesión de Fibonacci");
        int amount = LT.readInt();
        int lastTerm = 0;
        int currentTerm = 1;

        for (int i = 0; i < amount; i++) {
            int result = currentTerm + lastTerm;
            System.out.println(result);
            lastTerm = currentTerm;
            currentTerm = result;
        }
    }
}
