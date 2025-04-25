public class MaxDigitAfterTheSum {
    static void sum(int a,int b)
    {
        int c=a+b;
        System.out.println("sum value is "+c);
        int count=0;
        while (c>0) {
            int digit=c%10;
            if(digit>count){
                count=digit;
              
            }
            c/=10;
        }
        //  for(int i=c;i>0;i/=10)
        //  {
        //     int rem=i%10;
        //     int r=rem;
        //     if()
        //  }
        System.out.println(count);
    }
    public static void main(String[] args) {
        sum(8,6);
    }
}
