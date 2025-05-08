abstract class payment    //incomplete class ,its object cant be created 
{   
    abstract void pay(int a);
    void print()
    {
        System.out.println("Payment done");
    }  

}
class upiPayment extends payment{
    void pay(int a)
    {
        System.out.println("payment done via upi "+a);
    }
}

class Card extends payment {
    void pay(int a)
    {
        System.out.println("payment done via card "+a);
    }
} 
public class Abstract{
           public static void main(String[] args) {
                payment obj=new upiPayment(); // to use the properties of abstract class make the object of child class and store it in the abstract class obj.
                obj.pay(250);
                obj.print();
                payment obj1=new Card();
                obj1.pay(25000);
                obj1.print();


           }
}