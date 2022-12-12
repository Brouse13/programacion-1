package es.unai;

public class Problema6 {
    //declaración método main
    public static void main(String [] argumentos) throws Exception {
        new Problema6().metodoPrincipal();
    }

    //declaració método metodoPrincipal
    private void metodoPrincipal() throws Exception {
        //DECLARACIONES
        //declaración objeto Palabra para almacenar la palabra introducida por
        //teclado
        Palabra palabraUsuario=new Palabra();
        //declaración objeto Palabra para almacenar, de una en una, las palabras
        //leídas desde el primer fichero
        Palabra palabra=new Palabra();
        //declaración objeto PalabraFicherosLectura para posibilitar la lectura
        //a nivel de objetos Palabra desde un fichero de texto
        PalabraFileReader fichero;
        //declaración variable entera par almacenar el número de veces que
        //la palabra introducida por el usuario aparece en el fichero de texto
        int contador=0;


        //ACCIONES
        //instanciación objeto PalabraFicherosLectura fichero para establecer
        //el enlace con el fichero de texto problema4.txt a nivel de lectura
        //de objetos Palabra
        fichero=new PalabraFileReader("problema2.txt");
        //mensaje usuario para introducir palabra
        System.out.print("INTRODUCIR PALABRA SUSTITUTA: ");
        while (Palabra.existWords()) {
            //LECTURA PALABRA A SUSTITUIR
            palabra.read();
        }
        System.out.print("INTRODUCIR PALABRA SUSTITUTA: ");
        while (Palabra.existWords()) {
            //LECTURA PALABRA SUSTITUTA
            palabra.read();
        }
        //BUCLE DE TRATAMIENTO DE RECORRIDO DE LECTURA DE OBJETOS Palabra DESDE
        //EL FICHERO DE LECTURA
        while (fichero.next()) {
            //LECTURA OBJETO Palabra DESDE EL FICHERO
            palabra=fichero.read();
            //TRATAMIENTO OBJETO Palabra LEÍDO
            //verificar que el objeto Palabra leído desdeel fichero es igual
            //al objeto Palabra introducido por teclado
            if (palabra.equals(palabraUsuario)) {
                //incrementar contador
                contador++;
            }
        }
        //Visualización resultado
        System.out.println("EL NÚMERO DE VECES QUE APARECE LA PALABRA "+
                palabraUsuario.toString()+" EN EL FICHERO ES "+contador);
    }

}
