public class MergeTwoArrays {
    public static void main(String[] args) {
        int[] arr1={ 1,2,3,4,5};
        int[] arr2={1,3,6,7};
        int[] merged=new int[arr1.length+arr2.length];
        for(int i=0;i<arr1.length;i++)
        {
            merged[i]=arr1[i];
        }
        for(int i=0;i<arr2.length;i++)
        {
            merged[arr1.length+i]=arr2[i];
        }
        for(int i=0;i<merged.length;i++)
        {
            System.out.println("Merged elements of two array are "+merged[i]);
        }
    }
}
