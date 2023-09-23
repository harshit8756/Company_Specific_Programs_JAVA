import java.util.*;
import java.util.Scanner;
public class arraySameOrNot {
    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4,5};
        int[] arr2 = {5,4,0,2,1};

        if(arrayEquals(arr1 , arr2))
        {
            System.out.println("Array are equal");
        }
        else
        {
            System.out.println("not equal");
        }

    }

    public static boolean arrayEquals(int[] arr1 , int[] arr2)
    {
        int n = arr1.length;
        int m = arr2.length;

        if(n!=m)
        {
            return false;
        }
        Arrays.sort(arr1);
        Arrays.sort(arr2);

        for (int i = 0; i < n; i++)
        {
            if(arr1[i] != arr2[i])
            {
                return false;
            }
        }
        return true;
    }
}
