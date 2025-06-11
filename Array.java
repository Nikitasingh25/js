//import java.util.*;
public class Array {
    public static void main(String[] args) {

        int[] ar = { 1, 3, 2, 6, 0, 7, 7, 7, 7 };
        for (int i = 0; i < ar.length; i++) {
            for (int j = 0; j < ar.length - 1; j++) {
                if (ar[j] > ar[j + 1]) {
                    int temp = ar[j + 1];
                    ar[j + 1] = ar[j];
                    ar[j] = temp;

                }
            }

        }
        /*
         * for(int i=0;i<ar.length;i++)
         * {
         * System.out.println(ar[i]);
         * }
         */
        int large = ar[ar.length - 1];
        System.out.println(large);
        int count = ar.length;
        for (int i = ar.length - 1; i >= 0; i--) {
            if (ar[i] == large) {
                count--;

            }
        }
        System.out.println(ar[count - 1]);
    }
}
