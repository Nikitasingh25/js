public class stringcompare {
    public static void main(String[] args) {
        String str="heelo";
        String str1="heiei";
        for(int i=0;i<str.length();i++)
        {
            if(str.charAt(i)==str1.charAt(i)){
                System.out.println(str.charAt(i));
            }
        }
    }
}
