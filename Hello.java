abstract class Shape{
    abstract void area(int a);
    abstract void area(int a,int b);
  
  }
  class Circle extends Shape{
       void area(int a)
       {
          System.out.println("Area is "+(3.14*(a*a)));
       }
  }
  class Rectangle extends Shape{
     void area(int a,int b)
     {
      System.out.println("Area is "+(a*b));
     }
  }
  
    public static void main(String[] args) {
        
    }
}
