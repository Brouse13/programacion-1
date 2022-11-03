package es.unai;

/* ********************************************************************************************************************
 * Author:         Unai
 * Creation date: 06/10/22
 * Last update:   06/10/22
 * Description:   Get the first n term of te succesion i!
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
    DESDE INDICE = 0 HASTA INDICE = CANTIDAD {
    FACT = INDICE;
        DESDE FACT = INDICE -1 HASTA FACT= 0 DE EN DOS {
            RESULT *= FACT;
        }
        VISUALIZAR FACT;
    }
}
 ******************************************************************************************************************* */

public class Ex5 {
    public static void main(String[] args) {
        System.out.println("Introduce el límite de la sucesión");
        int limit = LT.readInt();

        for (int i = 1; i <= limit; i++) {
            int result = i;

            for (int j = (i - 1); j > 0; j--) {
                result *= j;
            }

            System.out.println(result);
        }
    }
}
