public class Arrayy {
    public static void main(String[] args) {
        int[] arr={9,5,6,1,0,9,9,9};
           int largest=arr[0];
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>largest)
            {
                largest=arr[i];
            }
        }
        System.out.println(largest);
        int slargest=-1;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>slargest && arr[i]<largest) 
            {
                slargest=arr[i];
            }
        }
        System.out.println(slargest);
    }
}
