import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;

public class removeDuplicateNumberInArray {
    public static void main(String[] args) {
        int[] inputArray = {1, 2, 3, 4, 3, 2, 1, 6, 7, 8};
        removeDuplicate(inputArray);
    }
    public static  void removeDuplicate(int[] inputArray)
    {
        LinkedHashSet<Integer> arr1 = new LinkedHashSet<>();
        for (int i = 0; i < inputArray.length; i++)
        {
            arr1.add(inputArray[i]);
        }
        System.out.println(arr1);
    }
}
