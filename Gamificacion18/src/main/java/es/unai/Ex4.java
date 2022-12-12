package es.unai;

/* ********************************************************************************************************************
 * Author:        Unai
 * Creation date: 12/12/2022
 * Last update:   12/12/2022
 * Description:   Given a file 'problema4.txt' encode the file using cesar encoding into 'problema4Codificado.txt'
 * Usage:         Run the program
 ******************************************************************************************************************* */
public class Ex4 {
    public static void main(String[] args) throws Exception {
        new Ex4().start();
    }

    private void start() throws Exception {
        PalabraFileReader reader = new PalabraFileReader("problema4.txt");
        PalabraFileWriter writer = new PalabraFileWriter("problema4Codificado.txt");

        while (reader.next()) {
            writer.write(reader.read().cesarEncode(3));
            writer.writeSpace();
        }

        reader.close();
        writer.close();
    }
}
