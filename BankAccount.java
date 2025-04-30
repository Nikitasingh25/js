import java.util.Scanner;

class BankDetails {
    long AccountNo;
    String AccountHolder;
    float Balance = 0;
    float Amount;

    void deposit(float amount) {
        Amount = amount;
        Balance += Amount;
        System.out.println("Added amount is " + Amount);
        System.out.println("Total Balance is " + Balance);

    }

    void withdraw(float amount) {
        Amount = amount;
        if (Balance > 0) {
            Balance -= Amount;
            System.out.println("Withdrawal money = " + Amount);
            System.out.println("Balance After withdrawal = " + Balance);
        } else
            System.out.println("Insufficient Balance");
    }

}

public class BankAccount {
    public static void main(String[] args) {
        BankDetails obj = new BankDetails();
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your choice:");
        char ch = input.next().charAt(0);
        switch (ch) {
            case 'w':
                System.out.println("Enter the amount for withdrawal = ");
                float amount = input.nextInt();
                obj.withdraw(amount);
                break;
            case 'd':
                System.out.println("Enter the amount to deposit =");
                float amountt = input.nextInt();
                obj.deposit(amountt);
                break;
            default:
                System.out.println("Invalid Selection!!");
        }

    }
}
