import java.util.*;

public class Calculator {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your first number=");
        int a = input.nextInt();
        System.out.println("Enter your second number=");
        int b = input.nextInt();
        System.out.println("Enter the command=");
        char c = input.next().charAt(0);
        switch (c) {
            case '+':
                System.out.println(a + b);
                break;
            case '-':
                System.out.println(a - b);
                break;
            case '*':
                System.out.println(a * b);
                break;
            case '/':
                System.out.println(a / b);
                break;
            default:
                System.out.println("Invalid command");
        }
    }
}
