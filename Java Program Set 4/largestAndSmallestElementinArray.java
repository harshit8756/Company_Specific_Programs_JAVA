public class largestAndSmallestElementinArray {
    public static void main(String[] args) {
        int[] arr = {1,2,4,3,5,12,10};
        int smallest = arr[0];
        int largest = arr[0];
        for (int i = 0; i < arr.length; i++)
        {
            if(arr[i] > largest)
            {
                largest= arr[i];
            }
            if(arr[i] < smallest)
            {
                smallest = arr[i];
            }

        }
        System.out.println(largest);
        System.out.println(smallest);
    }
}
