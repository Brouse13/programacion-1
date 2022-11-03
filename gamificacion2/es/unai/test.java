package es.unai;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class test {
    public static char[] chars;
    public static String string = "fdlkfhsdofwhefoxewfimcewofiyceynvfiuvewvrmlifefdlkfhsdofwhefoxewfimcewofiyceynvfiuvewvrmlifefdlkfhsdofwhefoxewfimcewofiyceynvfiuvewvrmlifefdlkfhsdofwhefoxewfimcewofiyceynvfiuvewvrmlifefdlkfhsdofwhefoxewfimcewofiyceynvfiuvewvrmlifefdlkfhsdofwhefoxewfimcewofiyceynvfiuvewvrmlifefdlkfhsdofwhefoxewfimcewofiyceynvfiuvewvrmlifefdlkfhsdofwhefoxewfimcewofiyceynvfiuvewvrmlifefdlkfhsdofwhefoxewfimcewofiyceynvfiuvewvrmlife";
    private static long millis;
    private static int times;

    public static void main(String[] args) {
        for (int k = 0; k < 100; k++) {
            chars = string.toCharArray();

            times = 0;
            millis = System.currentTimeMillis();
            Matcher matcher = Pattern.compile("[^e]*e").matcher(string);
            for (int i = 0; i < 1000000; i++) {
                while (matcher.find())
                    times++;
            }
            System.out.println("A: " + (System.currentTimeMillis() - millis));

            times = 0;
            millis = System.currentTimeMillis();
            for (int j = 0; j < 1000000; j++) {
                for (int i = 0; i < chars.length; i++) {
                    if (chars[i] == 'e') times++;
                }
            }
            System.out.println("B: " + (System.currentTimeMillis() - millis));

            times = 0;
            millis = System.currentTimeMillis();
            for (int j = 0; j < 1000000; j++) {
                for (char aChar : chars) {
                    if (aChar == 'e') times++;
                }
            }
            System.out.println("C: " + (System.currentTimeMillis() - millis));
            System.out.println("\n");
        }
    }
}
