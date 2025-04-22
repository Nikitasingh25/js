public class Vowelstring {
    public static void main(String[] args) {
        String str="heooo";
        int count=0;
        for(int i=0;i<str.length();i++)
        {
             switch(str.charAt(i))
             {
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                case 'a':
               // System.out.println("vowel");
                count++;
                default:
                
             }

        }
        System.out.println(count);

    }
}
