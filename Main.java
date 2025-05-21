 abstract class Shape{
  abstract void area(int a);
  abstract void area(int a,int b);

}
class Circle extends Shape{
     void area(int a)
     {
        System.out.println("Area is "+(3.14*(a*a)));
     }
     void area(int a,int b)
     {
        System.out.println("area is =");
     }

    }
class Rectangle extends Shape{
   void area(int a,int b)
   {
    System.out.println("Area is "+(a*b));
   }
   void area(int a)
   {
    System.out.println("area is");
   }
}
public class Main {
    public static void main(String[] args) {
        Shape obj = new Circle();
        Shape obj1 =new Rectangle();
        obj.area(2);
        obj1.area(2,3);
    }
}
