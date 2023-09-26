import java.util.Arrays;

public class largestPalindromicNumberInArray {
    public static void main(String[] args) {
       Integer[] arr = {857 , 232,1996991 , 54545};
       System.out.println(Arrays.toString(arr));
       Arrays.sort(arr);
        for (int i = arr.length-1; i >=0 ; i--)
        {
             String reverse = "";
             String original = Integer.toString(arr[i]);
            for (int j = original.length()-1; j >=0 ; j--)
            {
                reverse = reverse + original.charAt(j);
            }
            if(original.equals(reverse))
            {
                System.out.println(original);
            }
            break;
        }

    }
}
