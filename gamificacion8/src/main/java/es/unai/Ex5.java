package es.unai;

/* ********************************************************************************************************************
 * Author:        Unai
 * Creation date: 26/10/2022
 * Last update:   26/10/2022
 * Description:   Show the month with the higher temperature, the lower and the average
 * Usage:         Run the program
 ******************************************************************************************************************* */
public class Ex5 {
    public static void main(String[] args) {
        final String[] months = new String[] {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto",
        "Septiembre", "Octubre", "Noviembre", "Diciembre"};
        final int[] temperature = new int[]{10, 12, 14, 16, 18, 20, 22, 24, 26, 28, 30, 32};

        display(months, temperature);
    }

    private static void display(String[] months, int[] temperature) {
        System.out.printf("Temperatura media año: %1$.2fºC\n", average(temperature));
        System.out.printf("Mes más cálido del año: %s\n", hottest(months, temperature));
        System.out.printf("Mes más frio del año: %s\n", coldest(months, temperature));
    }

    private static double average(int[] temperature) {
        double sum = 0;
        for (int i = 0; i < temperature.length; i++) {
            sum += temperature[i];
        }
        return sum / temperature.length;
    }

    private static String hottest(String[] months, int[] temperature) {
        int index = 0;
        for (int i = 0; i < temperature.length; i++) {
            if (temperature[i] > temperature[index])
                index = i;
        }
        return months[index];
    }

    private static String coldest(String[] months, int[] temperature) {
        int index = 0;
        for (int i = 0; i < temperature.length; i++) {
            if (temperature[i] < temperature[index])
                index = i;
        }
        return months[index];
    }
}
