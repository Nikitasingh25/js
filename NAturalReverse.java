 import java.util.*;
public class NAturalReverse {
    public static void nat(int n)
    {
        for(int i=n;i>0;i--)
        {
            System.out.println(i);
        }
    }
    public static void main(String[] args)
    {
        Scanner input=new Scanner(System.in);
      System.out.println("Enter No. :");
      int n=input.nextInt();
      nat(n);
    }
}
