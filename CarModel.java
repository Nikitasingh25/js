import java.util.*;
 class Car{
    String Brand;
    int Model;
    float Price;
    void Display(String brand,int model,float price)
    {  Brand=brand;
        Model=model;
        Price=price;
        System.out.println("Brand is "+Brand);
        System.out.println("Model is "+Model);
        System.out.println("Price is "+Price);
    }
 }


public class CarModel {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        Car obj =new Car();
        System.out.print("Enter car brand= ");
        String brand=input.next();
        System.out.print("Enter car Model =  ");
        int model=input.nextInt();
        System.out.print("Enter car price =");
        float price=input.nextFloat();
        obj.Display(brand, model, price);

    }
}
