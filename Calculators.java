import java.util.*;

class calculator {
    float a;
    float b;

    void Addition(float A, float B) {
        a = A;
        b = B;
        System.out.println("Sum is " + (a + b));
    }

    void Subtraction(float A, float B) {
        a = A;
        b = B;
        System.out.println("Subtraction is " + (a - b));

    }

    void Mulitplication(float A, float B) {
        a = A;
        b = B;
        System.out.println("Mulitplication is " + (a * b));
    }

    void Division(float A, float B) {
        a = A;
        b = B;
        System.out.println("Division is " + (a / b));
    }

}

public class Calculators {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        calculator obj = new calculator();
        System.out.print("Enter your choice ");
        char ch = input.next().charAt(0);
        switch (ch) {
            case '+':
                System.out.print("Enter the first operand ");
                float a = input.nextFloat();
                System.out.print("Enter the Second operand ");
                float b = input.nextFloat();
                obj.Addition(a, b);
                break;
            case '-':
                System.out.print("Enter the first operand ");
                a = input.nextFloat();
                System.out.print("Enter the second operand ");
                b = input.nextFloat();
                obj.Subtraction(a, b);
            case '*':
                System.out.print("Enter the first operand ");
                a = input.nextFloat();
                System.out.print("Enter the  second operand ");
                b = input.nextFloat();
                obj.Mulitplication(a, b);
            case '/':
                System.out.print("Enter the first operand ");
                a = input.nextFloat();
                System.out.print("Enter the second operand ");
                b = input.nextFloat();
                obj.Division(a, b);
                break;
            default:
                System.out.println("Invalid choice!!");
        }
    }
}
