import java.util.*;
public class ArraySum {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        int[] arr = {1,2,3,4,5};
        int[] arr1 = {1,3,2,4,5};
        int sum=0;
        int sum1=0;
        int add;
        for(int i=0;i<arr.length;i++)
        {
            sum=sum+arr[i];
        }
        System.out.println("sum of elements of arr is "+sum);
        for(int j=0;j<arr1.length;j++)
        {
            sum1=sum1+arr1[j];

        }
        System.out.println("sum of elements of arr1 is "+sum1);
        add=sum+sum1;
        System.out.println("sum of Arr and Arr1 is "+add);
        
    }
}
