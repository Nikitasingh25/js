public class MissingElementInArray {
    public static void main(String[] args) {
        int[] arr1={1,2,3,4,5,6,8,9,10};
        int sum=0;
        for(int i=0;i<arr1.length;i++)
        {
            sum=sum+arr1[i];
        }
        int sum1=0;
        for(int i=0;i<=10;i++)
        {
            sum1=sum1+i;
        }
        System.out.println("Missing element is "+(sum1-sum));
    }
}
