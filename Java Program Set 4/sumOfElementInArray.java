public class sumOfElementInArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3 ,10,11};
        int add = 0;
        for (int i = 0; i < arr.length; i++)
        {
            add =add + arr[i];
        }
        System.out.println("The sum of the element in an array are :- "+add);
    }
}
