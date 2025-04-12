import java.util.*;

public class ASCII_Value {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a character of which the ASCII value is to be assigned =");
        char a = input.next().charAt(0);
        if (a >= 'A' && a <= 'Z') {
            System.out.println("Capitals ASCII = " + (int) a);
        } else if (a >= 'a' && a <= 'z') {
            System.out.println("Small ASCII = " + (int) a);
        } else
            System.out.println("Invalid Character!");

    }
}
