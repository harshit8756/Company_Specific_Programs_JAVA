public class targetElementFindInArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int target = 3;
        for (int i = 0; i < arr.length; i++)
        {
          if(target == arr[i])
          {
              System.out.println(target);
          }
        }
    }
}
