import java.util.*;

public class PosNegZeroInput {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a Number=");
        int a = input.nextInt();
        if (a > 0) {
            System.out.println("Positive Number.");
        } else if (a < 0) {
            System.out.println("Negative Number");
        } else
            System.out.println("Zero");
    }
}
