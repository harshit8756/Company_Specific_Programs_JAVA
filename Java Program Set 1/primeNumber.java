import java.util.Scanner;

public class primeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int i;
        for (i = 2; i <=num/2 ; i++)
        {
            if(num%i==0)
            {
                break;
            }
        }
        if(i>num/2)
        {
            System.out.println("Prime number");
        }
        else
        {
            System.out.println("Not a prime number");
        }

    }
}
