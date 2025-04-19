public class MaxElementsArray {
    public static void main(String[] args) {
        int[] arr1={1,2,45,33};
        int[] arr2 = {1,2,45,55};
        int max1=arr1[0];
        int max2=arr2[0];
        for(int i=0;i<arr1.length;i++)
        {
            if(arr1[i]>max1)
            {
                max1=arr1[i];

            }
        }
     //   System.out.println("Max in Array 1 is "+max1);
        for(int i =0;i<arr2.length;i++)
        {
            if(arr2[i]>max2)
            { 
                max2=arr2[i];
            }
        }
     //   System.out.println("Max element in Array2 is "+max2);
      System.out.print("Max element in both of the array is ");
      if(max1>max2)
      {
        System.out.println(max1);
      }
      else
      System.out.println(max2);
    }
}
