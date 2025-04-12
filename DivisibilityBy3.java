import java.util.*;

public class DivisibilityBy3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Number you want to check the divisibility.=");
        int a = input.nextInt();
        if (a % 3 == 0) {
            System.out.println("Divisible by 3.");
        } else
            System.out.println("Not Divisible by 3.");
    }
}
