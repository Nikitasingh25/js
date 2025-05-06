
/*public class Construc {
    void sum()
    {

        System.out.println(this);
    }
    public static void main(String[] args) {
        Construc obj=new Construc();
        System.out.println(obj);
        obj.sum();
    }
    
}*/
class Hello{
    int a =35;
     Hello(int a)
     {
        this.a=a; //this keyword is used to point instance variable of object
     }
     void sum()
     {
        System.out.println(a);
     }
}
public class Construc{
    public static void main(String[] args) {
        Hello obj=new Hello(25);
        System.out.println(obj.a);
    }
}

