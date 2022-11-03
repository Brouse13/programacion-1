package es.unai;

/* ********************************************************************************************************************
* Author:         Unai
 * Creation date: 06/10/22
 * Last update:   06/10/22
* Description:   Sum 'n' numbers from the input
* Usage:         Insert a number and then n numbers
* Pseudocode:
{
    INICIALIZACION
    TRATAMIENTO
}
INICIALIZACION {
    VISUALIZA “INTRODUCE LA CANTIDAD DE NÚMEOS A SUMAR”;
    SUMA = 0;
    LERR CANTIDAD;
}

TRATAMIENTO {
    DESDE 0 HASTA CANTIDAD {
        SUMA += LEER NUMERO;
    }
    VISUALIZAR "LA SUMA ES" SUMA;
}

 ******************************************************************************************************************* */

public class Ex1 {
    public static void main(String[] args) {
        System.out.println("Introduce la cantidad de números a sumar");
        int amount = LT.readInt();
        int sum = 0;

        System.out.println("Introduce los " + amount + " número/s");
        for (int i = 0; i < amount; i++) {
            sum += LT.readInt();
        }

        System.out.println("La suma de los números es: " + sum);
    }
}
