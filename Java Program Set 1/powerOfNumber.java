import java.util.Scanner;
import java.util.*;

public class powerOfNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int base = sc.nextInt();
        int expo = sc.nextInt();
        int result = (int) Math.pow(base , expo);
        System.out.println(result);
    }
}
