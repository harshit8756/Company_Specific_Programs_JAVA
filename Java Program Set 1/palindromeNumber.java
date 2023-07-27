import java.util.Scanner;

public class palindromeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int reverse = 0;
        int rem ;
        int temp=n;
        while(n>0)
        {
            rem = n%10;
            reverse = (reverse*10)+rem;
            n=n/10;
        }
        if(temp==reverse)
        {
            System.out.println("Palindrome number");
        }
        else
        {
            System.out.println("No palindome number");
        }
    }
}
