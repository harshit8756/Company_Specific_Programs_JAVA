//We want to calculate the sum of sub array , if the numbers are positive in an array and
// if numbers is negative which are found in array then don't proceed further .
public class sumOfSubArrayNumberPositive {
    public static void main(String[] args) {
        int[] arr = {1,2,-1,-2,3,-4,5,6,7,};
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {
                break; // Stop if a negative number is encountered
            }
            sum += arr[i];
        }
        System.out.println(sum);
    }
}
