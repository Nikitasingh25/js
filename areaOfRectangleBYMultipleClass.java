class Rectangle{
    int length=12;
    int breadth=2;
    void Area()
    {
        System.out.println("Area is "+(length*breadth));
    }
}
public class areaOfRectangleBYMultipleClass {
    public static void main(String[] args) {
        Rectangle obj=new Rectangle();
        obj.Area();
    }
}
