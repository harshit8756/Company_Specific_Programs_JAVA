import java.util.Scanner;

public class lcmOfNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a , b , lcm , flag =1;
        a= sc.nextInt();
        b= sc.nextInt();
        // apply condition for the lcm
        lcm = (a>b)?a:b;
        while(flag==1)
        {
            if(lcm%a==0 && lcm%b==0)
            {
                System.out.println(lcm);
                flag=0;
                break;
            }
            ++lcm;
        }
    }
}
