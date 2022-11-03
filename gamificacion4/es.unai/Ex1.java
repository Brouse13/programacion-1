package es.unai;

/* ********************************************************************************************************************
* Author:        Unai
* Creation date: 08/10/22
* Last update:   08/10/22
* Description:   Given a char sequence, count vocals, consonants and spaces
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
    spaces = 0;
    vocals = 0;
    consonants = 0;
}


RECORRIDO DE CARÁCTERES {
	HASTA carácter DISTINTO A END_LINE {
		carácter = LEER CARÁCTER;
		SI carácter = ‘ ‘ {
			espacios + 1;
		}SINO SI carácter == vocales {
			Vocales + 1;
		}SINO  {
			consonantes + 1;
		}
	}
}

VISUALIZACION {
	VISUALIZACION "VOCALES " + vocales;
	VISUALIZACION "CONSONANTES " + consonantes;
	VISUALIZACION "ESPACIOS " + espacios;
}

 ******************************************************************************************************************* */
public class Ex1 {
    private static final char END_LINE = '.';

    public static void main(String[] args) {
        System.out.println("Introduce la secuecia:");
        char character = LT.readChar();

        int spaces = 0;
        int vocals = 0;
        int consonants = 0;

        while (character != END_LINE) {
            if (character == ' ') {
                spaces++;
            }else if (character == 'a' || character == 'e' || character == 'i' || character == 'o' ||
                      character == 'u' || character == 'A' || character == 'E' || character == 'I' ||
                      character == 'O'|| character == 'U') {
                vocals++;
            }else {
                consonants++;
            }
            character = LT.readChar();
        }

        System.out.println("Vocales: " + vocals);
        System.out.println("Consonantes: " + consonants);
        System.out.println("Espacios: " + spaces);
    }
}
