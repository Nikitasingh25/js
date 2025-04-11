import java.util.*;

public class EvenOddInput {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a Number");
        int a = input.nextInt();
        if (a % 2 == 0) {
            System.out.println("Even Number.");
        } else
            System.out.println("Odd Number.");

    }
}
