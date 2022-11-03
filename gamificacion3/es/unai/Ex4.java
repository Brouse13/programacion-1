package es.unai;

/* ********************************************************************************************************************
 * Author:         Unai
 * Creation date: 06/10/22
 * Last update:   06/10/22
 * Description:   Get the first n term of te succesion 2 * i
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
        VISUALIZAR 2 * INDICE;
    }
}
 ******************************************************************************************************************* */

public class Ex4 {
    public static void main(String[] args) {
        System.out.println("Introduce el límite de la sucesión");
        int limit = LT.readInt();

        for (int i = 1; i <= limit; i++) {
            System.out.println(2 * i);
        }
    }
}
