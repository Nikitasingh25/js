public class stringmatch1 {
    public static void main(String[] args) {
        String str="heelo";
        String str1="heiei";
        for(int i=0;i<str.length();i++)  //if the length of one string is smaller than the other one then it will come in outer portion of loop
        {
            for(int j=0;j<str1.length();j++) // larger length string comes in inner loop 
            {
              if(str.charAt(i)==str1.charAt(j))
              {
                System.out.println(str.charAt(i));
                break;
              }
            }
        }
    }
}
