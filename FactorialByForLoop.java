import java.util.*;

public class FactorialByForLoop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number you want to take factorial of =");
        int num = input.nextInt();
        int fact = 1;
        for (int i = 1; i <= num; i++) {
            fact = fact * i;

        }
        System.out.println("Factorial of " + num + " is " + fact);

    }
}
