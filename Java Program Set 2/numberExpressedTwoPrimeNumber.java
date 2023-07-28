import java.util.Scanner;

//Write a program to express a number as a sum of two prime numbers?
public class numberExpressedTwoPrimeNumber {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int count =0;
        for(int i =2;i<=number/2;i++)
        {
            if(isPrime(i) == 1)
            {
                if(isPrime(number-i) == 1)
                {
                    System.out.println(number + " = " + i + " + " + (number - i));
                    count =1;
                }
            }
        }
        if(count == 0)
        {
            System.out.println("Cannot be expressed as a sum of two prime nunber");
        }
    }
    public static int isPrime(int num)
    {
        int counnt = 1;
        for(int i =2;i<num;i++)
        {
            if(num%i==0)
            {
                counnt = 0;
                break;
            }
        }
        return counnt;
    }

}
