import java.util.Scanner;

public class countNumberOf3s {
    static int count3s(int n)
    {
        int count = 0;
        while(n>0)
        {
            if(n%10==3)
            {
                System.out.println("the numbers are :" + n);
                count++;

            }
            n=n/10;
        }
        return count;
    }
    static int countInRange(int num)
    {
        int count = 0;
        for (int i = 2; i <=num ; i++) {
            count = count + count3s(i);


        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number : ");
        int number = sc.nextInt();
        System.out.println(countInRange(number));
    }
}
