import java.util.*;

public class DivisibilityTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number=");
        int a = input.nextInt();
        if (a % 5 == 0 && a % 11 == 0) {
            System.out.println("Divisible by 5 and 11.");
        } else
            System.out.println("Not Divisible by 5 and 11.");
    }
}