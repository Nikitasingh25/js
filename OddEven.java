public class OddEven {
    public static void main(String[] args) {
        int no=1234;
        int n=no;
        for(int i=0;i<4;i++)
        { 
            no=i%10;
            if(no%2==0)
            {
                System.out.println("even");
            }
            else{
            System.out.println("odd");
            }
            no/=10;

        }
    }
}
