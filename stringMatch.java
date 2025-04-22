public class stringMatch {
    public static void main(String[] args) {
        String str="hello";
        String str2="hieee";
        for(int i=0;i<str.length();i++)
        {
            if(str.charAt(i)==str2.charAt(i))
            {
                System.out.println(str.charAt(i));
            }
        }
    }
}
