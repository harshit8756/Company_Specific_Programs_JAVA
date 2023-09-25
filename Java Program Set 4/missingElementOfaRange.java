import java.util.HashSet;

public class missingElementOfaRange {
    public static void main(String[] args) {
        int[] arr = {1,3,5,7,9};
        int low = 1 , high = 9;
        missingElement(arr, low , high);
    }

    public static void missingElement(int[] arr , int low , int high)
    {
        // define hashset
        HashSet<Integer> set = new HashSet<>();
        // add an element in the set , by using for loop
        for (int i = 0; i < arr.length; i++)
        {
             set.add(arr[i]);
        }
        // to traverse the set for the given range
        for (int i = low; i <= high ; i++)
        {
            if (!set.contains(i))
            {
                System.out.print(i + " ");
            }
        }
    }
}
