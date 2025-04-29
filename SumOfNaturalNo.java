import java.util.*;
public class SumOfNaturalNo {
    public static int sum(int n)
    {   
        int sum=0;
        for(int i=1;i<=n;i++)
        {
            sum=sum+i;
        }
        return sum;
    } 
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a no. :");
        int n=input.nextInt();
       int a= sum(n);
       System.out.println(a);

    }
}
