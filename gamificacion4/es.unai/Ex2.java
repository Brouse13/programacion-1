package es.unai;

/* ********************************************************************************************************************
 * Author:        Unai
 * Creation date: 08/10/22
 * Last update:   08/10/22
 * Description:   Given a char sequence, show all the char sequence without the point
 * Usage:         Insert a char sequence end in '.'
 * Pseudocode:
{
    INICIALIZACION;
    RECORRIDO DE CARÁCTERES;
}

INICIALIZACION  {
    VISUALIZACION “Introduce la secuencia:”;
    cacter = LEER CARACTER;
    END_LINE = ‘.’;
}


RECORRIDO DE CARÁCTERES {
	HASTA carácter DISTINTO A END_LINE {
		VISUALIZACION caracter;
		carácter = LEER CARÁCTER;
	}
}

 ******************************************************************************************************************* */
public class Ex2 {
    private static final char END_LINE = '.';

    public static void main(String[] args) {
        System.out.println("Introduce la secuecia:");
        char character = LT.readChar();

        System.out.print("La sentencia introducida: ");

        //Loop throw all read chars and sout them
        while (character != END_LINE) {
            System.out.print(character);
            character = LT.readChar();
        }
    }
}
