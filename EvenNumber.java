import java.util.*;

public class EvenNumber {
    public static void Eveen(int s,int e)
    {
        for(int i=s+1;i<e;i++)
        {
            if(i%2==0)
            {
                System.out.println(i);
            }

        }
        

    
    }
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.println("Enter initial limit :");
        int s=input.nextInt();
        System.out.println("Enter end limit :");
        int e=input.nextInt();
        Eveen(s,e);

    }
}
