package es.unai;

public class Ex4 {
    public static void main(String[] args) {
        new Ex4().start();
    }

    private void start() {
        final int[] arr1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
        final int[] arr2 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
        int[] subtract = subtract(arr1, arr2);

        for (int i = 0; i < subtract.length; i++) {
            System.out.printf("%d - %d = %d\n", arr1[i], arr2[i], subtract[i]);
        }
    }

    private int[] subtract(int[] arr1, int[] arr2) {
        int[] result = new int[arr1.length];

        for (int i = 0; i < result.length; i++) {
            result[i] = arr1[i] - arr2[i];
        }

        return result;
    }
}
