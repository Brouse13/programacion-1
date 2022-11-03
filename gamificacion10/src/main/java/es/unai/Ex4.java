package es.unai;

/* ********************************************************************************************************************
 * Author:        Unai
 * Creation date: 03/11/2022
 * Last update:   03/11/2022
 * Description:   Given 10 politician groups display the amount and average of votes
 * Usage:         Run the program
 ******************************************************************************************************************* */

public class Ex4 {
    public static void main(String[] args) {
        new Ex4().start();
    }

    private void start() {
        int[] votes = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
        String[] groups = {"PARTIDO ROJO", "PARTIDO AZUL", "PARTIDO VERDE", "PARTIDO AMARILLO",
                "PARTIDO VIOLETA", "PARTIDO MAGENTA", "PARTIDO ROSA", "PARTIDO MARRÓN", "PARTIDO BLANCO",
                "PARTIDO NEGRO"};

        double totalVotes = getVotes(votes);

        for (int i = 0; i < groups.length; i++) {
            System.out.printf("%s-> \n\tNúmeros de votos: %d\n\tPorcentaje votos: %3$.2f%4$s\n",
                    groups[i], votes[i], ((votes[i] / totalVotes) * 100), "%");
        }
    }

    private double getVotes(int[] numbers) {
        int sum = numbers[0];

        for (int i = 1; i < numbers.length; i++) {
            sum += numbers[1];
        }

        return sum;
    }
}
