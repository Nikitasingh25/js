import java.util.*;
public class Array1 {
    public static void main(String[] args) {
        int[] arr=new int[5];
        Scanner input=new Scanner(System.in);
        boolean value=true;
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=input.nextInt();
        }
        for(int i=0;i<arr.length-1;i++)
        {
            if(arr[i]<arr[i+1])
            {
                value=false;        
            }
            else if(arr[i]>=arr[i+1])
            {
                value=true;
            }
           
        }
        if(value==true)
        {
            System.out.println("Array is Sorted");
        }
        else System.out.println("Array is not Sorted");

    }
}
