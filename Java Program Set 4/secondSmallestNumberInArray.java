public class secondSmallestNumberInArray {
    public static void main(String[] args) {
        int[] arr = {14,23,11,56};
        int n = arr.length;
        System.out.println(Secondsmallest(arr,n));
    }
    public static int Secondsmallest(int[] arr , int n )
    {
        // assign the first value of the array is smallest
        int small = arr[0];
        // to find the smallest value
        for (int i = 0; i < n; i++)
        {
            if(arr[i] < small)
            {
                small=arr[i];
            }
        }
        int secondSmall = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++)
        {
           if(arr[i] != small && arr[i] < secondSmall)
           {
               secondSmall = arr[i];
           }
        }
        return secondSmall;

    }
}
