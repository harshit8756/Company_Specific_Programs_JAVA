import java.util.Scanner;

public class primeNumberInRange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int start = sc.nextInt();
        int end = sc.nextInt();
        for (int i = start; i <=end; i++)
        {
            if(isPrime(i))
            {
                System.out.println(i);
            }

        }

    } public static boolean isPrime(int n)
    {
        int count =0;
        if(n<2)
        {
            return false;
        }
        for(int i=2;i<n/2;i++)
        {
            if(n%i==0)
            {
                return false;
            }
        }
        return true;
    }
}
