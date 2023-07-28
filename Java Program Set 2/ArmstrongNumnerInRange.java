import java.util.Scanner;

public class ArmstrongNumnerInRange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        findArmstrongNumber(n1,n2);
    }
    public static void findArmstrongNumber(int a , int b)
    {
        for(int i = a ; i<=b;i++)
        {
           int num = i;
           int sum = 0;

           while (num!=0)
           {
               int rem = num%10;
               sum = sum + (rem*rem*rem);
               num = num/10;
           }
            if(sum==i)
            {
                System.out.println(sum);
            }

        }

    }
}
