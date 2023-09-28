import java.util.HashSet;

public class disjiontArrayOrNot {
    public static void main(String[] args) {
        int[] arr1 = {10,51,3,43,6};
        int[] arr2 = {80,71,29,36};

        if(DisjointArray(arr1, arr2))
        {
            System.out.println("Yes both the arrays are disjoint");
        }
        else
        {
            System.out.println("No , both the arrays are not disjoint");
        }

    }
    public static boolean DisjointArray(int[] arr1 , int[] arr2)
    {
        HashSet<Integer> set = new HashSet<>();

        for (int i = 0; i < arr1.length; i++)
        {
          set.add(arr1[i]);
        }

        for (int i = 0; i < arr2.length; i++)
        {
           if(set.contains(arr2[i]))
           {
               return false;
           }
        }
        return true;

    }
}
