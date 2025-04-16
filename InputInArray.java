import java.util.*;
public class InputInArray {

    public static void main(String[] args) {
       Scanner input= new Scanner(System.in);
       System.out.println("Enter Array size");
       int a=input.nextInt();
       int[] arr=new int[a];
       int sum=0;
       System.out.println("enter array elements=");
       for(int i=0;i<a;i++)
       {
        arr[i]=input.nextInt();
       }
       System.out.println("Array elements are=");
       for(int i=0;i<arr.length;i++)
       {
        System.out.println(arr[i]);
       }
       for(int i=0;i<arr.length;i++)
       {
           sum =sum+arr[i];
       }
       System.out.println("Sum of Array's elements "+sum);


       


    }
}
