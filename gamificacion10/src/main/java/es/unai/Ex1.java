package es.unai;

/* ********************************************************************************************************************
 * Author:        Unai
 * Creation date: 03/11/2022
 * Last update:   03/11/2022
 * Description:   Display the amount of infections on each autonomous community
 * Usage:         Run the program
 ******************************************************************************************************************* */

public class Ex1 {
    public static void main(String[] args) {
        new Ex1().start();
    }
    private void start() {
        final String[] ccaa = {"Andalucía", "Aragón", "Canarias", "Cantabria", "Castilla y León",
                "Castilla-La Mancha", "Cataluña", "Ceuta", "Comunidad Valenciana", "Comunidad de Madrid",
                "Extremadura", "Galicia", "Islas Baleares", "La Rioja", "Melilla", "Navarra", "País Vasco",
                "Principado de Asturias", "Región de Murcia"};

        final int[] infections = {1, 2, 3 ,4, 5, 6, 7, 8, 9, 0, 1, 2, 3, 4, 5, 6, 7};

        System.out.printf("COMUNIDAD CON MÁS CONTAGIOS: %s\n", getMostInfected(ccaa, infections));
        System.out.printf("MEDIA NACIONAL DE CONTAGIOS: %1$.2f\n", getAverageInfections(infections));
    }

    private double getAverageInfections(int[] infections) {
        double sum = 0;

        for (int i = 1; i < infections.length; i++) {
            sum += infections[i];
        }
        return sum / infections.length;
    }

    private String getMostInfected(String[] ccaa, int[] infections) {
        int index = 0;
        for (int i = 1; i < infections.length; i++) {
            if (infections[i] > infections[index]) {
                index = i;
            }
        }
        return ccaa[index];
    }
}
