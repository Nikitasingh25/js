public class Array3 {
    public static void main(String[] args) {
        int[][] arr1 = { { 1, 2 }, { 2, 3 } };

        int[][] arr2 = { { 1, 2 }, { 2, 3 } };
        int[][] arr = new int[2][3];

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                arr[i][j] = 0;
                int sum = 0;
                for (int k = 0; k < arr.length; k++) {
                    sum += arr1[i][k] * arr2[k][j];

                }
                arr[i][j] = sum;
                System.out.println(arr[i][j]);
            }
        }
    }
}
