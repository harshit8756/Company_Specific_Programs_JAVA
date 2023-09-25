public class evenAnOddElementInArray {
    public static void main(String[] args) {
        int[] arr = {1,10,2,3,5,6};
        int n = arr.length;
        evenOdd(arr,n);
    }

    public static void evenOdd(int[] arr , int n)
    {
        for (int i = 0; i < arr.length; i++)
        {
            if(arr[i] % 2 == 0 )
            {
                System.out.println("Even " + arr[i]);
            } else if (arr[i] % 2 != 0)
            {
                System.out.print("odd " + arr[i]);
            }
            else
            {
                System.out.println("not found");
            }
        }

    }
}
