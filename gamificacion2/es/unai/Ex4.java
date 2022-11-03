package es.unai;

/* ********************************************************************************************************************
* Author:         Unai
* Creation date: 30/09/22
* Last update:   30/09/22
* Description:   Given two ints 'n' 'm' display the first 'm' multiples of number 'n'
* Usage:         Insert the number to know the multiples and then the amount of multiples to get
* Pseudocode:
ALGORITMO MULTIPLOS DE UN NÚMERO {
 LECTURA DATOS;
 TRATAMIENTO;
}

ALGORITMO LECTURA DATOS {
 LECTURA NÚMERO n;
 LECTURA NÚMERO m;
}

ALGORITMO LECTURA NÚMERO n {
 MENSAJE USUARIO PARA INTRODUCIR POR TECLADO EL NÚMERO n;
 LECTURA VALOR NÚMERO n;
}

ALGORITMO LECTURA NÚMERO m {
 MENSAJE USUARIO PARA INTRODUCIR POR TECLADO EL NÚMERO m;
 LECTURA VALOR NÚMERO m;
}

ALGORITMO TRATAMIENTO {
 MIENTRAS (NÚMERO DE MÚLTIPLOS OBTENIDOS < n) {
 OBTENER SIGUIENTE MÚLTIPLO DE m;
 VISUALIZAR MÚLTIPLO DE m OBTENIDO;
 INCREMENTAR NÚMERO DE MÚLTIPLOS DE m OBTENIDOS;
 }
}

ALGORITMO OBTENER SIGUIENTE MÚLTIPLO DE m {
 NUEVO MULTIPLO = (NÚMERO DE MÚLTIPLOS OBTENIDOS + 1) * m;
}
 ******************************************************************************************************************* */

public class Ex4 {
    public static void main(String[] args) {
        System.out.println("Introduce el número del cual sacar múltiplos");
        int n = LT.readInt();
        System.out.println("Introduce la cantidad de múltiplos a sacar");
        int m = LT.readInt();

        for (int i = 0; i < m; i++) {
            System.out.println(n + (i * n));
        }
    }
}
