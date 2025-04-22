public class stringPalindrome {
    public static void main(String[] args) {
        
    
    String str="hello";
    //String str1=str;
    String str3 ="";
    for(int i=str.length()-1; i>=0; i--)
    {
       str3+=str.charAt(i);
    }
    //System.out.println(str3);
    if(str.equals(str3))
    {
        System.out.println("palindrome");
    }
    else
    System.out.println("not palindrome");
    }
    
}
