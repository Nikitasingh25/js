public class swapwithoutthirdvariable {
    public static void main(String[] args)
    {
        int a=5;
        int b=10;
        a=a+b-(b=a);
        
        System.out.println(a);
        System.out.println(b);
        

    }
    
}
