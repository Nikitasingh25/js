import java.util.*;
public class ArraySum1 {
public static void main(String[] args) {
    int[] arr1={1,2,3,5,4};
    int[] arr2={1,2,3,4,5};
    int[] sum= new int[arr1.length];
    for(int i=0;i<sum.length;i++){
        sum[i] = arr1[i]+arr2[i];

    }
    for(int i =0;i<sum.length;i++){
        System.out.println(sum[i]);
    }
}
}
