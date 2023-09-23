public class reverseAnArray {
    public static void main(String[] args) {
        int[] arr = {2,3,4,1,4,6};
        System.out.println("Original Array");
        for (int i = 0; i < arr.length; i++)
        {
            System.out.print(arr[i] + ",");
        }
        System.out.println();
        System.out.println("Reverse Array");
        for (int i = arr.length - 1; i >= 0 ; i--)
        {
            System.out.print(arr[i] + ",");
        }
    }
}
