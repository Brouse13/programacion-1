package es.unai;

/* ********************************************************************************************************************
 * Author:        Unai
 * Creation date: 29/11/2022
 * Last update:   29/11/2022
 * Description:   Given two files 'problema10_1.txt' and 'problema10_2.txt' show if theis content is equals
 * Usage:         Run the program
 ******************************************************************************************************************* */
public class Ex10 {
    private Palabra palabra1;
    private Palabra palabra2;

    public Ex10() {
    }

    public static void main(String[] args) throws Exception {
        new Ex10().start();
    }

    private void start() throws Exception {
        PalabraFileReader reader1 = new PalabraFileReader("problema10_1.txt");
        PalabraFileReader reader2 = new PalabraFileReader("problema10_2.txt");
        boolean invalid = false;

        //Loop throw all the words on the reader in pairs
        while ((reader1.next() && reader2.next()) && !invalid) {
            palabra1 = reader1.read();
            palabra2 = reader2.read();

            if (!palabra1.equals(palabra2)) {
                invalid = true;
            }
        }

        //Check if it can do an iterator on one of the files -> different
        if (reader1.next() || reader2.next()) {
            invalid = true;
        }

        if (invalid) {
            System.out.println("Los dos archivos son diferentes");
        }else {
            System.out.println("Los dos archivos son iguales");
        }

        reader1.close();
        reader2.close();
    }
}
