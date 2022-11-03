package es.unai;

/* ********************************************************************************************************************
 * Author:        Unai
 * Creation date: 08/10/22
 * Last update:   08/10/22
 * Description:   Given a char sequence, show the same sequence in upperCase
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
		SI carácter ES MINÚSCULA {
			VISUALIZACION carácter en mayúscula;
		}
		carácter = LEER CARÁCTER;
	}
}

 ******************************************************************************************************************* */
public class Ex5 {
    private static final char END_LINE = '.';

    public static void main(String[] args) {
        System.out.println("Introduce la secuecia:");
        char character = LT.readChar();

        //Loop throw all the read chars until read END_LINE
        while (character != END_LINE) {
            //If char is minus subtract 32 to get the upperCase char
            if (character >= 97 && character <= 122) {
                System.out.print(((char) (character - 32)));
            }else {
                System.out.print(character);
            }

            character = LT.readChar();
        }
    }
}
