import java.util.*;

class Circle {
    float Radius;

    void circumference(int radius) {
        Radius = radius;
        float circum = 2 * (3.14f) * radius;
        System.out.println("circumference is " + circum);

    }

    void Area(int radius) {
        Radius = radius;
        float Area = 3.14f * radius * radius;
        System.out.println("Area is " + Area);
    }
}

public class AreaAndCircumOfCircle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Circle obj = new Circle();
        System.out.print("Enter your operation choice = ");
        char ch = input.next().charAt(0);
        switch (ch) {
            case 'a':
                System.out.print("Enter the radius = ");
                int rad = input.nextInt();
                obj.Area(rad);
                break;
            case 'c':
                System.out.print("Enter the radius = ");
                int radd = input.nextInt();
                obj.circumference(radd);
                break;
            default:
                System.out.println("Invalid operation please try again!!");
        }

    }
}
