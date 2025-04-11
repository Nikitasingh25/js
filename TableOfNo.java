import java.util.*;

public class TableOfNo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a no. you want to hava the table=");
        int a = input.nextInt();
        int mul;
        for (int i = 1; i <= 10; i++) {
            mul = a * i;
            System.out.println(mul);
        }

    }
}
