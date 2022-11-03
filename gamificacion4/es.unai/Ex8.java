package es.unai;

/* ********************************************************************************************************************
 * Author:        Unai
 * Creation date: 08/10/22
 * Last update:   08/10/22
 * Description:   Given a char sequence, show if (nº consonants = 2 * nº vocals)
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
    vocals = 0;
    consonants = 0;
}


RECORRIDO DE CARÁCTERES {
	HASTA carácter DISTINTO A END_LINE {
		SI carácter = vocales {
			espacios + 1;
		}SINO SI carácter NO ES ' ' {
			consonantes + 1;
		}
		carácter = LEER CARÁCTER;
	}
}

VISUALIZACION {
	SI consonantes = 2 * vocales {
		VISUALIZACION "Sí";
	}SINO {
		VISUALIZACION "No";
	}
}
 ******************************************************************************************************************* */
public class Ex8 {
    private static final char END_LINE = '.';

    public static void main(String[] args) {
        System.out.println("Introduce la secuecia:");
        char character = LT.readChar();

        int vocals = 0;
        int consonants = 0;

        //Loop throw all the read chars
        while (character != END_LINE) {
            //If the read char is vocal increase count
            if (character == 'a' || character == 'e' || character == 'i' ||
                    character == 'o' || character == 'u') {
                vocals++;
            }else if (character != ' ') {
                //Will be triggered if is different to vocals (last if) and different to ' ', so it's consonant
                 consonants++;
            }

            character = LT.readChar();
        }

        if (consonants  == vocals * 2) {
            System.out.println("Sí");
        } else {
            System.out.println("No");
        }
    }
}
