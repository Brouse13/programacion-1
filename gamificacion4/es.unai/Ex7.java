package es.unai;

/* ********************************************************************************************************************
 * Author:        Unai
 * Creation date: 08/10/22
 * Last update:   08/10/22
 * Description:   Given a char sequence, show if the amount of consonants is odd or even
 * Usage:         Insert a char sequence end in '.'
 * Pseudocode:
{
    INICIALIZACION;
    RECORRIDO DE CARÁCTERES;
	VISUALIZACION;
}

INICIALIZACION  {
    VISUALIZACION “Introduce la secuencia:”;
    cacter = LEER CARACTER;
    END_LINE = ‘.’;
	consonantes = 0;
}


RECORRIDO DE CARÁCTERES {
	HASTA carácter DISTINTO A END_LINE {
		SI carácter NO ES vocal NI ' ' {
			consonantes + 1;
		}
		carácter = LEER CARÁCTER;
	}
}

VISUALIZACION {
	SI consonantes PAR {
		VISUALIZACION "El número de carácteres vocal es par";
	}SINO {
		VISUALIZACION "El número de carácteres es impar";
	}
}

 ******************************************************************************************************************* */
public class Ex7 {
    private static final char END_LINE = '.';

    public static void main(String[] args) {
        System.out.println("Introduce la secuecia:");
        char character = LT.readChar();

        int count = 0;

        //Loop throw all the read chars
        while (character != END_LINE) {
            //If the read char is vocal increase count
            if (!(character == 'a' || character == 'e' || character == 'i' ||
                    character == 'o' || character == 'u' || character == ' ')) {
                count++;
            }

            character = LT.readChar();
        }

        if (count % 2 == 0) {
            System.out.println("El número de carácteres consonante es par");
        } else {
            System.out.println("El número de carácteres consonante es impar");
        }
    }
}
