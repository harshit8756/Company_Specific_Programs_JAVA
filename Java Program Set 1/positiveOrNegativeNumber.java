import java.util.Scanner;

public class positiveOrNegativeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n>=0)
        {
            System.out.println("Number is positive");
        }
        else
        {
            System.out.println("number is negative");
        }

    }
}
