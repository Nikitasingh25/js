 class chaining
 {
    chaining()
    {
        System.out.println("Haha");
    }
    chaining(int a)
    {
        this(); //this() with no parameter is keyword for calling the constructor with no parameter
        System.out.print("its "+a+" ");
    }
    chaining(int a,int b)
    {
        this(5); //this() with one parameter is the keyword for calling the constructor of one parameter
        System.out.print("and "+a+" and "+b);
    }
 }
public class ChainingOfConstructor {
    public static void main(String[] args) {
        chaining obj=new chaining(12,5);

    }
}
