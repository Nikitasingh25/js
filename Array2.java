public class Array2 {
    public static void main(String[] args) {
        int[][] arr ={{1,2,3,4},{1,2,3,5,6}};
      /*   for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr[i].length;j++)
            {
                System.out.println("Elements are="+arr[i][j]);
            }
        }*/
       int count=0;
        for(int i=0;i<arr.length;i++)
        {
           count=count+arr[i].length;
        }
        System.out.println(count);
        int[] arr1=new int[count];
        int k=0;
        for(int i =0;i<arr.length;i++)
        {
            for(int j =0;j<arr[i].length;j++)
            {
                arr1[k++]=arr[i][j];
            }
        }
        for(int i=0;i<arr1.length;i++)
        {
            System.out.println(arr1[i]);
        }

    }

}
