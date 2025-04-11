import java.util.*;
public class VowelConsonant {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a character=");
        char a=input.next().charAt(0);
        switch(a)
        {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
            System.out.println("vowel.");
            break;
            default:
            System.out.println("consonant.");
            
        }
    }
}
