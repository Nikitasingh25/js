import java.util.*;

class BookDetails {
    String Title;
    String Author;
    float Price;

    void Display(String title, String author, float price) {
        Title = title;
        Author = author;
        Price = price;
        System.out.println("Book title is " + Title);
        System.out.println("Book author is " + Author);
        System.out.println("mrp of book is " + Price);
        float discountmoney = Price * 0.2f;
        Price -= discountmoney;
        System.out.println("price after discount is " + Price);

    }
}

public class Book {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        BookDetails obj = new BookDetails();
        System.out.print("Enter the Book's Title name = ");
        String title = input.next();
        System.out.print("Enter the Book's Autor name = ");
        String author = input.next();
        System.out.print("Enter the Price of Book = ");
        float price = input.nextFloat();
        obj.Display(title, author, price);
    }
}
