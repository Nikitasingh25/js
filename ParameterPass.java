public class ParameterPass {
    static void Sum(int a)
    {   int sum=0;
        for(int i=a;i>0;i/=10){
            int rem=i%10;
            sum=sum+rem;

        }
       System.out.println(sum);
    }
    public static void main(String[] args) {
        Sum(123);
    }
}
