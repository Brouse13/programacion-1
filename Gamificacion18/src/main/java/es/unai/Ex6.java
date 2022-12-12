package es.unai;

/* ********************************************************************************************************************
 * Author:        Unai
 * Creation date: 12/12/2022
 * Last update:   12/12/2022
 * Description:   Given a menu encode or decode depending on the options.
 * Usage:         Run the program and follow the menu instructions
 ******************************************************************************************************************* */
public class Ex6 {
    public static void main(String[] args) throws Exception {
        new Ex6().start();
    }

    private void start() throws Exception {
        int code;

        do {
            displayMenu();
            code = LT.readInt();

            switch (code) {
                case 1 -> encode();
                case 2 -> decode();
                case 3 -> System.out.println("Gracias pos usar el codificador");
                default -> System.out.println("Número no válido");
            }
        }while (code != 3);
    }

    private void displayMenu() {
        System.out.println("1 - Codificación.");
        System.out.println("2 - Decodificación.");
        System.out.println("3 - Finalizar.");
    }

    private void encode() throws Exception {
        Palabra from = new Palabra();
        Palabra to = new Palabra();

        System.out.println("Introduce el archivo a codificar");
        while (Palabra.existWords()) {
            from.read();
        }

        System.out.println("Introduce el archivo a donde guardar");
        while (Palabra.existWords()) {
            to.read();
        }

        transform(from, to, 3);
        System.out.println("Archivo codificado exitosamente");
    }

    private void decode() throws Exception {
        Palabra from = new Palabra();
        Palabra to = new Palabra();

        System.out.println("Introduce el archivo a decofificar");
        while (Palabra.existWords()) {
            from.read();
        }

        System.out.println("Introduce el archivo a donde guardar");
        while (Palabra.existWords()) {
            to.read();
        }

        transform(from, to, 26);
        System.out.println("Archivo decodificado exitosamente");
    }

    private void transform(Palabra from, Palabra to, int transform) throws Exception {
        PalabraFileReader reader = new PalabraFileReader(from.toString() + ".txt");
        PalabraFileWriter writer = new PalabraFileWriter(to.toString() + ".txt");

        while (reader.next()) {
            writer.write(reader.read().cesarEncode(transform));
            writer.writeSpace();
        }

        reader.close();
        writer.close();
    }
}
