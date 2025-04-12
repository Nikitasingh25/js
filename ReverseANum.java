import java.util.*;

public class ReverseANum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a Number = ");
        int num = input.nextInt();
        int Rev = 0;
        int rem;
        int i = num;

        while (i > 0) {
            rem = i % 10;
            Rev = Rev * 10 + rem;
            i = i / 10;
        }
        System.out.println("Reverse of " + num + " is " + Rev);
    }
}
