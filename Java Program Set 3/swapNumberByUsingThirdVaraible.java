import java.util.Scanner;

public class swapNumberByUsingThirdVaraible {
    public static void main(String[] args) {
        //Write a Java Program to swap two numbers using the third variable.
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int temp;
        temp = x;
        x=y;
        y=temp;
        System.out.println( x + " " + y);
    }
}
