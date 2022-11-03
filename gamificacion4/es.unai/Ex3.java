package es.unai;

/* ********************************************************************************************************************
 * Author:        Unai
 * Creation date: 08/10/22
 * Last update:   08/10/22
 * Description:   Given a char sequence, find the position of the first vocal
 * Usage:         Insert a char sequence end in '.'
 * Pseudocode:
{
    INICIALIZACION;
    BUSQUEDA DE CARÁCTERES;
	VISUALIZACION;
}

INICIALIZACION  {
    VISUALIZACION “Introduce la secuencia:”;
    cacter = LEER CARACTER;
    END_LINE = ‘.’;
	encontrado = NO;
	indice = 1;
}


BUSQUEDA DE CARÁCTERES {
	HASTA carácter DISTINTO A END_LINE Y encontrado = No {
		SI carácter ES vocal {
			VISUALIZACION "La posicón del la 1ª vocal es " indice;
			encontrado = Sí;
		}
		carácter = LEER CARÁCTER;
		indice + 1;
	}
}

VISUALIZACION {
	SI encontrado = No {
		VISUALIZACION "No se ha encontrado ningún carácter vocal";
	}

}

 ******************************************************************************************************************* */
public class Ex3 {
    private static final char END_LINE = '.';

    public static void main(String[] args) {
        System.out.println("Introduce la secuecia:");
        char character = LT.readChar();

        int index = 1;
        boolean found = false;

        while (character != END_LINE && !found) {

            //Check if the read char is a vocal
            if (character == 'a' || character == 'e' || character == 'i' || character == 'o' ||
                character == 'u' || character == 'A' || character == 'E' || character == 'I' ||
                character == 'O'|| character == 'U') {
                System.out.println("La posición del primer carácter vocal es: " + index);
                found = true;
            }

            character = LT.readChar();
            index++;
        }

        if (!found) {
            System.out.println("No se ha encontrado ningún carácter vocal");
        }
    }
}
