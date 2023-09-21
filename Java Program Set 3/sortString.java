import java.util.Arrays;
import java.util.Scanner;

public class sortString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        char[] ch = str.toCharArray();
        Arrays.sort(ch);
        System.out.println(ch);
    }
}
