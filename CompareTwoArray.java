public class CompareTwoArray {
    public static void main(String[] args) {
        int[] arr1={1,2,3,4,5};
        int[] arr2={1,4,6,0,3};   
        for(int i=0;i<arr1.length;i++)
        {
            if(arr1[i]>arr2[i])
            {
                System.out.println(arr1[i]+" is greater than "+arr2[i]);
            }
            else if(arr2[i]>arr1[i])
            {
                System.out.println(arr2[i]+" is greater than "+arr1[i]);
            }
            else{
                System.out.println(arr1[i]+" is equal to "+arr2[i]);
            }
        }
    
    }
}
