public class nonRepeatingElementInArray {
    public static void main(String[] args) {
        int[] arr = {1,1,2,2,3,4,5,3,5};
        for (int i = 0; i < arr.length; i++)
        {
            for (int j = i+1; j <arr.length; j++)
            {
             if ( i!=j && arr[i] == arr[j])
             {
                 System.out.println(arr[j]);
             }
             break;

            }
        }
    }
}
