public class maximumProductSubarray {
    public static void main(String[] args) {
        int[] arr = {10,-20,-20,0,70,-80,-20};
        int n = arr.length;
        System.out.println(maximumProduct(arr,n));
    }
    public static int maximumProduct(int[] arr , int n)
    {
        int result = arr[0];
        for (int i = 0; i < n; i++)
        {
            int multi = arr[i];
            for (int j = i+1; j < n; j++)
            {
                result = Math.max(result,multi);
                multi=multi*arr[j];
            }
            result = Math.max(result,multi);
        }
        return result;
    }
}
