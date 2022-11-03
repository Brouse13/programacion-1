package es.unai;

/* ********************************************************************************************************************
 * Author:        Unai
 * Creation date: 08/10/22
 * Last update:   08/10/22
 * Description:   Given a char sequence, show if contains the given char to find
 * Usage:         Insert a char to find. Insert a char sequence end in '.'
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

		SI carácter = busqueda {
			VISUALIZACION "El carácter '" busqueda "' está dentro de la secuencia"
			encontrado = Sí
		}
	}
}

VISUALIZACION {
	SI NO encontrado {
		VISUALIZACION "El carácter '" busqueda "' no está dentro de la secuencia"
	}
}
 ******************************************************************************************************************* */
public class Ex9 {
    private static final char END_LINE = '.';

    public static void main(String[] args) {
        //Element to query on input
        System.out.println("Introcude el carácter a buscar:");
        char query = LT.readChar();

        System.out.println("Introduce la secuecia:");
        char character = LT.readChar();

        boolean found = false;

        //Loop throw all the read chars
        while (character != END_LINE && !found) {
           if (character == query) {
               System.out.println("El carácter '" + query + "' está dentro de la secuencia");
               found = true;
           }
           character = LT.readChar();
        }

        if (!found) {
            System.out.println("El carácter '" + query + "' no está dentro de la secuencia");
        }
    }
}
