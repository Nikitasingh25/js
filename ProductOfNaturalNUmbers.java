import java.util.*;
public class ProductOfNaturalNUmbers {
    static int product(int n)
    {   
        int product=1;

        for(int i=1;i<=n;i++)
        {
            product=product*i;

        }
        return product;
    }
    public static void main(String[] args)
    {
     Scanner input = new Scanner(System.in);
     System.out.println("Enter a no. :");
     int n= input.nextInt();
    int a= product(n);
    System.out.println(a);

    }
}
