package es.unai;

/* ********************************************************************************************************************
 * Author:         Unai
 * Creation date: 06/10/22
 * Last update:   06/10/22
 * Description:   Get the first n term of te succesion i * i /2i
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
        VISUALIZAR INDICE * INDICE / (2 * INDICE);
    }
}
 ******************************************************************************************************************* */

public class Ex6 {
    public static void main(String[] args) {
        System.out.println("Introduce el límite de la sucesión");
        int number = LT.readInt();

        for (int i = 1; i <= number; i++) {
            System.out.println(i * i / (2 * i));
        }
    }
}
