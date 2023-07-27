import java.util.*;
public class armstrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int temp, remainder, result = 0, count = 0 ;
        temp = number;

// Finding the number of digits

        while (temp != 0)
        {
            temp /= 10;
            ++count;
        }

        temp = number;

// Checking if the number is armstrong

        while (temp != 0)
        {
            remainder = temp%10;
            result += Math.pow(remainder, count);
            temp /= 10;
        }

        if(result == number)
            System.out.print("Armstrong Number");
        else
            System.out.print("not armstrong number");

    }
}
