package es.unai;

/* ********************************************************************************************************************
 * Author:         Unai
 * Creation date: 06/10/22
 * Last update:   06/10/22
 * Description:   Show the even number from 1 to n
 * Usage:         Insert a number
 * Pseudocode:
{
    INICIALIZACION
    TRATAMIENTO
}
INICIALIZACION {
    VISUALIZA “INTRODUCE EL LÍMITE DE LA SUCESIÓN”;
    LERR CANTIDAD;
}

TRATAMIENTO {
    DESDE INDICE = 0 HASTA INDICE = CANTIDAD DE EN DOS {
        VISUALIZAR INDICE
    }
}

 ******************************************************************************************************************* */

public class Ex2 {
    public static void main(String[] args) {
        System.out.println("Introduce el límite del intervalo");
        int limit = LT.readInt();

        for (int i = 1; i < limit; i+=2) {
            System.out.println(i);
        }
    }
}
