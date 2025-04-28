import java.util.*;
public class NaturalNoPrint {
    public static void Natural(int n)
    {
       for(int i=1;i<=n;i++)
       {
        System.out.println("Natural No.: "+i);
       } 
    }
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("enter NO. of NAtural;");
        int n=input.nextInt();
        Natural(n);
    }

}
