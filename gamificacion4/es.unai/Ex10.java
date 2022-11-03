package es.unai;

/* ********************************************************************************************************************
 * Author:        Unai
 * Creation date: 08/10/22
 * Last update:   08/10/22
 * Description:   Given a char sequence, show if it only contains alphabetic characters
 * Usage:         Insert a char sequence end in '.'
 * Pseudocode:
{
    INICIALIZACION;
    RECORRIDO DE CARÁCTERES;
	VISUALIZACION;
}

INICIALIZACION  {
	VISUALIZACION “Introduce el carácter a buscar:”;
    busqueda = LEER CARACTER;

    VISUALIZACION “Introduce la secuencia:”;
    cacter = LEER CARACTER;
    END_LINE = ‘.’;
	encontrado = No;
}


RECORRIDO DE CARÁCTERES {
	HASTA carácter DISTINTO A END_LINE Y encontrado = Sí{

		SI carácter = alfabeto minúscula O carácter = alfabeto mayúscula  {
			VISUALIZACION "no todos los carácteres son alfabéticos"
			encontrado = Sí
		}
	}
}

VISUALIZACION {
	SI NO encontrado {
		VISUALIZACION "Todos los carácteres son alfabéticos"
	}
}
 ******************************************************************************************************************* */
public class Ex10 {
    private static final char END_LINE = '.';

    public static void main(String[] args) {
        System.out.println("Introduce la secuecia:");
        char character = LT.readChar();

        boolean found = false;

        //Loop throw all the read chars
        while (character != END_LINE && !found) {
            if (character < 65 || (character > 90 && character < 97) || character > 122) {
                System.out.println("En la secuencia no todos los carácteres son alfabéticos");
                found = true;
            }
            character = LT.readChar();
        }

        if (!found) {
            System.out.println("Todos los carácteres son alfabéticos");
        }
    }
}
