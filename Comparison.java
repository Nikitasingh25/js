import java.util.*;

public class Comparison {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter first Number= ");
        int a = input.nextInt();
        System.out.println("Enter second Number=");
        int b = input.nextInt();
        if (a > b) {
            System.out.println("A is bigger.");
        } else
            System.out.println("B is bigger.");
    }
}
