import java.util.Scanner;

public class swapNumberWithOutUsingThirdVariable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        x= x+y;
        y=x-y;
        x= x-y;
        System.out.println(x+" " + y);
    }
}
